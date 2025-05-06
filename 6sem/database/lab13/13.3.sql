SELECT COUNT(DISTINCT name) as NumOfFileGroups
FROM sys.filegroups
WHERE is_read_only=0;
