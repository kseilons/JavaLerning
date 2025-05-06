
CREATE VIEW emp_view AS
(SELECT e.employee_id emp_id, e.last_name emp_lastname
    , m.employee_id man_id, m.last_name man_lastname
      , d.department_name
 FROM employees e JOIN employees m ON (e.manager_id = m.employee_id)
 JOIN departments d ON (e.department_id = d.department_id));
