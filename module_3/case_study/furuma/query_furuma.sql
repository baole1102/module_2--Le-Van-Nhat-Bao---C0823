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


-- task 6
select s.id, s.`name`,s.acreage_room,s.expense,ts.`name`
from customer c
join contract co on c.id = co.customer_id
join service s on co.service_id = s.id
join type_service ts on s.type_service_id = ts.id
where  co.start_day not between '2021-01-01' and '2021-03-30'
and co.end_day not between '2021-01-01' and '2021-03-30';

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
    
    