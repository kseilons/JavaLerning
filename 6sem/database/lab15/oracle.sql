--2
CREATE OR REPLACE FUNCTION get_corr_salary
(p_sal employees.salary%TYPE, p_jobid jobs.job_id%TYPE, p_msg OUT VARCHAR2)
RETURN employees.salary%TYPE
IS
  v_minsal jobs.min_salary%TYPE;
  v_maxsal jobs.max_salary%TYPE;
BEGIN
  SELECT min_salary, max_salary INTO v_minsal, v_maxsal
  FROM jobs
  WHERE job_id = p_jobid;
  
  IF p_sal BETWEEN v_minsal AND v_maxsal THEN
    RETURN p_sal;
  ELSIF p_sal > v_maxsal THEN
    p_msg := 'Зарплата была снижена до верхней границы' || p_jobid || '!';
    RETURN v_maxsal;
  ELSE
    p_msg := 'Зарплата была повышена до нижней границы' || p_jobid || '!';
    RETURN v_minsal;
  END IF;
EXCEPTION
  
  WHEN NO_DATA_FOUND THEN
    RETURN 0;
END;
/


SET SERVEROUTPUT ON

DECLARE
  v_msg VARCHAR2(150);
  v_sal employees.salary%TYPE;
  v_jobid jobs.job_id%TYPE := 'ST_MAN';
BEGIN
  --v_sal := 3500;
  --v_sal := 6500;
  v_sal := 9500;
  DBMS_OUTPUT.PUT_LINE('Исходное значение зарплаты: ' || v_sal);
  v_sal := get_corr_salary(v_sal, v_jobid, v_msg);
  DBMS_OUTPUT.PUT_LINE('Новое значение зарплаты: ' || v_sal);
  DBMS_OUTPUT.PUT_LINE(v_msg);
END;

--3 4
CREATE TABLE audit_emp (
  when DATE,
  what VARCHAR2(100));
ALTER SESSION SET nls_date_format = 'dd.mm.yyyy hh24:mi:ss';


CREATE OR REPLACE TRIGGER audit_emp_trig
AFTER INSERT OR UPDATE OR DELETE ON employees_temp
DECLARE
v_comment VARCHAR2(80) DEFAULT 'обновление таблицы employees_temp';
BEGIN
  IF INSERTING THEN
    v_comment := 'вставка строк в таблицу employees_temp';
  ELSIF DELETING THEN
    v_comment := 'удаление строк из таблицы employees_temp';--------------------------------------------------------------------------------------------------------------------------------------------';
  END IF;
  
  INSERT INTO audit_emp
  VALUES(SYSDATE, v_comment);
END;
/

UPDATE employees_temp
SET salary = -500
WHERE employee_id = 102;

--6

CREATE OR REPLACE TRIGGER corr_sal_trig
BEFORE UPDATE OF salary ON employees
FOR EACH ROW
DECLARE
  v_msg VARCHAR2(150);
  v_corr_sal employees.salary%TYPE := get_corr_salary(:NEW.salary, :NEW.job_id, v_msg);
BEGIN
  IF :NEW.salary != v_corr_sal THEN
    :NEW.salary := v_corr_sal;
    DBMS_OUTPUT.PUT_LINE(v_msg);
  END IF;
END;
/


UPDATE employees
SET salary = 10000
WHERE employee_id = 100;

UPDATE employees
SET job_id ='AD_ASST', salary = 5000
WHERE employee_id = 100;