SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE (job_id, salary) IN (SELECT job_id, max_salary FROM jobs);