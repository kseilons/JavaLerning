DECLARE @NumOfBooks int, @MinYear int, @MaxYear int;
SELECT @NumOfBooks =  Count(*), @MinYear= Min(BookYear), @MaxYear =  Max(BookYear) FROM Book;
print 'В таблице Book '+ cast(@NumOfBooks as varchar(5))+' книг, изданных с '+ cast(@MinYear as varchar(5))+' по '
 +cast(@MaxYear as varchar(5))+' годы.'