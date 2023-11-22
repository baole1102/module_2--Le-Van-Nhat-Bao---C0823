create database demo;
use demo;
create table products  (
	id int auto_increment primary key,
	product_code varchar(50) not null,
	product_name varchar(50) not null,
	product_price double not null,
	product_amount int not null,
	product_description varchar(50) not null,
	product_status bit
);
insert into products (product_code, product_name, product_price, product_amount, product_description, product_status)
values
    ('P1', 'Product A', 19.99, 100, 'Description for Product A', 1),
    ('P2', 'Product B', 29.99, 50, 'Description for Product B', 1),
    ('P3', 'Product C', 9.99, 200, 'Description for Product C', 0),
    ('P4', 'Product D', 39.99, 75, 'Description for Product D', 1),
    ('P5', 'Product E', 49.99, 30, 'Description for Product E', 1);
    
-- Buoc 3
    
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index index_code on products (product_code);


-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create unique index double_index_code on products (product_name,product_price);


-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from products where product_code = 'P1';
explain select * from products where product_name = 'Product A' and product_price = 19.99;

-- So sánh câu truy vấn trước và sau khi tạo index
select * from products where product_code = 'P1';

explain select * from products where product_code = 'P1';


-- Buoc 4
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view customer_views as
select product_code,product_name,product_price,product_status
from products;

select *
from products;

-- Tiến hành sửa đổi view
update customer_views
set product_name = 'Product Bao'
where  product_name = 'Product A';

-- Tiến hành xoá view
drop view customer_views;

-- Buoc 5
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure procedure_products ()
begin
select * 
from products;
end 
// delimiter ;

call procedure_products();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure add_procedure_products (
	in code varchar(50),
	in name varchar(50),
	in price double,
	in amount int,
	description varchar(50),
	status bit
    )
begin
insert into products (product_code, product_name, product_price, product_amount, product_description, product_status)
values (code,name, price,amount,description,status);
end 
// delimiter ;

call add_procedure_products('P6', 'Product X', 50, 40, 'Description for Product X', 1);

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure edit_products (e_id int,
e_code varchar(50) ,e_name varchar(50),e_status bit)
begin 
update products
set product_code = e_code, product_name = e_name , product_status = e_status
where products.id = e_id ;
end
// delimiter ;

drop procedure edit_products;
call edit_products (2,'P2','Product BOA',1);


-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_products (d_id int)
begin 
delete from products
where products.id = d_id ;
end
// delimiter ;

call delete_products (2);