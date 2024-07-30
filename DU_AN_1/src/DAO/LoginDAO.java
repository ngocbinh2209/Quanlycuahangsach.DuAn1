/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.Vector;
import TienIch.Connect_to_server;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.User;


/**
 *
 * @author QUAN
 */
public class LoginDAO{
    Connect_to_server con = new Connect_to_server();
    
    public List Select() throws SQLException{
        String str = "select Taikhoan, matkhau, vaitro from TKDangNhap";
        ResultSet rs = con.selectSQL(str);
        List<User> tkmk = new ArrayList();
        while (rs.next()) {            
            tkmk.add(new User(rs.getString(1), rs.getString(2), rs.getInt(3)));
        }
        
        return tkmk;
    }
}
