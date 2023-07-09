Create database QLMayTinh
go

use QLMayTinh
create table HangSanXuat(
	TenHang nvarchar(100)primary key
)
go

create table SanPham(
	MaSanPham char(10)primary key,
	TenSanPham nvarchar(max),
	
	GiaSanPham [decimal](18, 2) ,
	LoaiSanPham nvarchar(max), 
	SoLuong int,
	TenHang nvarchar(100),

)
Go

select * from SanPham
insert into SanPham values('SP003',N'May moi','120000.00',N'Lap',1,'asus')

create table KhachHang(
	SoDienThoai int primary key ,
	TenKhach nvarchar(max),
)
go


create table NhanVien(
	MaNhanVien nvarchar(50)primary key,
	PassWord nvarchar(max),
	TenNhanVien nvarchar(max),
	NgayVaoLam date,
	Luong float ,
	ChucVu bit
)
go


create table KhachHang(
	Sdt char(15) primary key ,
	TenKhach nvarchar(max),
)
go

Create table Store(
	Ten nvarchar(100)primary key ,
	DiaChia nvarchar(max),

)
go

create table LoaiSanPham (
	TenLoai nvarchar(100)primary key
)
go

Create table test(
	MaHD char(10)primary key ,
	NoiDung nvarchar(max)
)
go
---data test
insert into test values('123',N'Thuận')

select TenKhach from KhachHang where Sdt ='0329867771'
--- data cua Hang
insert into Store values(N'Showroom Tân Bình',N'28 - 30 Trần Triệu Luật, P.6, Quận Tân Bình, TP.HCM')


--data KhachHang
select * from KhachHang where Sdt =01212565616
select * from KhachHang where Sdt ='0329867771'
insert into KhachHang values('0329867771',N'Gia Thuận')
insert into KhachHang values(01212565616,N'Ngọc Khang')
insert into KhachHang values(0644323833,N'Thành An')
-- data nhanVien
select * from NhanVien
select TenNhanVien from NhanVien where MaNhanVien='2001207369'
select ChucVu from NhanVien where MaNhanVien='2001207369' and PassWord ='mapuu17'
select PassWord from NhanVien where MaNhanVien =N'2001207369'
select PassWord from NhanVien where MaNhanVien =N'2001207369'


insert into NhanVien values('2001207369','mapuu17',N'Huỳnh Gia Thuận','2019-01-23','20000000',0)
insert into NhanVien values('2001204686','teo123',N'Phan Văn Tèo','2022-01-10','1200000',1)
insert into NhanVien values('giathuan25','mapuu17',N'Huỳnh Gia Thuậnn','2022-01-10','1200000',1)

--data Hang
select * from HangSanXuat

insert into HangSanXuat values(N'azus')
insert into HangSanXuat values(N'acer')
insert into HangSanXuat values(N'msi')
insert into HangSanXuat values(N'hp')

insert into HangSanXuat values(N'ADATA')
--data SanPham
SELECT * FROM SanPham ORDER BY GiaSanPham DESC

SELECT * FROM SanPham where TenSanPham =N'Laptop ASUS Vivobook 15X OLED A1503ZA L1421W'
SELECT  TenSanPham , GiaSanPham FROM SanPham where MaSanPham =N'L1421W'
select TenSanPham , GiaSanPham,SoLuong from SanPham where MaSanPham = N'L1421W'

select TenSanPham , GiaSanPham,SoLuong from SanPham where MaSanPham = N'L1421W'
insert into SanPham values('L1421W',N'Laptop ASUS Vivobook 15X OLED A1503ZA L1421W',100000,00,N'LapTop',15,N'azus')
insert into SanPham values('LP041W',N'Laptop gaming ASUS TUF Gaming F15 FX507ZV4 LP041W','36490',N'LapTop',10,N'azus')
insert into SanPham values('HN144W',N'Laptop ASUS TUF Gaming F15 FX506HC HN144W','19990',N'LapTop',2,N'azus')
insert into SanPham values('R05G',N'Laptop Gaming Acer Aspire 7 A715 42G R05G','15990',N'LapTop',3,N'acer')
insert into SanPham values('54MV',N'Laptop gaming Acer Nitro 5 Eagle AN515 57 54MV','19790',N'LapTop',2,N'acer')
insert into SanPham values('773Y',N'Laptop gaming Acer Nitro 5 Tiger AN515 58 773Y','28490',N'LapTop',6,N'acer')
insert into SanPham values('1711',N'Laptop','28490',N'LapTop',6,N'acer')
insert into SanPham values('AX4U320',N'Ram DDR4 Adata 8GB 3200Mhz XPG Spectrix D41 RGB Grey (1x 8GB) (AX4U32008G16A-ST41)','520',N'Ram',6,N'ADATA')
 ----khoa ngoai


