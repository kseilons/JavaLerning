UPDATE BookInLib SET StatusID=StatusID+2
WHERE LibID = 2;

-- ���� update �� ��������� 
UPDATE BookInLib SET StatusID=StatusID+2
WHERE LibID = 1;

SELECT * FROM BookInLib;