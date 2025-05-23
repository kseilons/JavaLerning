DECLARE @MinYear int, @MaxYear int, @I int;
SELECT  @MinYear= Min(BookYear), @MaxYear =  Max(BookYear) FROM Book;
SET @I=@MinYear-1
 WHILE @I<@MaxYear
   BEGIN
   SET @I=@I+1;
   IF @I=2005 BREAK;
   SELECT * FROM Book WHERE BookYear=@I;
   END;