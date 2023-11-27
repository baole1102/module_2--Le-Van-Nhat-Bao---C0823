-- Task 2
-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select *
from employee e
where substring_index(e.`name`," ",1) like "%H%" 
or substring_index(e.`name`," ",1) like "%T%"
or substring_index(e.`name`," ",1) like "%K%" 
and char_length(e.`name`)<=15;

-- Task 3  
-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select c.id,c.`name`
from customer c
where  datediff(curdate(),c.birthday)/365 between 18 and 50 
and c.address like '%Đà Nẵng' or c.address like '%Quảng Trị';

-- Task 4
-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select c.id, c.`name`,count(ct.customer_id) as 'so_lan_dat_phong'
from customer c
join type_customer tc on c.type_customer_id = tc.id and c.type_customer_id = 1
join contract ct on c.id = ct.customer_id
group by  ct.customer_id 
order by count(ct.customer_id) ;

-- Task 5
--  Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, 
-- tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và
-- Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 
select c.id,
 c.`name`,
 tc.`name`,
 co.id,
 se.`name`,
 co.start_day,
 co.end_day,
sum(se.expense+ifnull(cd.count,0)*ifnull(cs.price,0)) as 'tong_tien'
from customer c 
left join type_customer tc on c.type_customer_id = tc.id
left join contract co on c.id = co.customer_id
left join service se on co.service_id = se.id
left join contract_detail cd on co.id = cd.contract_id
left join companied_service cs on cd.companied_service_id = cs.id
group by c.id,co.id;
-- Task 6
-- Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa 
-- từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).

select s.id, s.`name`,s.acreage_room,s.expense,ts.`name`
from customer c
join contract co on c.id = co.customer_id
join service s on co.service_id = s.id
join type_service ts on s.type_service_id = ts.id
where year(co.start_day) = 2021 and quarter(co.start_day) > 1
group by s.id;


-- Task 7
-- Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ đã 
-- từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

select s.id, s.`name`,s.acreage_room,s.expense,ts.`name`
from customer c
join contract co on c.id = co.customer_id
join service s on co.service_id = s.id
join type_service ts on s.type_service_id = ts.id
where year(co.start_day) = 2020
and s.id not in (
select s.id
from service s
join contract co on co.service_id = s.id
where  year(co.start_day) = 2021)
group by s.id;

-- Task 8
-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.

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
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(co.start_day) as 'Thang',count(co.customer_id) as 'so_luong_khach_hang'
from contract co
where year(co.start_day) = 2021  
group by month(co.start_day)
order by month(co.start_day);

-- Task 10
-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong,
-- ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select co.id as 'Ma hop dong',co.start_day,co.end_day,co.deposite_money,sum(cd.count) as 'so luong'
from contract co
left join contract_detail cd on co.id = cd.contract_id
left join companied_service cs on cd.companied_service_id = cs.id
group by (co.id);

-- Task 11
-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và
-- có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select cs.id as 'ma dich vu di kem',
cs.`name` as 'ten dich vu di kem'
from customer c
join type_customer tc on c.type_customer_id = tc.id
join contract ct on c.id = ct.customer_id
join contract_detail cd on ct.id = cd.contract_id
join companied_service cs on cd.companied_service_id = cs.id
where tc.`name` = 'Diamond' and c.address like '%Vinh%' or c.address like '%Quảng Ngãi%';

-- Task 12
-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu,
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách 
-- hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select co.id, e.`name`,c.`name`,c.`number`,s.id,s.`name`,count(cd.contract_id),co.deposite_money
from contract co 
join employee e on co.employee_id = e.id
join customer c on co.customer_id  = c.id
left join service s on co.service_id = s.id
left join contract_detail cd on co.id = cd.contract_id
left join companied_service cs on cd.companied_service_id = cs.id
where year(co.start_day) = 2020 and quarter(co.start_day) = 4 and 
co.service_id not in (
select co.service_id
from contract co 
where  year(co.start_day) = 2021 and quarter(co.start_day) = 1 and quarter(co.start_day) = 2)
group by co.id;

-- Task 13
-- 	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select cd.companied_service_id as ma_dich_vu_di_kem,
cs.`name` as ten_dich_vu_di_kem
,(sum(cd.count)) as so_luong_dich_vu_di_kem
from contract_detail cd
join companied_service cs on cd.companied_service_id = cs.id
group by  cd.companied_service_id
having so_luong_dich_vu_di_kem = (
select  max(so_luong_dich_vu_di_kem) from ( 
select cd.companied_service_id as ma_dich_vu_di_kem,(sum(cd.count)) as so_luong_dich_vu_di_kem
from contract_detail cd
join companied_service cs on cd.companied_service_id = cs.id
group by  cd.companied_service_id) as temp
);


-- Task 14
-- Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).

