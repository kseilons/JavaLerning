SELECT Title
FROM Book
WHERE 
  BookYear > 1999
  AND (
    Author LIKE 'Ã%'
    OR Publisher LIKE '%à'
  )
ORDER BY Title DESC;