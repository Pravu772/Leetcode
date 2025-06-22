SELECT s.student_id,s.student_name,s1.subject_name,count(e.subject_name) as attended_exams
FROM Students s CROSS Join Subjects s1 LEFT Join Examinations e ON s.student_id=e.student_id AND s1.subject_name=e.subject_name
GROUP BY s.student_id,s.student_name,s1.subject_name
Order BY s.student_id,s.student_name,s1.subject_name;
