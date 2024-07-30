create database QL_CuaHangSach
select * from Sach;
select * from KhachHang;
select * from DonHang;

go 
use QL_CuaHangSach

Create table TheLoai
(
	MaTheLoai nchar(20) not null,
	TheLoai nchar(50) not null,
	primary key(MaTheLoai),
)
select * from QuanLy
go 
use QL_CuaHangSach

drop table TKDangNhap

Create table TKDangNhap
(
	MaNguoiQuanLy varchar(20) not null,
	TaiKhoan varchar(20) not null,
	MatKhau varchar(30) not null,
	Vaitro int not null,
	primary key(MaNguoiQuanLy),
)

insert into TKDangNhap(MaNguoiQuanLy, TaiKhoan, MatKhau, Vaitro)
values('N001', 'TEONV', '1111', '1'),
('N002', 'QUANDH', '1111', '1'),
('N003', 'BINHMN', '1111', '0'),
('N004', 'QUANND', '1111', '0')

go 
use QL_CuaHangSach

Create table Sach
(
	MaSach nvarchar(50) not null,
	TenSach nvarchar(150) not null,
	GiaSach float not null,
	SoTrangSach int not null,
	MaTheLoai nchar(20) not null,
	TacGia nvarchar(50) not null,
	SoLuongSach float not null,
	LuotMuaSach float not null,
	BiaSach nvarchar(75), 
	DanhGiaSach nvarchar(255) null,
	primary key(MaSach),
	Foreign key (MaTheLoai) references TheLoai(MaTheLoai),
)

go 

use QL_CuaHangSach

Create table KhachHang
(
	MaKhachHang nchar(20) not null,
	TenKhachHang nchar(20) not null,
	SDT_KhachHang int not null,
	Email_KhachHang nvarchar(50) not null,
	SoDuong nvarchar(50) not null,
	TenDuong nvarchar(50) not null,
	Phuong nvarchar(50) not null,
	Quan nvarchar(50) not null,
	ThanhPho nvarchar(50) not null,
	TenDangNhap nchar(20) not null,
	MatKhau nchar(30) not null,
	primary key(MaKhachHang),

)
 

go 
use QL_CuaHangSach

Create table DonHang
(
	MaDonHang nchar(20) not null,
	MaSach nvarchar(50) not null,
	MaKhachHang nchar(20) not null,
	SoDuong nvarchar(50) not null,
	TenDuong nvarchar(50) not null,
	Phuong nvarchar(50) not null,
	Quan nvarchar(50) not null,
	ThanhPho nvarchar(50) not null,
	SoLuongSach float not null,
	NgayMua Date not null,
	TrangThai nvarchar(50) not null,
	primary key(MaDonHang),
	Foreign key (MaKhachHang) references KhachHang(MaKhachHang),
)

insert into TheLoai(MaTheLoai,TheLoai) values
('G1',N'Truyện ngắn'),
('G2',N'Tiểu thuyết'),
('G3',N'Khoa học viễn tưởng'),
('G4',N'Truyện tranh'),
('G5',N'Chính trị - Pháp luật'),
('G6',N'Kinh tế'),
('G7',N'Thiếu nhi'),
('G8',N'Giáo trình'),
('G9',N'Ẩm thực - Du lịch'),
('G10',N'Văn hóa');

go 
USE QL_CuaHangSach

insert into QuanLy(MaNguoiQuanLy,TenQuanLy, TaiKhoan,MatKhau) values
('QL01',N'Nguyễn Văn Tèo','TeoNV','123456'),
('QL02',N'Dương Hứu Quân','QuanDH','123456'),
('QL03',N'Mai Ngọc Bình','BinhMN','123456'),
('QL04',N'Nguyễn Đặng Quân','QuanND','123456');

go 
USE QL_CuaHangSach

