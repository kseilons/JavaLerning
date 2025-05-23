DECLARE
  TYPE dept_rec IS RECORD (
    id departments.department_id%TYPE,
    name departments.department_name%TYPE,
    street locations.street_address%TYPE,
    city locations.city%TYPE);
  r_dept dept_rec;
  v_deptid departments.department_id%TYPE NOT NULL:= 100;
BEGIN
  WHILE v_deptid <= 300 LOOP
    SELECT d.department_id, d.department_name, l.street_address, l.city
    INTO r_dept.id, r_dept.name, r_dept.street, r_dept.city
    FROM departments d LEFT JOIN locations l USING(location_id)
    WHERE d.department_id = v_deptid;
    
    DBMS_OUTPUT.PUT_LINE('Отдел ' || r_dept.id || ' (' || r_dept.name || ') расположен по адресу: ' || r_dept.street || ', ' || r_dept.city);
    
    v_deptid := v_deptid + 10;
  END LOOP;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    IF v_deptid = 300
      THEN DBMS_OUTPUT.PUT_LINE('Отдела ' || v_deptid || ' не существует');
    ELSE
      DBMS_OUTPUT.PUT_LINE('Отделов не существует');
    END IF;
END;