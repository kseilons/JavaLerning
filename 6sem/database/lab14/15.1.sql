DECLARE @NumBooks int, @MinYear int, @MaxYear int;
SET @NumBooks = (SELECT Count(*) FROM Book);
SET @MinYear = (SELECT Min(BookYear) FROM Book);
SET @MaxYear = (SELECT Max(BookYear) FROM Book);
print '� ������� Book '+ cast(@NumBooks as varchar(5))+' ����, �������� � '+ cast(@MinYear as varchar(5))+' �� '
 +cast(@MaxYear as varchar(5))+' ����.'