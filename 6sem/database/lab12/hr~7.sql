SELECT e.employee_id empid, e.last_name empname, NVL(m.employee_id, 0) manid, NVL(m.last_name, 'не имеет') manname
FROM employees e LEFT JOIN employees m
ON (e.manager_id = m.employee_id)
ORDER BY empid;