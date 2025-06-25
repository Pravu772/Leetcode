SELECT class
FROM Courses
GROUP BY class
having Count(class)>=5
