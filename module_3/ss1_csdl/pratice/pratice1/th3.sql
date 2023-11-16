create database manage_student;
use manage_student;

create table class(
class_id int primary key auto_increment not null,
class_name varchar(60) not null,
class_start_date datetime not null,
class_status bit
);

create table student(
student_id int primary key auto_increment not null,
student_name varchar(30) not null,
student_address varchar(50),
student_phone varchar(20),
student_status bit, 
class_id int,
foreign key (class_id) references class (class_id)
);

create table `subject` (
subject_id int primary key auto_increment not null,
subject_name varchar(30) not null,
subject_credit tinyint not null default 1 check(subject_credit >=1),
subject_status bit default 1
);

create table mark(
mark_id int primary key auto_increment not null,
subject_id int not null,
student_id int not null,
mark float default 0 check(mark between 0 and 100),
mark_examtimes tinyint default 1,
unique(subject_id,student_id),
foreign key (subject_id) references `subject` (subject_id),
foreign key (student_id) references student (student_id)
);