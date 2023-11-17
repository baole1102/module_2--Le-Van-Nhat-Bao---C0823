-- Cau 1
-- select *
-- from student

-- Cau 2
-- select * 
-- from student
-- where Status = true;

-- Cau 3
-- select * 
-- from subject
-- where credit > 10;

-- cau 4
-- select s.* ,c.ClassName
-- from student s
-- join class c on s.ClassID = c.ClassID
-- having c.ClassName = 'A1';

-- cau 5
select student.*,mark.SubId,subject.SubName,subject.SubId
from student
right join mark on student.StudentId = mark.StudentId
left join subject on mark.SubId = subject.SubId
having subject.SubId = 1;

