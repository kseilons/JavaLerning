UPDATE BookInLib
SET StatusID=StatusID+2
WHERE LibID IN (1,3);

SELECT * FROM BookInLib;