drop database if exists furuma;
create database if not exists furuma;
use furuma;
-- Trình độ nhân viên
create table `level` (
id int primary key auto_increment not null,
`name` varchar (45) 
);

-- Vị trị nhân viên
create table position (
id int primary key auto_increment ,
`name` varchar(45)
);

-- Bộ phận làm việc
create table part (
id int primary key auto_increment,
`name` varchar(45)
);

-- Employee
create table employee(
id int primary key auto_increment not null,
`name` varchar(45) not null,
birthday date ,
identify varchar(45) not null,
saraly double,
`number` varchar(45) not null,
email varchar(45) not null,
address varchar(45) not null,
position_id int,
level_id int,
part_id int,
foreign key (position_id) references position (id),
foreign key (level_id) references `level` (id),
foreign key (part_id) references part (id)
);

-- loại khách hàng
create table type_customer(
id int primary key auto_increment not null,
`name` varchar(45) not null
);

-- Khách hàng
create table customer(
id int primary key auto_increment not null,
`name` varchar(45) not null,
birthday date not null,
gender bit default 1,
identify varchar(45) not null,
`number` varchar(45) not null,
address varchar(45) not null,
email varchar(45) not null,
type_customer_id int,
foreign key (type_customer_id) references type_customer(id)
);

-- Loại dịch vụ
create table type_service(
id int primary key auto_increment not null,
`name` varchar(45) not null
);

-- Kiểu thuê
create table type_retail(
id int primary key auto_increment not null,
`name` varchar(45) not null
);

-- Dịch vụ
create table service(
id int primary key auto_increment not null,
`name` varchar(45) not null,
acreage_room int ,
expense double not null,
amount_peson int not null,
stardard_room varchar(45),
description_convinient varchar(45) ,
acreage_pool double ,
number_floor int ,
free_service text ,
type_service_id int,
type_retail_id int,
foreign key (type_service_id) references type_service (id),
foreign key (type_retail_id) references type_retail (id)
);

-- Hợp đồng
create table contract(
id int primary key auto_increment,
start_day datetime,
end_day datetime,
deposite_money double,
employee_id int,
customer_id int,
service_id int,
foreign key (employee_id) references employee (id),
foreign key (customer_id) references customer (id),
foreign key (service_id) references service (id)
);	

-- Dịch vụ đi kèm
create table companied_service(
id int primary key auto_increment not null,
`name` varchar (45) not null,
price double,
unit varchar(10),
`status` varchar (45)
);

-- Hợp đồng chi tiết
create table contract_detail(
id int primary key auto_increment not null,
count int not null,
contract_id int,
companied_service_id int,
foreign key (companied_service_id) references companied_service(id),
foreign key (contract_id) references contract(id)
);

-- Trình độ
insert into `level` (`name`)
values('Trung cấp'),
('Cao đẳng'),
('Đại học'),
('Sau đại học');

-- Vị trí
insert into position (`name`)
values ('Quản lý'),
('Nhân viên');

-- Bộ Phận
insert into part (`name`)
values ('Sale-Marketing'),
('Hành chính'),
('Phục vụ'),
('Quản lý');

-- Loại khách
insert into type_customer(`name`)
values ('Diamond'),
('Platinium'),
('Gold'),
('Silver'),
('Member');

-- Loại dịch vụ
insert into type_service(`name`)
values ('Villa'),
('House'),
('Room');

-- Kiểu thuê
insert into type_retail(`name`)
values ('year'),
('month'),
('day'),
('hour');

-- Dịch vụ đi kèm
insert into companied_service (`name`,price,unit,`status`)
values ('Karaoke',10000,'giờ','tiện nghi, hiện tại'),
('Thuê xe máy',10000,'chiếc','hỏng 1 xe'),
('Thuê xe đạp',20000,'chiếc','tốt'),
('Buffet buổi sáng',15000,'suất','đầy đủ đồ ăn, tráng miệng'),
('Buffet buổi trưa',90000,'suất','đầy đủ đồ ăn, tráng miệng'),
('Buffet buổi tối',16000,'suất','đầy đủ đồ ăn, tráng miệng');

