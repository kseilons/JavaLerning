UPDATE BookInLib SET StatusID=StatusID+2
WHERE LibID = 2;

-- этот update не сработает 
UPDATE BookInLib SET StatusID=StatusID+2
WHERE LibID = 1;

SELECT * FROM BookInLib;