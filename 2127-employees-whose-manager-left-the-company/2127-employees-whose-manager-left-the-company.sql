Select employee_id
From Employees
Where salary<30000 AND manager_id NOT IN(
    Select employee_id
    From Employees
)
Order By employee_id;