-- Dịch vụ
insert into service(`name`,acreage_room,expense,amount_peson,stardard_room,description_convinient,acreage_pool,number_floor,free_service,type_retail_id,type_service_id)
values ('Villa Beach Front',25000,10000000,10,'vip','Có hồ bơi',500,null,4,3,1),
('House Princess 01',14000,5000000,7,'vip','Có thêm bếp nướng',null,null,3,2,2),
('Room Twin 01',5000,1000000,2,'normal','Có tivi',null,null,'1 Xe máy, 1 Xe đạp',4,3),
('Villa No Beach Front',22000,9000000,8,'normal','Có hồ bơi',300,3,null,3,1),
('House Princess 02',10000,4000000,5,'normal','Có thêm bếp nướng',null,2,null,3,2),
('Room Twin 02',3000,900000,2,'normal','Có tivi',null,null,'1 Xe máy',4,3);

-- Nhân viên
insert into employee(`name`,birthday,identify,saraly,`number`,email,address,position_id,level_id,part_id)
values ('Nguyễn Văn An','1970-11-07','456231786',10000000,'0901234121','annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1),
('Lê Văn Bình','1997-04-09','654231234',7000000,'0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),
('Hồ Thị Yến','1995-12-12','999231723',14000000,'0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),
('Võ Công Toản','1980-04-04','123231365',17000000,'0374443232','toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4),
('Nguyễn Bỉnh Phát','1999-12-09','454363232',6000000,'0902341231','phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1),
('Khúc Nguyễn An Nghi','2000-11-08','964542311',7000000,'0978653213','annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3),
('Nguyễn Hữu Hà','1993-01-01','534323231',8000000,'0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2),
('Nguyễn Hà Đông','1989-09-03','234414123',9000000,'0642123111','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4),
('Tòng Hoang','1982-09-03','256781231',6000000,'0245144444','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4),
('Nguyễn Công Đạo','1994-01-08','755434343',8000000,'0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2);

-- Khách Hàng
insert into customer(`name`,birthday,gender,identify,`number`,email,address,type_customer_id)
values ('Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5),
('Phạm Xuân Diệu','1992-08-08',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3),
('Trương Đình Nghệ','1990-02-27',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
('Dương Văn Quan','1981-07-08',1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1),
('Hoàng Trần Nhi Nhi','1995-12-09',0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4),
('Tôn Nữ Mộc Châu','2005-12-06',0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4),
('Nguyễn Mỹ Kim','1984-04-08',0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1),
('Nguyễn Thị Hào','1999-04-08',0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
('Trần Đại Danh','1994-07-01',1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
('Nguyễn Tâm Đắc','1989-07-01',1,'344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);


-- Hợp đồng
insert into contract (start_day,end_day,deposite_money,employee_id,customer_id,service_id)
values ('2020-12-08','2020-12-08',0,3,1,3),
('2020-07-14','2020-07-21',200000,7,3,1),
('2021-03-15','2021-03-17',50000,3,4,2),
('2021-01-14','2021-01-18',100000,7,5,5),
('2021-07-14','2021-07-15',0,7,2,6),
('2021-06-01','2021-06-03',0,7,7,6),
('2021-09-02','2021-09-05',100000,7,4,4),
('2021-06-17','2021-06-18',150000,3,4,1),
('2020-11-19','2020-11-19',0,3,4,3),
('2021-04-12','2021-04-14',0,10,3,5),		
('2021-04-25','2021-04-25',0,2,2,1),
('2021-05-25','2021-05-27',0,7,10,1);

-- Hợp đồng chi tiết
insert into contract_detail(count,contract_id,companied_service_id)
values (5,2,4),
(8,2,5),
(15,2,6),
(1,3,1),
(11,3,2),
(1,1,3),
(2,1,2),
(2,12,2);
