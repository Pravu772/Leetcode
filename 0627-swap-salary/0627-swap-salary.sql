# Write your MySQL query statement below
update Salary set sex=(Case When sex='f' then 'm' else 'f' END);