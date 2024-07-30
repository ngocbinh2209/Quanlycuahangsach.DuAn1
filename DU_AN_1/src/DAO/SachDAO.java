/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import TienIch.Connect_to_server;
import java.sql.Connection;
import java.util.List;
import java.sql.Statement;
import java.sql.SQLException;
import entity.Sach;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author QUAN
 */
public class SachDAO {

    Connect_to_server con = new Connect_to_server();
    Statement stt;
    String selectAll = "select MaSach,TenSach,GiaSach,SoTrangSach, b.TheLoai,TacGia,SoLuongSach,LuotMuaSach,BiaSach,DanhGiaSach "
            + "from sach a inner join TheLoai b "
            + "on a.MaTheLoai = b.MaTheLoai";
    Connection connect;

    public List selectSach(String chuDe) throws SQLException {
        List<Sach> list = new ArrayList<>();
        connect = con.Connect();

        if (!chuDe.equals("Tất cả")) {
            ResultSet rs = selectChuDeSQL(chuDe);

            while (rs.next()) {
                list.add(new Sach(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10)));
            }

        } else {
            ResultSet rs = con.selectSQL(selectAll);
            while (rs.next()) {
                list.add(new Sach(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10)));
            }

        }
        return list;
    }

    public ResultSet selectChuDeSQL(String chuDe) throws SQLException {
        stt = (Statement) connect.createStatement();
        String selectChuDe = "select MaSach,TenSach,GiaSach,SoTrangSach, b.TheLoai,TacGia,SoLuongSach,LuotMuaSach,BiaSach,DanhGiaSach "
                + "from sach a inner join TheLoai b "
                + "on a.MaTheLoai = b.MaTheLoai where b.TheLoai = N'";

        selectChuDe += chuDe + "'";

        ResultSet rs = stt.executeQuery(selectChuDe);
        return rs;

    }

    public int insertSach(Vector vt) {
        String InsertSQL = "insert into Sach(MaSach,TenSach,GiaSach,SoTrangSach,MaTheLoai,TacGia,SoLuongSach,LuotMuaSach,BiaSach,DanhGiaSach) values ('"
                + vt.get(0) + "',N'"
                + vt.get(1) + "','"
                + vt.get(2) + "','"
                + vt.get(3) + "','"
                + vt.get(4) + "','"
                + vt.get(5) + "','"
                + vt.get(6) + "','"
                + vt.get(7) + "','"
                + vt.get(8) + "','')";
        int row = 0;
        try {
            row = con.updateSQL(InsertSQL);

        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public int DeleteSach(String maXoa) throws SQLException {
        int row = 0;
        String delete = "delete from sach where MaSach = '";
        delete += maXoa + "'";
        row = con.updateSQL(delete);
        return row;
    }

    public Vector selectIDSach(String ID) throws SQLException {
        stt = (Statement) connect.createStatement();
        String selectChuDe = "select MaSach,TenSach,GiaSach,SoTrangSach, a.MaTheLoai,TacGia,SoLuongSach,LuotMuaSach,BiaSach,DanhGiaSach "
                + "from sach a inner join TheLoai b "
                + "on a.MaTheLoai = b.MaTheLoai where a.MaSach = N'";

        selectChuDe += ID + "'";

        ResultSet rs = con.selectSQL(selectChuDe);
        Vector Vsach = new Vector<>();
        while (rs.next()) {
            Vsach.add(0, rs.getString(1));
            Vsach.add(1, rs.getString(2));
            Vsach.add(2, rs.getString(5));
            Vsach.add(3, rs.getString(6));
            Vsach.add(4, rs.getInt(3));
            Vsach.add(5, rs.getInt(4));
            Vsach.add(6, rs.getInt(7));
            Vsach.add(7, rs.getInt(8));
            Vsach.add(8, rs.getString(9));
        }
        return Vsach;

    }

    public int updateSach (Vector sach) throws SQLException{
        String update = "update Sach \n"
                + "set TenSach =N'"
                + sach.get(1)+"' ,GiaSach = '"
                + sach.get(2)+"' ,SoTrangSach = '"
                + sach.get(3)+"',\n"
                + "MaTheLoai = '"
                + sach.get(4)+"',TacGia =N'"
                + sach.get(5)+"' ,SoLuongSach = '"
                + sach.get(6)+"',\n"
                + "LuotMuaSach = '"
                + sach.get(7)+"',BiaSach = '"
                + sach.get(8)+"'\n"
                + "where MaSach = '"
                + sach.get(0)+"'";
        
        int a = con.updateSQL(update);
        return a;
    }

}
