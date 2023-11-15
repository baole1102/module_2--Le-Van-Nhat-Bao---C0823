CREATE DATABASE db_school ;
use db_school;

create table student(
student_id int primary key auto_increment,
`name` varchar (50),
age int,
country varchar(50),
class_id int,
foreign key (class_id) references class(class_id)
);
create table teacher(
teacher_id int primary key auto_increment,
`name` varchar (50),
age int,
country varchar(50),
class_id int,
foreign key (class_id) references class(class_id)
);
create table class(
class_id int primary key auto_increment,
`name` varchar (50)
);
insert into student (`name`,age,country)
values ("Bao",18,"Huế"),
("Độ",17,"Quãng Nam"),
("Vi",50,"Huế");

insert into teacher (`name`,age,country)
values ("Bao",18,"Huế"),
("Độ",17,"Quãng Nam"),
("Vi",50,"Huế");

insert into class (`name`)
values ("C0823G1"),
("C0723G1"),
("C0623G1");

-- delete from class
-- where class_id=1;

