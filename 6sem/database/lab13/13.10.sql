SELECT count(*) as NumOfViews 
FROM sys.schemas sc INNER JOIN sys.views sv on sc.schema_id = sv.schema_id
WHERE sc.name = 'newsch';