SELECT a.name 
FROM Employee a join Employee b
On a.id=b.managerId
Group BY b.managerId
Having count(*)>=5;
