WITH cte as (
SELECT *,LEAD(num,1) OVER() AS next,LEAD(num,2) OVER() AS nex2next
FROM Logs)
SELECT DISTINCT (CASE 
            WHEN next = num and nex2next = num THEN num
            END
            ) AS ConsecutiveNums
FROM cte
WHERE (CASE 
            WHEN next = num and nex2next = num THEN num
            END) IS NOT NULL