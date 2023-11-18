create database QLPT
go

use QLPT
go


drop table ACCOUNT

create table ACCOUNT(
	Username varchar(20) not null primary key,
	Password varchar(20) not null,
	Name nvarchar(30),
	Email varchar(30),
	Phonenumber char(10),
	Rol int
)

insert into ACCOUNT values('vanthuy','admin',N'Nguyễn Văn Thùy','abc@gmail.com','1234567890',0)
insert into ACCOUNT values('khongtuyen','admin',N'Khổng Văn Tuyên','abc@gmail.com','1234567890',0)
insert into ACCOUNT values('minhduyen','admin',N'Nguyễn Minh Duyên','abc@gmail.com','1234567890',0)
insert into ACCOUNT values('vankhien','admin',N'Hoàng Văn Khiên','abc@gmail.com','1234567890',0)
insert into ACCOUNT values('hoangnhat','admin',N'Hoàng Công Nhất','abc@gmail.com','1234567890',0)

insert into ACCOUNT values('user','user',N'Nguời dùng','abc@gmail.com','1234567890',1)

drop table VEHICLE

create table VEHICLE(
	VehID char(10) not null primary key,
	VehName Nvarchar(30) not null,
	Maker varchar(30) not null,
	VehType nvarchar(20) not null,
	Year varchar(10) not null,
	Price varchar(20) not null,
	Color Nvarchar(20) not null,
	SeatNum varchar(10),
	EngineType Nvarchar(30),
	Watt varchar(10),
	Tonn varchar(10)
)

insert into vehicle values('V01','Honda Vario 2021','honda',N'xe máy','2021','24000000',N'Đen','','','100','')
insert into vehicle values('V02','Yamaha Exciter 150 2021','yamaha',N'xe máy','2021','40000000',N'Xanh','','','150','')
insert into vehicle values('V03','Honda Sh Mode 125','honda',N'xe máy','2022','75000000',N'Đen','','','125','')


insert into vehicle values('V04','Lux SA2.0','VinFast',N'ô tô','2021','1800000000',N'Trắng','4',N'Kiểu động cơ 1','','')
insert into vehicle values('V05','President','VinFast',N'ô tô','2021','4600000000',N'Nâu','4',N'Kiểu động cơ 2','','')
insert into vehicle values('V06','Fadil','VinFast',N'ô tô','2021','4000000000',N'Đen','4',N'Kiểu động cơ 3','','')

insert into vehicle values('V07','KIA K250','KIA',N'xe tai','2022','428000000',N'Trắng','','','','2.49')
insert into vehicle values('V08','KIA K200','KIA',N'xe tai','2022','376000000',N'Trắng','','','','1.9')
insert into vehicle values('V09','TOWNER','Maybach',N'xe tai','2022','193000000',N'Trắng','','','','2.1')

select * from VEHICLE
select * from ACCOUNT