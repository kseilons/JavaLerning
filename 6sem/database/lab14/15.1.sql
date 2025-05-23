DECLARE @NumBooks int, @MinYear int, @MaxYear int;
SET @NumBooks = (SELECT Count(*) FROM Book);
SET @MinYear = (SELECT Min(BookYear) FROM Book);
SET @MaxYear = (SELECT Max(BookYear) FROM Book);
print 'В таблице Book '+ cast(@NumBooks as varchar(5))+' книг, изданных с '+ cast(@MinYear as varchar(5))+' по '
 +cast(@MaxYear as varchar(5))+' годы.'