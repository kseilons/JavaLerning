DECLARE @NumOfBooks int, @MinYear int, @MaxYear int;
SELECT @NumOfBooks =  Count(*), @MinYear= Min(BookYear), @MaxYear =  Max(BookYear) FROM Book;
print '� ������� Book '+ cast(@NumOfBooks as varchar(5))+' ����, �������� � '+ cast(@MinYear as varchar(5))+' �� '
 +cast(@MaxYear as varchar(5))+' ����.'