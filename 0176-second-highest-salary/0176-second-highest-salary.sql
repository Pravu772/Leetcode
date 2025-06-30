SELECT MAX(salary) as SecondHighestSalary
FROM Employee
Where salary <(
    SELECT MAX(salary)
    FROM Employee
)