insert into Sach(MaSach,TenSach,GiaSach,SoTrangSach,MaTheLoai,TacGia,SoLuongSach,LuotMuaSach,BiaSach,DanhGiaSach) values
('SA001',N'Lão Hạc','25.000','20','G1','Nam Cao','1000','150','lao-hac.jpg',''),
('SA002',N'Văn Hóa Du Lịch','60.000','100','G9',N'Ngọc Bình','1500','300','van-hoa-du-lich.jpg',''),
('SA003',N'Tiếng Hàn Tổng Hợp','100.000','200','G8',N'Đỗ Thị Lệ','3000','400','tieng-han-tong-hop.png',''),
('SA004',N'Khu Rừng Trong Chai','15.000','30','G7',N'Huỳnh Trọng khang','500','50','khu-rung-trong-chai.jpg',''),
('SA005',N'Giáo Trình Pháp Luật Đại Cương','30.000','500','G5',N'Hoài Nam','1000','150','giao-trinh-phap-luat-dai-cuong.jpg',''),
('SA006',N'Kinh Tế Phát Triển','150.000','250','G6',N'Hữu Quân','1500','400','kinh-te-phat-trien.jpg',''),
('SA007',N'Tắt Đèn','25.000','20','G1',N'Ngô Tất Tố','1000','150','tat-den.jpg',''),
('SA008',N'Khám Phá Ẩm Thực Truyền Thống Việt Nam','15.000','500','G9',N'Đặng Quân','5000','1550','am-thuc-truyen-thong-viet-nam.jpg',''),
('SA009',N'Hạt Giống Lạ Của Mion','15.000','30','G7',N'Hòa Thu','100','50','hat-giong-la-cua-mion.jpg',''),
('SA010',N'Trạng Quỷnh','10.000','20','G4',N'Kim Khánh','10000','1500','trang-quynh.jpg',''),
('SA011',N'Cậu Bé Rồng','10.000','20','G4',N'Kim Khánh','10000','1500','cau-be-rong.jpg',''),
('SA012',N'Doraemon','25.000','40','G4',N'FUJIKO F FUJIO','100000','15000','doraemon.jpg',''),
('SA013',N'Không Gia Đình','75.000','90','G2',N'Huỳnh Lý Dịch','1000','200','khong-gia-dinh.jpg',''),
('SA015',N'Đám Trẻ Ở Đại Dương Đen','50.000','350','G1',N'Châu Sa Đáy Mắt','5000','500','dam-tre-o-dai-duong-den.jpg',''),
('SA016',N'999 Lá Thư Gửi Cho Chính Mình-Những Lá Thư Ấn Tượng Nhất','250.000','200','G1',N'Miêu Công Tử','1000','100','999-la-thu-gui-cho-chinh-minh.jpg',''),
('SA017',N'Trôi','20.000','100','G1',N'Nguyễn Ngọc Tư','5000','1500','troi.jpg',''),
('SA018',N'Lạc Giữa Tần Số Không Người Nghe','50.000','200','G1',N'macmart','7000','1000','lac-giua-tan-so-khong-người-nghe.jpg',''),
('SA019',N'Hẹn Nhau Phía Sau Tan Vỡ','75.000','500','G1',N'An','5200','2500','hen-nhau-sau-tan-vo.jpg',''),
('SA020',N'Chuyện Kể Rằng Có Nàng Và Tôi','250.000','300','G1',N'Nhiều Tác Giả','5000','1500','chuyen-ke-rang-co-nang-va-toi.jpg',''),
('SA021',N'Cảm Ơn Anh Đã Đánh Mất Em','50.000','350','G1',N'Trí','5200','500','cam-on-anh-da-danh-mat-em.jpg',''),
('SA022',N'Màu Nhạt Nắng','250.000','300','G1',N'BS Huỳnh Wynh Trần','5000','1500','mau-nhat-nang.jpg',''),
('SA023',N'Chuyện Kỳ Dị Về Benjamin','350.000','400','G1',N'F Scott Fitzgerald','7000','2500','chuyen-ki-di.jpg',''),
('SA024',N'Hay Chúng Mình Đừng Hứa Hẹn Gì Nhau','550.000','200','G1',N'Minh Dự','5100','500','dung-hua-hen-gi-nhau.jpg',''),
('SA025',N'Người Tập Lớn','50.000','350','G1',N'Chà','8000','1550','nguoi-tap-lon.jpg',''),
('SA026',N'Chuyện ICU - Lá Gan Hạnh Phúc','50.000','345','G1',N'BS Wynn Huỳnh Trần','5000','1500','la-gan-hanh-phuc.jpg',''),
('SA027',N'Góc Khuất Đàn Bà','270.000','200','G1',N'Huyền Trang Bất Hối','1000','500','goc-khuat-dan-ba.jpg',''),
('SA028',N'Gió Lạnh Đầu Mùa ','275.000','100','G1',N'Thạch Lam','5200','100','gio-lanh-dau-mua.jpg',''),
('SA029',N'Hai Mặt Của Gia Đình','290.000','350','G1',N'Choi Kwanghuyn','3000','1200','hai-mat-cua-gia-dinh.jpg',''),
('SA030',N'Cây Cam Ngọt Của Tôi','85.000','110','G2',N'José Mauro de Vasconcelos','1000','200','cay-cam-ngot.jpg',''),
('SA031',N'Nhà Giả Kim ','95.000','900','G2',N'Paulo Coelho','1500','300','nha-gia-kim.jpg',''),
('SA032',N'Ghi Chép Pháp Y - Những Cái Chết Bí Ẩn','120.000','100','G2',N'Lưu Hiểu Huy','1000','200','cai-chet-bi-an.jpg',''),
('SA033',N'Suối Cọp','175.000','120','G2',N'Hữu Ước','1500','300','suoi-cop.jpg',''),
('SA034',N'Vừa Nhắm Mắt Vừa Mở Cửa Số','63.000','190','G2',N'Nguyễn Ngọc Thuần','10000','2000','vua-nham-mat-vua-mo-cua-so.jpg',''),
('SA035',N'Làm Bạn Với Bầu Trời','88.000','120','G2',N'Nguyễn Nhật Ánh','1030','400','lam-ban-voi-bau-troi.jpg',''),
('SA036',N'Quân Vương','58.000','100','G2',N'Niccolò Machiavelli','10000','2000','quan-vuong.jpg',''),
('SA037',N'Bước Chậm Lại Giữa Thế Gian Vội Vã','68.000','90','G2',N'Hae Min','1000','200','buoc-cham-lai.jpg',''),
('SA038',N'Chiến Binh Cầu Vồng','88.000','900','G2',N'Andrea Hirata','1002','250','chien-binh-cau-vong.jpg',''),
('SA039',N'One Piece - Tiểu Thuyết - Chuyện Về Law','58.000','390','G2',N'Eiichiro Oda, Shusei Sakagami','1500','200','chuyen-ve-law.jpg',''),
('SA040',N'Người Bà Tài Giỏi Vùng Saga','85.000','110','G2',N'Yoshichi Shimada','1500','220','nguoi-ba-tai-gioi-vung-saga.jpg',''),
('SA041',N'TẾT Ở LÀNG ĐỊA NGỤC','58.000','100','G3',N'Niccolò Machiavelli','10000','2000','tet-o-lang-dia-nguc.jpg',''),
('SA042',N'NHÀ MÁY SẢN XUẤT LINH HỒN','158.000','100','G3',N'Thảo Trang','10000','2000','sach-nha-may-san-xuat-linh-hon.jpg',''),
('SA043',N'ÁO QUAN ĐÓNG NẮP','98.000','300','G3',N'Nguyễn Nguyên Phước ','1000','200','ao-quan-dong-nap.jpg',''),
('SA044',N'SĨ SỐ LỚP VẮNG 0','80.000','100','G3',N'EMMA Hạ My','1000','500','sach-si-so-lop-vang-0.jpg',''),
('SA045',N'QUÁI VẬT TRONG QUÁN ĐỒ NƯỚNG','126.000','400','G3',N'Bái Tất Quý','10000','2000','quai-vat-trong-quan-do-nuong.jpg',''),
('SA046',N'BÃI SĂN NGƯỜI','137.000','100','G3',N'Lương Kha','10500','2010','bai-san-nguoi.jpg',''),
('SA047',N'KỶ NGUYÊN SIÊU TÂN TINH','253.000','500','G3',N'Lưu Từ Hân','10000','2000','ky-nguyen-sieu-tan-tinh.jpg',''),
('SA048',N'MA THUẬT YÊU','118.000','100','G3',N'Brida','10000','2000','ma-thuat-yeu.jpg',''),
('SA049',N'MÈO ĐEN VÀ MẮT QUỶ','71.000','150','G3',N'Chloe Rhodes','1000','200','meo-den-va-mat-quy.jpg',''),
('SA050',N'CĂN PHÒNG MÁU','112.000','100','G3',N'Angela Carter','15000','5000','sach-can-phong-mau.jpg',''),
('SA051',N'TAM THỂ - TẬP 1','120.000','200','G3',N'Lưu Từ Hân','10000','2000','tam-the-tap-1.jpg',''),
('SA052',N'TAM THỂ','120.000','200','G3',N'Lưu Từ Hân','10000','2000','tam-the-tap-2.jpg','');

