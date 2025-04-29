SELECT department_id, COUNT(employee_id) emp_cnt
FROM employees
GROUP BY department_id
HAVING COUNT(employee_id) > 10
ORDER BY emp_cnt DESC;