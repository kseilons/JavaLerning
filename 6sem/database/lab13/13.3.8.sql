CREATE OR REPLACE VIEW emp AS
SELECT employee_id, last_name, first_name, email, job_id, manager_id, department_id
FROM employees;
--дадим привилегии на выборку данных из представления пользователю oraclelabs
GRANT SELECT ON emp TO C##oraclelabs;
--и отберём у него привилегии на выборку данных из таблицы employees
REVOKE SELECT ON employees FROM C##oraclelabs;
