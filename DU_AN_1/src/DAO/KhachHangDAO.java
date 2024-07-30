/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import TienIch.Connect_to_server;
import entity.KhachHang;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QUAN
 */
public class KhachHangDAO {

    Connect_to_server con = new Connect_to_server();
    String select = "select maKhachHang, TenKhachHang, SDT_KhachHang, Email_KhachHang,"
            + " SoDuong + ' ' +TenDuong+' - '+Phuong+' - '+Quan+' - '+ThanhPho as 'DiaChi' from khachhang";

    public List selectKH() throws SQLException {
        List<KhachHang> list = new ArrayList<>();

        ResultSet rs = con.selectSQL(select);

        while (rs.next()) {
            list.add(new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        return list;
    }

    public int insertKhachHang(Vector vt) {
        String InsertSQL = "insert into KhachHang(MaKhachHang,TenKhachHang,SDT_KhachHang,Email_KhachHang,SoDuong,TenDuong,Phuong,Quan,ThanhPho,TenDangNhap,MatKhau) values('"
                + vt.get(0) + "',N'"
                + vt.get(1) + "','"
                + vt.get(2) + "','"
                + vt.get(3) + "','"
                + vt.get(4) + "',N'"
                + vt.get(5) + "',N'"
                + vt.get(6) + "',N'"
                + vt.get(7) + "',N'"
                + vt.get(8) + "','"
                + vt.get(1) + "','"
                + vt.get(2) + "')";
        int row = 0;
        try {
            row = con.updateSQL(InsertSQL);

        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public int deleteKH(String maXoa) throws SQLException {
        int row = 0;
        String delete = "delete from KhachHang where MaKhachHang= '";
        delete += maXoa + "'";
        row = con.updateSQL(delete);
        return row;
    }

    public Vector selectMakh(String ma) throws SQLException {
        String selectMa = "select * from khachHang where MaKhachHang = '";
        selectMa += ma + "'";
        List<KhachHang> list = new ArrayList<>();
        ResultSet rs = con.selectSQL(selectMa);
        System.out.println(rs);
        Vector vt = new Vector();

        while (rs.next()) {
            System.out.println(rs.getString(1));
            vt.add(0, rs.getString(1));
            vt.add(1, rs.getString(2));
            vt.add(2, rs.getString(3));
            vt.add(3, rs.getString(4));
            vt.add(4, rs.getString(5));
            vt.add(5, rs.getString(6));
            vt.add(6, rs.getString(7));
            vt.add(7, rs.getString(8));
            vt.add(8, rs.getString(9));
        }
        return vt;
    }

    public int Update(Vector vt) {
        String update = "update KhachHang \n"
                + "set TenKhachHang =N'"
                + vt.get(1) + "',SDT_KhachHang ='"
                + vt.get(2) + "',\n"
                + "Email_KhachHang ='"
                + vt.get(3) + "',SoDuong ='"
                + vt.get(4) + "',TenDuong =N'"
                + vt.get(5) + "',\n"
                + "Phuong =N'"
                + vt.get(6) + "',Quan ='"
                + vt.get(7) + "',ThanhPho =N'"
                + vt.get(8) + "'"
                + "where MaKhachHang = '"
                + vt.get(0) + "'";
        int row = 0;
        try {
            row = con.updateSQL(update);

        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
}
