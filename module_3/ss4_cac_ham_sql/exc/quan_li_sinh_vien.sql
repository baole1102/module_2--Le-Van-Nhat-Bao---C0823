CREATE DATABASE quan_ly_sinh_vien;
USE quan_ly_sinh_vien;

-- Class
create table class (
id int primary key auto_increment not null,
`name` varchar(60) not null,
start_date datetime not null,
`status` bit
);

-- Student
create table student(
id int primary key auto_increment not null,
`name` varchar(60) not null,
address varchar(50),
phone varchar(20),
`status` bit,
class_id int not null,
foreign key (class_id) references class (id)
);

-- Subject
create table subject (
id int primary key auto_increment not null,
`name` varchar(60) not null,
credit tinyint not null default 1 check (credit >= 1),
`status` bit default 1
);

-- Mark
create table mark (
id int primary key auto_increment not null,
subject_id int,
mark float default 0 check ( mark between 0 and 100),
student_id int,
exam_times tinyint default 1,
unique(subject_id,student_id),
foreign key (subject_id) references subject (id),
foreign key (student_id) references student (id)
);

-- class
insert into class
values (1, 'A1', '2008-12-20', 1),
(2, 'A2', '2008-12-22', 1),
(3, 'B3', current_date, 0);

-- student
insert into student (`name`, address, phone,`status`,class_id)
values ('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into student (`name`, address,`status`,class_id)
values ('Hoa', 'Hai phong', 1, 1);
insert into student (`name`, address, phone,`status`,class_id)
values ('Manh', 'HCM', '0123123123', 0, 2);

-- subject
insert into subject
values (1, 'CF', 5, 1),
 (2, 'C', 6, 1),
 (3, 'HDJ', 5, 1),
 (4, 'RDBMS', 10, 1);
 
 -- mark
 insert into mark (subject_id, student_id, mark, exam_times)
values (1, 1, 8, 1),
 (1, 2, 10, 2),
 (2, 1, 12, 1);
