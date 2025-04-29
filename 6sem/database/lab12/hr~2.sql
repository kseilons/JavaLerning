SELECT employee_id, last_name, first_name, job_id, salary, manager_id, department_id
FROM employees
WHERE manager_id IS NULL
OR department_id IS NULL;