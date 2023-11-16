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
date datetime,
total_price int not null,
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
order_id int not null,
product_id int not null,
foreign key (order_id) references `order`(id),
foreign key (product_id) references product(id)
);