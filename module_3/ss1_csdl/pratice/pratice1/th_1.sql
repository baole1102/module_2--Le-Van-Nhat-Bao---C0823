create database `order`;
use `order`;	
create table `client` (
client_id int primary key auto_increment,
`name` varchar(50) not null,
`number` int not null,
address varchar(50) not null
);
create table orders (
orders_id int primary key auto_increment not null,
`name` varchar(50) not null
);
create table contain1(
client_id int,
orders_id int,
foreign key(client_id) references `client`(client_id),
foreign key(orders_id) references orders (orders_id)
);
create table receiver (
receiver_id int primary key auto_increment not null,
`name` varchar(50) not null
);
create table contain2(
client_id int,
receiver_id int,
foreign key(client_id) references `client`(client_id),
foreign key(receiver_id) references receiver (receiver_id)
);
create table product(
product_id int primary key auto_increment,
`name` varchar(50) not null,
unit char (5) not null,
decripstion varchar(50) not null
);


create table `order`(
stt int primary key auto_increment,
`name` varchar(50) not null,
`number` int default 0,
product_id int,
orders_id int,
foreign key(product_id) references product(product_id),
foreign key(orders_id) references orders (orders_id)
);
create table deliver(
deliver_id int primary key auto_increment,
`name` varchar(50)
);
create table address_delivery(
address_delivery_id int primary key auto_increment,
`name` varchar(50)
);
create table delivery (
delivery_date date not null,
count int default 0,
price float not null,
number_pg int not null,
deliver_id int,
receiver_id int,
product_id int,
address_delivery_id int,
foreign key(deliver_id) references deliver(deliver_id),
foreign key(receiver_id) references receiver (receiver_id),
foreign key(product_id) references product(product_id),
foreign key(address_delivery_id) references address_delivery (address_delivery_id)
);


