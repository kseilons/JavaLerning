SELECT last_name, first_name
      ,NVL((SELECT department_name FROM departments d WHERE e.employee_id = d.manager_id), 'не является руководителем отдела') deptname
FROM employees e
UNION ALL
SELECT 'Общее число ', 'руководителей отделов:', TO_CHAR(COUNT(*))
FROM employees e JOIN departments d ON (e.employee_id = d.manager_id);