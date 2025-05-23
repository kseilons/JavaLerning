DECLARE @MinYear int, @MaxYear int, @I int;
SELECT  @MinYear= Min(BookYear), @MaxYear =  Max(BookYear) FROM Book;
SET @I=@MinYear
 WHILE @I<=@MaxYear
   BEGIN
   SELECT * FROM Book WHERE BookYear=@I;
   SET @I=@I+1;
   END;