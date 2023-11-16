create database th2;
use th2;

create table student(
student_id varchar(20) primary key ,
student_name varchar(50),
student_birthday datetime,
student_class varchar(20),
student_gt varchar (20)
);

create table object(
object_id varchar(20) primary key,
object_name varchar(50),
object_code varchar(20)
);

create table sheet(
student_id varchar(20),
object_id varchar(20),
sheet_score int,
sheet_date datetime,
primary key(student_id,object_id),
foreign key(student_id) references student(student_id),
foreign key(object_id) references object(object_id)
);

create table teacher(
teacher_id varchar(20) primary key,
teacher_name varchar(20),
teacher_number varchar(10)
);

ALTER TABLE object ADD CONSTRAINT  FOREIGN KEY (teacher_id) REFERENCES teacher(teacher_id);
