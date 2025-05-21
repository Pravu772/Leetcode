# Write your MySQL query statement below
SELECT e.name,b.bonus
FROM Employee e left Join Bonus b ON e.empId=b.empId
Where b.bonus<1000 OR b.bonus IS null;