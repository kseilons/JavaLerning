CREATE OR REPLACE view dept50 AS
SELECT employee_id empno, last_name employee, department_id deptno
FROM employees
WHERE department_id = 50
WITH CHECK OPTION;