SELECT Title
FROM Book
WHERE 
  BookYear > 1999
  AND (
    Author LIKE '�%'
    OR Publisher LIKE '%�'
  )
ORDER BY Title DESC;