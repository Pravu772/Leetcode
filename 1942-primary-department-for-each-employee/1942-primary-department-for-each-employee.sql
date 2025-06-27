Select employee_id,department_id
From Employee
Where primary_flag ='Y' or employee_id IN (
    Select employee_id
    From Employee
    group by employee_id
    Having Count(employee_id)=1
)