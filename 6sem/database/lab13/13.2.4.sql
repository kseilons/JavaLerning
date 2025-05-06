
SELECT owner || '.' || table_name full_table_name
FROM all_tables
MINUS
SELECT USER ||'.' || table_name
FROM user_tables;
--таблица DUAL принадлежит администратору SYS