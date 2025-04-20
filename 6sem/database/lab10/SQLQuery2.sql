Use [MyLib];
GO


CREATE TABLE [dbo].[Book](
	[BookId] int IDENTITY(1,1) PRIMARY KEY,
	[Author] varchar(100),
	[Title] varchar(255) NOT NULL,
	[Publisher] varchar(50),
	[BookYear] smallint )

GO

CREATE TABLE dbo.BookStatus(
	StatusID int IDENTITY(1,1) PRIMARY KEY,
	StatusName varchar(50) NOT NULL UNIQUE);


GO

CREATE TABLE dbo.BookInLib(
	LibID int PRIMARY KEY,
	BookID int NOT NULL,
	StatusID int NOT NULL)
GO


ALTER TABLE dbo.BookInLib ADD FOREIGN KEY (BookID)
REFERENCES dbo.Book(BookID);
GO

ALTER TABLE dbo.BookInLib ADD FOREIGN KEY(StatusID)
REFERENCES dbo.BookStatus(StatusID);
GO

ALTER TABLE dbo.Book ADD CONSTRAINT ck_year CHECK ([BookYear] between 1000 and Year(GetDate()))
