IF OBJECT_ID('tempdb.dbo.#Books') IS NOT NULL DROP TABLE #Books;
--может также использоваться
--IF OBJECT_ID('tempdb..#Books') IS NOT NULL DROP TABLE #Books;
CREATE TABLE #Books ([BookId] int PRIMARY KEY,
	[Author] varchar(100),
	[Title] varchar(255) NOT NULL,
	[Publisher] varchar(50),
	[BookYear] smallint );
INSERT INTO #Books (BookId,Author,Title,Publisher,BookYear)
SELECT BookId, Author, Title, 
       CASE 
	    WHEN Publisher='Политехника' THEN Publisher
		WHEN Publisher IS NULL THEN 'издательства нет'
		ELSE 'издательство не Политехника'
	   END,
	   BookYear
FROM Book;
SELECT * FROM #Books;
GO
SELECT * FROM #Books;