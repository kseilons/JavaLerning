
IF OBJECT_ID('tempdb.dbo.#T') IS NOT NULL
DROP TABLE dbo.#T

CREATE TABLE #T (BookID int primary key, 
Author varchar(100),
Title varchar(255),
Publisher varchar(50),
BookYear smallint,
BookNum int
); 

INSERT INTO #T (BookID, Author, Title, Publisher, BookYear)
 SELECT BookId, Author, Title, Publisher, BookYear
 FROM dbo.Book;

 select * from #T;


IF OBJECT_ID('dbo.fBookNum') is not null
	drop function dbo.fBookNum;
 go

 CREATE FUNCTION dbo.fBookNum (@BoID int) RETURNS int
 AS
 BEGIN
  DECLARE @I int;
  SET @I = ( SELECT count(*) 
         FROM dbo.Book INNER JOIN dbo.BookInLib ON dbo.Book.BookId = dbo.BookInLib.BookID
          WHERE dbo.Book.BookId = @BoID);
  RETURN @I;
 END ;
 go
  print dbo.fBookNum(3)


 UPDATE #T SET #T.BookNum = dbo.fBookNum(#T.BookID);

 SELECT * FROM #T

 DECLARE @MaxBookNum int;
 SET @MaxBookNum = (SELECT max(#T.BookNum) FROM #T);
 print @MaxBookNum;
 GO



 DECLARE @T1 TABLE (BookID int primary key, 
Author varchar(100),
Title varchar(255),
Publisher varchar(50),
BookYear smallint,
BookNum int ); 

INSERT INTO @T1 (BookID, Author, Title, Publisher, BookYear, BookNum)
SELECT BookID, Author, Title, Publisher, BookYear, BookNum
FROM #T;
SELECT * FROM #T;
SELECT * FROM @T1;
GO
SELECT * FROM #T;
SELECT * FROM @T1;



CREATE PROC dbo.PBookNum (@StatusName varchar(50), @result int OUTPUT) AS
 BEGIN
 IF @StatusName IS NULL RETURN -1
  ELSE IF EXISTS(SELECT * FROM dbo.BookStatus WHERE StatusName=@StatusName) 
         BEGIN
		  SET @result=(SELECT count(*) FROM dbo.BookStatus INNER JOIN dbo.BookInLib ON 
		                   (dbo.BookStatus.StatusID = dbo.BookInLib.StatusID)
				       WHERE dbo.BookStatus.StatusName = @StatusName);         
		  RETURN 0;
		 END
       ELSE BEGIN
	           INSERT INTO dbo.BookStatus (StatusName) values (@StatusName);
			   SET @result=0;
			   RETURN 1;
	        END;

 END;
GO
DECLARE @ret int, @res int;
exec @ret =  dbo.PBookNum 'выдана', @res out;
 if @ret=-1 print 'вы не ввели название статуса'
   else if @ret=0 print 'Число книг '+ CAST(@res as varchar(20))
         else if @ret=1 print 'В таблицу добавлен новый статус';
GO


CREATE TRIGGER CheckNum On dbo.BookInLib
AFTER INSERT, UPDATE
AS BEGIN
    IF EXISTS (SELECT b.BookID FROM dbo.BookInLib b INNER JOIN inserted i on b.BookID=i.BookID
	           GROUP BY b.BookID 
			   HAVING count(distinct b.LibID)>5)
	 BEGIN
	  RAISERROR ('Экземпляров книги должно быть не больше 5',1,1);
	  ROLLBACK TRANSACTION
	 END
   END
go

SELECT * FROM [dbo].[BookInLib];

INSERT INTO [dbo].[BookInLib]
VALUES (10,1,1), (11,1,2), (12,2,1), (13,1,2),(14,1,1),(15,1,2);

SELECT * FROM [dbo].[BookInLib];

INSERT INTO [dbo].[BookInLib]
VALUES (16,1,1);

update dbo.BookInLib set BookID=1;

update dbo.BookInLib set BookID=3
where LibID=10;

GO

-- DDL триггер, запрещающий менять и удалять таблицы и представления

CREATE TRIGGER StopDropAlter
ON DATABASE
AFTER DROP_TABLE, ALTER_TABLE, DROP_VIEW, ALTER_VIEW
AS
BEGIN
 RAISERROR ('В этой базе нельзя удалять и менять таблицы и представления',10,1);
 ROLLBACK TRANSACTION
END;
GO

--проверяем, на ALTER должен сработать триггер
ALTER TABLE dbo.BookInLib
ADD NewInt INT;
GO

--- что произойдет с временной таблицей и почему? (где создаются временые таблицы?)
DROP TABLE dbo.#T
GO

