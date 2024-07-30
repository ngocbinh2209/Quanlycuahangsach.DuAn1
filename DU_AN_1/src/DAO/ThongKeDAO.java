/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import TienIch.Connect_to_server;
import entity.DoanhThu;
import entity.DonHang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUAN
 */
public class ThongKeDAO {

    Connect_to_server con = new Connect_to_server();
    Statement stt;
    

    Connection connect;

    public List select(String min, String max) throws SQLException {
        String selectAll = "select a.MaSach, TenSach, a.SoLuongSach, GiaSach, a.SoLuongSach*b.GiaSach as 'DoanhThu' from donhang a inner join Sach b\n"
            + "on a.MaSach = b.MaSach\n"
            + "where a.NgayMua >= '"
            + min+"' and a.ngayMua <= '"
            + max +"'";
        System.out.println(selectAll);
        List<DoanhThu> list = new ArrayList<>();
        connect = con.Connect();
        ResultSet rs = con.selectSQL(selectAll);
        System.out.println(rs);
        while (rs.next()) {
             list.add(new DoanhThu(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
        }
        System.out.println(list);
        return list;
    }
}
