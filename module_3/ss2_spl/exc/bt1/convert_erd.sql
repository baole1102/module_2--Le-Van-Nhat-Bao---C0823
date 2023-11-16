create database convert_erd;
use convert_erd;
-- đây là phiếu xuất
create table bill(
id int primary key auto_increment not null,
`date` datetime
); 

-- vật tư
create table supplies(
id int primary key auto_increment not null,
`name` varchar(50)
);

-- chi tiết phiếu xuất
create table detail_bill(
price int not null,
bill_id int not null,
supplies_id int not null,
`number` int not null,
foreign key (bill_id) references bill (id),
foreign key (supplies_id) references supplies (id)
);

-- phiếu nhập
create table enter_coupon(
id int primary key auto_increment not null,
`date` datetime
);

-- chi tiết phiếu nhập
create table detail_enter_coupon(  
price int not null,
`number` int not null,
supplies_id int,
enter_coupon_id int,
foreign key (enter_coupon_id) references enter_coupon (id),
foreign key (supplies_id) references supplies (id)
);

-- đa trị số điện thoại
create table `number`(
`number` varchar(20) primary key not null,
supplier_id varchar(20),
foreign key (supplier_id) references supplier (id)
);

-- nhà cung cấp
create table supplier(
id int primary key auto_increment not null,
`name` varchar(50) not null,
address varchar(20) not null
);

-- đơn đặt hàng
create table `order` (
id int primary key auto_increment not null,
`date` datetime,
supplier_id int,
foreign key (supplier_id) references supplier (id)
);

-- chi tiết đơn đặt hàng
create table details_order(
supplies_id int,
order_id int,
unique(supplies_id,order_id ),
foreign key (order_id) references `order` (id),
foreign key (supplies_id) references supplies (id)
);