select cd.contract_id,ts.`name`,cs.`name`,count(cd.companied_service_id) as so_lan_su_dung
from service se 
join type_service ts on se.type_service_id = ts.id 
join contract co on se.id = co.service_id 
join contract_detail cd on cd.contract_id = co.id
join companied_service cs on cs.id = cd.companied_service_id
group by cs.`name`
having so_lan_su_dung = 1;


-- Task 15
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai,
-- dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

select e.id,e.`name`,l.`name`,p.`name`,e.`number`,e.address,count(co.employee_id)
from employee e
join level l on e.level_id = l.id
join position p on e.position_id = p.id
join contract co on co.employee_id = e.id
where co.start_day between '2020-01-01' and '2021-12-30'
group by co.employee_id
having count(co.employee_id) <= 3
order by e.id;


-- Task 16
-- Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021
set sql_safe_updates = 0 ;
set sql_safe_updates = 1;

delete from employee e
where e.id not in (
select co.employee_id
from contract co 
where year(co.start_day) between 2019 and 2021
group by co.employee_id
);

select *
from employee;

-- Task 17
-- Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.

CREATE TEMPORARY TABLE temp_table AS
select c.id,sum(se.expense+(cd.count*cs.price)+co.deposite_money) as SumMoney
from customer c
join type_customer tc on c.type_customer_id = tc.id
join contract co on co.customer_id = c.id 
join service se on co.service_id = se.id
join contract_detail cd on cd.contract_id = co.id
join companied_service cs on cs.id = cd.companied_service_id
where  year(co.start_day) = 2021 
and tc.id = 2
group by c.id
having SumMoney >= 1000000;

update customer
set customer.type_customer_id = 1
where customer.id in (select temp_table.id from temp_table ) and customer.type_customer_id = 2;

-- Task 18
-- Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
-- delete from name.... where

set sql_safe_updates = 0;
set sql_safe_updates = 1;
SET FOREIGN_KEY_CHECKS=0;
SET FOREIGN_KEY_CHECKS=1;
delete from customer c
where c.id  in (
select co.customer_id
from contract co 
where year(co.start_day) < 2021
group by co.customer_id
);

-- Task 19
-- Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.

CREATE TEMPORARY TABLE temp AS
select cs.id, cs.`name`
from companied_service cs
left join contract_detail cd on cs.id = cd.companied_service_id
left join contract co on co.id = cd.contract_id
where year(co.start_day) = 2020 and cd.count > 10;

update companied_service cs
set cs.price = cs.price*2
where cs.id in (
select temp.id from temp ) ;

-- Task 20
-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang),
-- ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

select e.id,e.`name`,e.email,e.number,e.birthday,e.address
from employee e
union
select c.id,c.`name`,c.email,c.number,c.birthday,c.address
from customer c;


-- Task 21
-- Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.
create  view v_employee as
select e.id,e.`name`,e.address
from employee e
join contract co on e.id = co.employee_id
where e.address like '%Hải Châu%' 
and co.start_day = '2019-12-12'; 

drop view v_employee;

select *
from v_employee;

-- Task 22
-- 22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất 
-- cả các nhân viên được nhìn thấy bởi khung nhìn này.
set sql_safe_updates = 0;
set sql_safe_updates = 1;

update v_employee
set v_employee.address = 'Huee'
where v_employee.address like '%Gia Lai%';

-- Task 23
-- Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với
-- ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang.
SET FOREIGN_KEY_CHECKS=0;
SET FOREIGN_KEY_CHECKS=1;

delimiter //
create procedure sp_xoa_khach_hang (d_id int)
begin
delete from customer c
where c.id = d_id;
end
// delimiter ;

call   sp_xoa_khach_hang (2);


-- Task 23 a. Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với yêu cầu sp_them_moi_hop_dong phải 
-- thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, với nguyên tắc không được trùng khóa chính và 
-- đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.

delimiter //
create procedure sp_them_moi_hop_dong (
-- n_id int ,
n_start_day datetime,
n_end_day datetime,
n_deposite_money double,
n_employee_id int,
n_customer_id int,
n_service_id int
-- foreign key (employee_id) references employee (id),
-- foreign key (customer_id) references customer (id),
-- foreign key (service_id) references service (id)
)
begin
insert into contract (start_day,end_day,deposite_money,employee_id,customer_id,service_id)
values (n_start_day,n_end_day,n_deposite_money,n_employee_id,n_customer_id,n_service_id);
end //
delimiter ;

SET FOREIGN_KEY_CHECKS=0;
SET FOREIGN_KEY_CHECKS=1;
call sp_them_moi_hop_dong ('2021-09-02','2021-09-05',100000,7,4,4);


-- Task 24 Tạo Trigger có tên tr_xoa_hop_dong khi xóa bản ghi trong bảng hop_dong thì hiển thị tổng số lượng bản ghi 
-- còn lại có trong bảng hop_dong ra giao diện console của database.
-- Lưu ý: Đối với MySQL thì sử dụng SIGNAL hoặc ghi log thay cho việc ghi ở console.








