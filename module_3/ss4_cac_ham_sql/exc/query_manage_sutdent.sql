-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *
from subject 
where credit in(
select max(credit)
from subject
);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select *
from subject su
join mark m on su.id = m.subject_id
where m.mark in (
select max(mark)
from mark
);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select *,avg(m.mark) as 'trung binh'
from student s
left join mark m on s.id = m.student_id
group by s.id
order by m.mark desc
