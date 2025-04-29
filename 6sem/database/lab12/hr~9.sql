SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE manager_id IN (SELECT employee_id FROM employees WHERE last_name = 'Cambrault');