go 
USE QL_CuaHangSach

insert into Sach(MaSach,TenSach,GiaSach,SoTrangSach,MaTheLoai,TacGia,SoLuongSach,LuotMuaSach,BiaSach,DanhGiaSach) values
('SA053',N'Shin-Cậu bé bút chì','20.000','50','G4',N'Yoshito Usui','10000','1500','shin-cau-be-but-chi.jpg',''),
('SA054',N'Thám tử lừng danh Conan','15.000','20','G4',N'Gosho Aoyama','10000','1500','tham-tu-lung-danh-conan.jpg',''),
('SA055',N'One Piece','40.000','50','G4',N'Echiro Oda','10000','1500','one-piece.jpg',''),
('SA056',N'Cừu vui vẻ và sói xám','10.000','40','G4',N'Kim Khánh','100000000','300000000','cuu-vui-ve-va-soi-xam.jpg',''),
('SA057',N'Thần đồng đất Việt','10.000','20','G4',N'Kim Khánh','10000','1500','trang-ti.jpg',''),
('SA058',N'Thanh gươm diệt quỷ','50.000','50','G4',N'Gotouge','100000','17000','thanh-guom-diet-quy.jpg',''),
('SA059',N'Người xấu','100.000','20','G4',N'Blog Truyện','10000','1500','nguoi-xau.jpg',''),
('SA060',N'Dragon Ball','20.000','50','G4',N'Toriyama','1000000','100500','dragon-ball.jpg',''),
('SA061',N'Attack On Titan','100.000','100','G4',N'Isayama','100900','17700','attack-on-titan.jpg',''),
('SA062',N'101 Tư Vấn Pháp Luật Thường Thức Về Đất Đai','300.000','1500','G5',N'Nguyễn Văn Khôi','1000','500','101-tu-van-phapluat-thuong-thuc-ve-dat-dai.jpg',''),
('SA063',N'120 Bài Báo Của Chủ Tịch Hồ Chí Minh','10.000','700','G5',N'Hồ Chí Minh','1000','150','120-bai-bao-cua-chu-tich-ho-chi-minh.jpg',''),
('SA064',N'120 Bức Thư Của Chủ Tịch Hồ Chủ Tịch','10.000','500','G5',N'Hồ Chí Minh','1000','150','120-buc-thu-cua-chu-tich-ho-chu-tich.jpg',''),
('SA065',N'9 biện pháp bảo đảm nghĩa vụ hợp đồng','30.000','500','G5',N'Trường Thanh Đức','1000','150','bien-phap-dam-bao-nghia-vu-hop-dong.jpg',''),
('SA066',N'Bộ Luật Dân Sự','70.000','1100','G5',N'Pháp Luật Quốc Gia','1500','1150','bo-luat-dan-su.jpg',''),
('SA067',N'Bộ Luật Lao Động','300.000','500','G5',N'Pháp Luật Quốc Gia','1000','150','bo-luat-lao-dong.jpg',''),
('SA068',N'Bộ Luật Tố Tụng Dân Sự','340.000','700','G5',N'Pháp Luật Quốc Gia','1000','1050','bo-luat-to-tung-dan-su.jpg',''),
('SA069',N'Cẩm nang pháp luật giao thông đường bộ ','65.000','1500','G5',N'Pháp Luật Quốc Gia','1000','150','phap-luat-giao-thong-duong-bo.jpg',''),
('SA070',N'Putin - Logic Của Quyền Lực','300.000','5500','G5',N'Hubert Seipel','10000','1550','putin-logic-cua-quyen-luc.jpg',''),
('SA071',N'Giành Phiếu Bầu Bằng Mọi Giá','193.000','1500','G5',N'Joseph Cummins','100000','15550','gianh-phieu-bau-bang-moi-gia.jpg',''),
('SA072',N'Donald Trump - Không Bao Giờ Là Đủ','300.000','2500','G5',N'Michael D Antonio','10500','1550','donald-trump-khong-bao-gio-la-du.jpg',''),
('SA073',N'Nghệ Thuật Tư Duy Chiến Lược','167.000','2550','G6',N'Avinash K Dixit, Barry J Nalebuff','15000','4600','nghe-thuat-tu-duy-chien-luot.jpg',''),
('SA074',N'Chiến Tranh Tiền Tệ','150.000','2550','G6',N'Song Hong Bing','150000','40000','chien-tranh-tien-te.jpg',''),
('SA075',N'Tư Duy Ngược Dịch Chuyển Thế Giới','162.000','1250','G6',N'Adam Grant','100500','40000','tu-duy-nguoc-dich-chuyen-the-gioi.jpg',''),
('SA076',N'Lời Thú Tội Của Một Sát Thủ Kinh Tế','147.000','2500','G6',N'John Perkins','167000','4000','loi-thu-toi-cua-mot-sat-thu-kinh-te.jpg',''),
('SA077',N'Bí Mật Tư Duy Triệu Phú','86.000','650','G6',N'T Harv Eker','178500','45600','bi-mat-tu-duy-trieu-phu.jpg',''),
('SA078',N'Nghĩ Giàu & Làm Giàu','88.000','2950','G6',N'Napoleon Hill','156000','10400','nghi-&-lam-giau.jpg',''),
('SA079',N'AI Chứ Không Phải Thế Nào?','227.000','250','G6',N'Dan Sullivan','110500','44000','ai-chu-ko-phai-the-nao.jpg',''),
('SA080',N'Nhà Lãnh Đạo Không Chức Danh','150.000','2050','G6',N'Robin Sharma','41500','4100','nha-lanh-dao-ko-chuc-danh.jpg',''),
('SA081',N'Nhà Đầu Tư Thông Minh','159.000','1150','G6',N'Benjamin Graham','13500','1400','nha-dau-tu-thong-minh.jpg',''),
('SA082',N'Người Bán Hàng Vĩ Đại Nhất Thế Giới','118.000','350','G6',N'Og Mandino','33500','3400','nguoi-ban-hang-vi-dai-nhat-the-gioi.jpg',''),
('SA083',N'Làm Giàu Qua Chứng Khoán','140.000','250','G6',N'William J O’Neil','71500','6400','lam-giau-qua-chung-khoan.jpg',''),
('SA084',N'Đất Rừng Phương Nam','56.000','30','G7',N'Đoàn Giỏi','5000','150','dat-rung-phuong-nam.jpg',''),
('SA085',N'Hoàng Tử Bé','55.000','30','G7',N'Antoine de Saint-Exupéry','1500','530','hoang-tu-be.jpg',''),
('SA086',N'100 Kỹ Năng Sinh Tồn','69.000','730','G7',N'Clint Emerson','600','500','ki-nang-sinh-ton.jpg',''),
('SA087',N'Tuổi Thơ Dữ Dội','56.000','30','G7',N'Phùng Quán','500','57','tuoi-tho-du-doi.jpg',''),
('SA088',N'Bé An Toàn Mỗi Ngày: Nếu Chẳng May Đi Lạc Thì Sao?','24.000','50','G7',N'Hoàng Hoành, Kẹo Bông','50000','750','be-an-toan-moi-ngay.jpg',''),
('SA089',N'Rèn Luyện Tư Duy, Nâng Cao IQ: Tìm Điểm Khác Nhau','38.000','300','G7',N'Hồ Viện Viện','5600','5000','ren-luyen-tu-duy.jpg',''),
('SA090',N'Lớp Học Mật Ngữ','35.000','30','G7',N'B R O group','550','130','lop-hoc-mat-ngu.jpg',''),
('SA091',N'Chuyện Con Mèo Dạy Hải Âu Bay','34.000','35','G7',N'Luis Sepúlveda','500','50','chuyen-con-meo-day-hai-au-bay.jpg',''),
('SA092',N'Mẹ Hỏi Bé Trả Lời 3-4 Tuổi','25.000','50','G7',N'Yosbook, Xiao Li','4500','650','me-hoi-be-tra-loi.jpg',''),
('SA094',N'Búp Sen Xanh','64.000','130','G7',N'Sơn Tùng','500','50','bup-sen-xanh.jpg',''),
('SA095',N'10 Vạn Câu Hỏi Vì Sao - Cuộc Sống Muôn Màu','150.000','300','G7',N'Tôn Nguyên Vĩ','5000','1350','10-van-cau-hoi-vi-sao.jpg',''),
('SA096',N'Kinh Tế Học Vi Mô','241.000','200','G8',N'N Gregory Mankiw','3000','400','kinh-te-hoc-vi-mo.jpg',''),
('SA097',N'Giáo Trình Triết Học Mác - Lênin','95.000','1200','G8',N'Bộ Giáo Dục Và Đào Tạo','300000','40000','triet-hoc-mac-lenin.jpg',''),
('SA098',N'Giáo Trình Tổ Chức Sự Kiện Thể Dục Thể Thao','110.000','2000','G8',N'Lê Quý Phượng','113000','11400','giao-trinh-to-chuc-su-kien.jpg',''),
('SA099',N'Sổ Tay Kỹ Thuật Trộn Và Biên Tập Âm Thanh','243.000','1200','G8',N'Phạm Xuân Ánh','3000','400','so-tay-am-thanh.jpg',''),
('SA100',N'Giáo Trình Kinh Tế Chính Trị Mác - Lênin','100.000','2050','G8',N'Bộ Giáo Dục Và Đào Tạo','30800','4070','kinh-te-chinh-tri-mac-lenin',''),
('SA101',N'Viết Luận Văn Khoa Học Bằng Tiếng Anh','81.000','500','G8',N'GS TS Đặng Lương Mô','173000','5400','viet-luan-van-khoa-hoc-bang-tieng-anh.jpg',''),
('SA102',N'Giáo Trình Lịch Sử Đảng Cộng Sản Việt Nam ','85.000','1200','G8',N'Bộ Giáo Dục Và Đào Tạo','300000','40000','lich-su-dang-cong-san-vn.jpg',''),
('SA103',N'Giáo Trình Giao Tiếp Kinh Doanh','315.000','2000','G8',N'GS TS Hà Nam Khánh Giao','563000','42100','giao-tiep-kinh-doanh.jpg',''),
('SA104',N'Giáo Trình Cao Học Quản Trị Kinh Doanh','315.000','200','G8',N'GS TS Hà Nam Khánh Giao','389000','50000','cao-hoc-quan-tri-kinh-doanh.jpg',''),
('SA105',N'Giáo Trình Luật Tố Tụng Hành Chính Việt Nam','110.000','2050','G8',N'Lê Thị Bích Chi','3500','2400','luat-to-tung-hanh-chinh-vn.jpg',''),
('SA106',N'Lược Sử Triết Học Nga','83.000','250','G8',N'TS Mai K Đa, TS Dương Quốc Quân, TS Lê Thị Tuyết','73000','9400','luot-su-triet-hoc-nga.jpg',''),
('SA107',N'Hướng dẫn nấu ăn 200 món truyền thống','115.000','500','G9',N'Hữu Trí','500','55','sach-day-nau-an-co-ban.jpg',''),
('SA108',N'30 Món ngon đãi tiệc','150.000','200','G9',N'Công Hưng','5000','1550','ba-muoi-mon-ngon-dai-tiec.jpg',''),
('SA109',N'Nấu ăn bằng cả trái tim','315.000','500','G9',N'Christine Hà','7000','1150','nau-an-bang-ca-trai-tim.jpg',''),
('SA110',N'500 Món ngon thông dụng dễ nấu','150.000','200','G9',N'Hoa hạ','7000','1550','500-mon-ngon-thong-dung.jpg',''),
('SA111',N'555 Món ăn Việt Nam','135.000','900','G9',N'Ngọc Bình','4000','1550','sach-nau-an-viet-nam.jpg',''),
('SA112',N'Các món bánh Á-Âu','216.000','1100','G9',N'Ricardo Milos','55000','11550','mon-banh-a-au.jpg',''),
('SA113',N'170 Món ăn chay','215.000','500','G9',N'NXB Phụ Nữ','75000','51550','170-mon-an-chay.jpg',''),
('SA114',N'Miếng nhỏ đậm đà','335.000','700','G9',N'Dương Hải Anh','15000','1550','mieng-nho-dam-da.jpg',''),
('SA115',N'Những món ăn Nhật dễ chế biến','715.000','1500','G9',N'Thiên Kim','5000','1550','mon-an-nhat.jpg',''),
('SA116',N'Nấu ăn gia đình','175.000','200','G9',N'Triệu Thị Chơi','15000','11550','nau-an-gia-dinh.jpg',''),
('SA117',N'Những món chay ngon và dinh dưỡng','225.000','300','G9',N'Yanny Đặng','5000','1550','nhung-mon-chay-ngon-va-dinh-duong.jpg',''),
('SA118',N'100 Điều Nên Biết Về Phong Tục Việt Nam','71.000','2000','G10',N'Văn Hóa Việt','10000000','100050','mot-tram-dieu-nen-biet-ve-ptvn.png',''),
('SA119',N'1000 Năm Văn Hiến Thăng Long - Hà Nội','31.000','5220','G10',N'Tập thể tác giả','15000000','1700000','mot-ngan-nam-van-hien.jpg',''),
('SA120',N'7 Kì Quan Thế Giới','131.000','1220','G10',N'Tập thể tác giả','150000111','175000','7-ky-quan-the-gioi.jpg',''),
('SA121',N'Các Mô Thức Văn Hóa','331.000','5720','G10',N'Tập thể tác giả','1590000','170000','cac-mo-thuc-van-hoa.jpg',''),
('SA122',N'Câu Chuyện Văn Hóa','31.000','5220','G10',N'Tập thể tác giả','19000000','1220000','cau-chuyen-van-hoa.jpg',''),
('SA123',N'Châu Âu Có Gì Lạ Không Em?','89.000','2220','G10',N'Tập thể tác giả','15000000','1700000','chau-au-co-gi-la-ko-em.jpg',''),
('SA124',N'Chữ Quốc Ngữ - 130 Năm Thăng Trầm','31.000','5220','G10',N'Tập thể tác giả','15000000','1700000','chu-quoc-ngu.jpg',''),
('SA125',N'Chuyện Về Ứng Xử Văn Hóa','71.000','9220','G10',N'Tập thể tác giả','15000000','1700000','chuyen-ve-ung-xu-van-hoa.png',''),
('SA126',N'Đặc Trưng Văn Hóa Vùng Đông Bắc','160.000','5220','G10',N'Tập thể tác giả','15000000','1700000','dac-trung-van-hoa-vung-dong-bac.jpg',''),
('SA127',N'Đạo Mẫu Việt Nam ','495.000','5220','G10',N'Tập thể tác giả','15000000','1700000','dao-mau-viet-nam.jpg',''),
('SA128',N'Dấu ấn thượng châu thổ','81.000','5220','G10',N'Tập thể tác giả','15000000','1700000','dau-an-thuong-chau-tho.jpg',''),
('SA129',N'Dẫn Luận Về Lịch Sử Nghệ Thuật','72.000','5220','G10',N'Tập thể tác giả','15000000','1700000','dan-luan-ve-lich-su-nghe-thuat.jpg','');

