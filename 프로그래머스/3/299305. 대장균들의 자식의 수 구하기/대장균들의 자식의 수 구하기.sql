-- 코드를 작성해주세
SELECT P.ID, 
# C.*
    CASE
        WHEN C.PARENT_ID IS NULL THEN 0
        ELSE COUNT(*)
    END AS CHILD_COUNT
FROM ECOLI_DATA AS P 
LEFT JOIN ECOLI_DATA AS C
ON P.ID=C.PARENT_ID
GROUP BY P.ID
ORDER BY P.ID