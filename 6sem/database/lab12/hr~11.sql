SELECT employee_id, last_name
FROM employees
WHERE employee_id != ALL (SELECT manager_id FROM employees WHERE manager_id IS NOT NULL);
