SELECT first_name, salary
FROM hremp
WHERE employee_id = 135;

UPDATE hremp
SET first_name = 'Ivan', salary = salary - 200
WHERE employee_id = 135;
--никакие данные не были обновлены, т.к. команда завершилась неудачей.

UPDATE hremp
SET first_name = 'Ivan'
WHERE employee_id = 135;
ROLLBACK;