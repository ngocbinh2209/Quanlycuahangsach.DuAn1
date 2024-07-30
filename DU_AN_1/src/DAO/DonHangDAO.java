/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import TienIch.Connect_to_server;
import entity.Sach;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.DonHang;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author QUAN
 */
public class DonHangDAO {

    Connect_to_server con = new Connect_to_server();
    Statement stt;
    String selectAll = "select madonhang, MaKhachHang, \n"
            + "SoDuong + ' ' +TenDuong+' - '+Phuong+' - '+Quan+' - '+ThanhPho as 'DiaChi',\n"
            + "TrangThai, ngaymua,\n"
            + "count('MadonHang')\n"
            + "from DonHang\n"
            + "group by madonhang, MaKhachHang, trangThai,ngaymua,\n"
            + "SoDuong + ' ' +TenDuong+' - '+Phuong+' - '+Quan+' - '+ThanhPho\n"
            + "";

    Connection connect;

    public List selectDonHang() throws SQLException {
        List<DonHang> list = new ArrayList<>();
        connect = con.Connect();
        ResultSet rs = con.selectSQL(selectAll);
        while (rs.next()) {
            list.add(new DonHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5)));
        }

        return list;
    }

    public List selectTrangThaiDH(int trangthai) throws SQLException {
        System.out.println(trangthai);
        String selectTrangThaiDH = "select madonhang, MaKhachHang, \n"
                + "SoDuong + ' ' +TenDuong+' - '+Phuong+' - '+Quan+' - '+ThanhPho as 'DiaChi',\n"
                + "TrangThai, ngaymua,\n"
                + "count('MadonHang')\n"
                + "from DonHang\n"
                + "where TrangThai = N'";
        if (trangthai == 2) {
            selectTrangThaiDH += "Chưa xác nhận'";
        } else {
            selectTrangThaiDH += "Xác nhận'";
        }
        selectTrangThaiDH += "group by madonhang, MaKhachHang, trangThai,ngaymua,\n"
                + "SoDuong + ' ' +TenDuong+' - '+Phuong+' - '+Quan+' - '+ThanhPho\n";
        System.out.println(selectTrangThaiDH);
        List<DonHang> list = new ArrayList<>();
        connect = con.Connect();
        ResultSet rs = con.selectSQL(selectTrangThaiDH);
        while (rs.next()) {
            list.add(new DonHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5)));
        }

        return list;
    }

    public List selectDonHangChiTiet(String maDH) throws SQLException{
        String select = "select a.MaSach, b.TenSach, a.SoLuongSach,\n"
                + "b.GiaSach, a.NgayMua, a.SoLuongSach*b.GiaSach as 'Thanh toan',\n"
                + "SoDuong + ' ' +TenDuong+' - '+Phuong+' - '+Quan+' - '+ThanhPho as 'DiaChi', a.MaKhachHang\n"
                + "from donhang a inner join sach b\n"
                + "on a.MaSach = b.MaSach\n"
                + "where a.MaDonHang = '"
                + maDH+"'";
        
        ResultSet rs =  con.selectSQL(select);
        List list = new ArrayList();
        while (rs.next()) {
            Vector vec = new Vector();
            vec.add(0, rs.getString(1));
            vec.add(1, rs.getString(2));
            vec.add(2, rs.getString(3));
            vec.add(3, rs.getString(4));
            vec.add(4, rs.getString(5));
            vec.add(5, rs.getFloat(6));
            vec.add(6, rs.getString(7));
            vec.add(7, rs.getString(8));
            list.add(vec);
        }
        return list;
    }
    
}
