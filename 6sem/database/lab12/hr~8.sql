SELECT department_id, d.department_name, d.location_id, ROUND(AVG(NVL(e.salary, 0)), 2) avgsal
FROM employees e RIGHT JOIN departments d USING (department_id)
WHERE department_name LIKE '%n_'
GROUP BY department_id, d.department_name, d.location_id
ORDER BY department_id;