insert into KhachHang(MaKhachHang,TenKhachHang,SDT_KhachHang,Email_KhachHang,SoDuong,TenDuong,Phuong,Quan,ThanhPho,TenDangNhap,MatKhau) values
('KH001',N'Nguyễn Văn Quang','0917552365','Quangnv@gmail.com','35',N'Trần Anh Tông',N'Thanh Khê',N'Quận 2',N'Đà Nẵng','QuangNV','12345'),
('KH002',N'Nguyễn Thị Nở','0936510327','Nont@gmail.com','88',N'Tôn Đức Thắng',N'Hòa Minh',N'Liên Chiểu',N'Đà Nẵng','NoNT','12345'),
('KH003',N'Huỳnh Văn Bảo','0927555470','Baonh@gmail.com','51',N'Trần Anh Tông',N'Hòa Minh',N'Liên Chiểu',N'Đà Nẵng','BaoNH','12345'),
('KH004',N'Đào Minh Quang','0997106270','Quangnd@gmail.com','100',N'Điện Biên Phủ',N'Thanh Khê Tây',N'Thanh Khê',N'Đà Nẵng','QuangND','12345'),
('KH005',N'Lê Anh Nghĩa','0927557165','Nghianl@gmail.com','41',N'Ngô Thì Nhậm',N'Hòa Vang',N'Hải Châu',N'Đà Nẵng','NghiaNL','12345'),
('KH006',N'Hồ Nguyên Phong','0931762366','Phongnh@gmail.com','21',N'Trần Anh Tông',N'Thanh Khê Tây',N'Thanh Khê',N'Đà Nẵng','PhongNH','12345'),
('KH007',N'Nguyễn Viết Triều','0907662410','Trieunv@gmail.com','12',N'Ông Ích Khiêm',N'Hòa Minh',N'Liên Chiểu',N'Đà Nẵng','TrieuNV','12345'),
('KH008',N'Phạm Thị Tình','0926780135','Tinhpt@gmail.com','15',N'Dũng Sĩ Thanh Khê',N'Thanh Khê Tây',N'Thanh Khê',N'Đà Nẵng','TinhPT','12345'),
('KH009',N'Lê Huy Hoàng','0901227615','Hoanglh@gmail.com','118',N'Nguyễn Tất Thành',N'Hòa Minh',N'Liên Chiểu',N'Đà Nẵng','HoangLH','12345'),
('KH010',N'Đoàn Viết Tường','0935678120','Tuongvd@gmail.com','11',N'Nguyễn Huy Tưởng',N'Hòa Minh',N'Liên Chiểu',N'Đà Nẵng','TuongVD','12345'),
('KH011',N'Hồ Quý Châu','0921513890','Chauhq@gmail.com','135',N'Kinh Dương Vương',N'Thanh Khê Tây',N'Thanh Khê',N'Đà Nẵng','ChauHQ','12345'),
('KH012',N'Phạm Hoàng Mẫn','0920871316','Manph@gmail.com','177',N'Trần Anh Tông',N'Thanh Khê Tây',N'Thanh Khê',N'Đà Nẵng','QuangNV','12345'),
('KH013',N'Võ Thị Diễm My','0981335612','Mydtv@gmail.com','125',N'Trưng Nữ Vương',N'Hải Châu',N'Quận 2',N'Đà Nẵng','MyDTV','12345'),
('KH014',N'Ngô Bá Khá','0920115116','Khanb@gmail.com','100',N'Ngô Quyền',N'Xương Bình',N'Quận 1',N'Đà Nẵng','KhaNB','12345'),
('KH015',N'Bùi Xuân Huấn','0912345678','Huanxb@gmail.com','35',N'Võ Nguyên Giáp',N'Thạch Thang',N'Quận 1',N'Đà Nẵng','HuanXB','12345'),
('KH016',N'Đàm Vĩnh Hưng','0921378135','Hungvd@gmail.com','55',N'Bà Huyện Thanh Quan',N'Phước Mỹ',N'Quận 3',N'Đà Nẵng','HungVD','12345'),
('KH017',N'Nguyễn Võ Hoài Linh','0911512441','Linhnvh@gmail.com','10',N'Trần Anh Tông',N'Thanh Khê Tây',N'Thanh Khê',N'Đà Nẵng','LinhNVH','12345'),
('KH018',N'Bùi Văn Huy','0911158902','Huybv@gmail.com','200',N'Nguyễn Tất Thành',N'Hòa Minh',N'Liên Chiểu',N'Đà Nẵng','HuyBV','12345');






