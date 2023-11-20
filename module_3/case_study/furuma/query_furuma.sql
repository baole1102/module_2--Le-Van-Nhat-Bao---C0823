-- Task 2
select *
from employee e
where substring_index(e.`name`," ",1) like "H%" 
or substring_index(e.`name`," ",1) like "T%"
or substring_index(e.`name`," ",1) like "K%" 
and char_length(e.`name`)<=15;

-- Task 3  
select c.id,c.`name`
from customer c
where  datediff(curdate(),c.birthday)/365 between 18 and 50 
and c.address like '%Đà Nẵng' or c.address like '%Quảng Trị';

-- Task 4
select c.id, c.`name`,count(ct.customer_id) as 'so_lan_dat_phong'
from customer c
join type_customer tc on c.type_customer_id = tc.id and c.type_customer_id = 1
join contract ct on c.id = ct.customer_id
group by  ct.customer_id 
order by count(ct.customer_id) ;

-- Task 5
select c.id,
 c.`name`,
 tc.`name`,
 co.id,
 se.`name`,
 co.start_day,
 co.end_day,
sum(se.expense+(cd.count*cs.price)) as 'tong tien'
from customer c 
left join type_customer tc on c.type_customer_id = tc.id
left join contract co on c.id = co.customer_id
left join service se on co.service_id = se.id
left join contract_detail cd on co.id = cd.contract_id
left join companied_service cs on cd.companied_service_id = cs.id
group by c.id,
    c.`name`,
    tc.`name`,
    co.id,
    se.`name`,
    co.start_day,
    co.end_day;

-- task 6
select s.id, s.`name`,s.acreage_room,s.expense,ts.`name`
from customer c
join contract co on c.id = co.customer_id
join service s on co.service_id = s.id
join type_service ts on s.type_service_id = ts.id
where year(co.start_day) = 2021 and quarter(co.start_day) > 1
group by s.id;
-- task 7
select s.id, s.`name`,s.acreage_room,s.expense,ts.`name`
from customer c
join contract co on c.id = co.customer_id
join service s on co.service_id = s.id
join type_service ts on s.type_service_id = ts.id
join type_retail tr on s.type_retail_id = tr.id
where year(co.start_day) = 2020
and s.id not in (
select s.id
from service s
join contract co on co.service_id = s.id
where  year(co.start_day) = 2021);

-- Task 8
-- C1:
select distinct c.`name`
from customer c;
-- C2:
select c.`name`
from customer c
group by (c.`name`);
-- C3:
select c.`name`
from customer c
join ( 
select c.`name`
from customer c
group by c.`name`
) new_c on c.`name` = new_c.`name`;
    
-- Task 9
select month(co.start_day) as 'Thang',count(co.customer_id) as 'so_luong_khach_hang'
from contract co
where year(co.start_day) = 2021  
group by month(co.start_day)
order by month(co.start_day);

-- Task 10
select co.id as 'Ma hop dong',co.start_day,co.end_day,co.deposite_money,sum(cd.count) as 'so luong'
from contract co
left join contract_detail cd on co.id = cd.contract_id
left join companied_service cs on cd.companied_service_id = cs.id
group by (co.id);

-- Task 11
select cs.id as 'ma dich vu di kem',
cs.`name` as 'ten dich vu di kem'
from customer c
join type_customer tc on c.type_customer_id = tc.id
join contract ct on c.id = ct.customer_id
join contract_detail cd on ct.id = cd.contract_id
join companied_service cs on cd.companied_service_id = cs.id
where tc.`name` = 'Diamond' and c.address like '%Vinh' or c.address like '%Quảng Ngãi';

-- Task 12
select co.id, e.`name`,c.`name`,c.`number`,s.id,s.`name`,sum(cs.id),co.deposite_money
from contract co 
join employee e on co.employee_id = e.id
join customer c on co.customer_id  = c.id
join service s on co.service_id = s.id
join contract_detail cd on co.id = cd.contract_id
join companied_service cs on cd.companied_service_id = cs.id
where year(co.start_day) = 2020 and quarter(co.start_day) = 4 and 
co.start_day not in (
select co.start_day
from contract co 
where  year(co.start_day) = 2021 and quarter(co.start_day) = 1 and quarter(co.start_day) = 2)








