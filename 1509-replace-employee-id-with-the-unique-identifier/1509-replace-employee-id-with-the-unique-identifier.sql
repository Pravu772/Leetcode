# Write your MySQL query statement below
SELECT u.unique_id,e.name
FROM Employees e LEFT Join EmployeeUNI u ON e.id=u.id;
