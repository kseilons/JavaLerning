UPDATE dept50
SET deptno = 80
WHERE employee = 'Matos';

UPDATE dept50
SET employee = 'Ivanov'
WHERE employee = 'Matos';

SELECT * FROM dept50;
ROLLBACK;