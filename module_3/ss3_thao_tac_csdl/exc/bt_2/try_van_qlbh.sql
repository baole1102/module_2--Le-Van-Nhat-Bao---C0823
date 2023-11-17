-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select o.id,o.`date`,o.total_price
from `order` o;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select  c.`name`,c.id,group_concat(p.`name`) as 'san pham'
from customer c
 join `order` o  on c.id = o.customer_id
 join order_detail od  on o.id = od.order_id
 join product p on od.product_id = p.id
 group by c.id;
 
 SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
 
 -- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select  *
from customer c
left join `order` o  on c.id = o.customer_id
where o.customer_id is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
select c.`name`,p.`name`,o.id, o.`date`,p.price*od.od_qty as 'Giá bán'
from customer c
 join `order` o  on c.id = o.customer_id
 join order_detail od  on o.id = od.order_id
 join product p on od.product_id = p.id;