WITH cte AS 
(SELECT reports_to, COUNT(reports_to) AS reports_count, ROUND(AVG(age)) AS average_age
FROM Employees
WHERE reports_to IS NOT NULL
GROUP BY reports_to)
SELECT e.employee_id,e.name,c.reports_count,c.average_age
FROM cte c
LEFT JOIN Employees e
ON c.reports_to = e.employee_id
ORDER BY e.employee_id
