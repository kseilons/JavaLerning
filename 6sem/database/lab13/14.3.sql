BEGIN TRAN Tr1
UPDATE BookInLib SET StatusID=StatusID+2
WHERE LibID = 1;
INSERT INTO BookInLib VALUES (5,2,2);
ROLLBACK TRAN Tr1;
SELECT * FROM BookInLib;