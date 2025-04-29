CREATE TABLE #BookStatus(
StatusID int PRIMARY KEY,
StatusName varchar(50) NOT NULL UNIQUE);CREATE TABLE #Book(
  BookID int PRIMARY KEY,
  Author varchar(50),
  Title varchar(50) NOT NULL,
  Publisher varchar(50),
  BookYear int
)

DELETE FROM Book;