WITH
deptsal AS
  (SELECT department_name, SUM(salary) sumsal
   FROM employees JOIN departments USING(department_id)
   GROUP BY department_id, department_name),
compsal AS
  (SELECT SUM(salary) sumsal FROM employees)
SELECT department_name, sumsal
FROM deptsal
WHERE sumsal*8 > (SELECT sumsal FROM compsal);