SELECT employee_id, last_name, hire_date
     , TRUNC(MONTHS_BETWEEN(sysdate, hire_date)/12) years_worked
FROM employees