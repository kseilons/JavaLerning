CREATE SCHEMA AUTHORIZATION asd
   CREATE VIEW заказы_за_неделю AS
      SELECT пз.номер_заказа "Номер заказа", пз.название_игры "Название игры"
           , пз.производитель "Производитель"
      FROM заказ з JOIN позиция_заказа пз ON (з.номер = пз.номер_заказа)
      WHERE з.создан BETWEEN TRUNC(SYSDATE, 'd') AND SYSDATE
   GRANT select ON заказы_за_неделю TO hr;