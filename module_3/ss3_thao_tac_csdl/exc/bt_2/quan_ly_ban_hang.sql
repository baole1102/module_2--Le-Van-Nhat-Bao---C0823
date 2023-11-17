create database sales_manager;
use sales_manager;

-- khách hàng
create table customer(
id int primary key auto_increment not null,
`name` varchar(50) not null,
age varchar(3) not null
);

-- đơn đặt hàng
create table `order`(
id int primary key auto_increment not null,
`date` datetime,
total_price int  ,
customer_id int not null,
foreign key (customer_id) references customer(id)
);

-- sản phẩm
create table product(
id int primary key auto_increment not null,
`name` varchar(50) not null,
price float default 0
);

-- chi tiết đơn đặt 
create table order_detail(
od_qty int not null,
order_id int not null,
product_id int not null,
primary key (order_id,product_id),
foreign key (order_id) references `order`(id),
foreign key (product_id) references product(id)

);

insert into customer (`name`,age)
values ('Minh Quan',10),
 ('Ngoc Oanh',20),
  ('Hong Ha',50);
  
insert into `order` (customer_id,`date`,total_price)
values (1,'2006-3-21',null),
(2,'2006-3-23',null),
(1,'2006-3-16',null);

insert into product (`name`,price)
values ('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);

insert into order_detail(order_id,product_id,od_qty)
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
