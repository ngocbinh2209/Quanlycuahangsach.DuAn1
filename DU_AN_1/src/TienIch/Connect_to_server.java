/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienIch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author QUAN
 */
public class Connect_to_server {

    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=QL_CuaHangSach";
    private static String user = "sa";
    private static String pass = "123";
    Connection connect ;
    Statement stt;
    PreparedStatement ppm;
    
    public Connection Connect() {
        try {
             connect = DriverManager.getConnection(url, user, pass);
             stt = connect.createStatement();
            if(connect!=null){
                System.out.println("Thanh Cong");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect_to_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
    public ResultSet selectSQL(String sql) throws SQLException{
        Connection con = Connect();
        ResultSet rs = stt.executeQuery(sql);
        return rs;
        
    }
    
    
    public int updateSQL(String sql) throws SQLException{
        Connection con = Connect();
        int row = stt.executeUpdate(sql);
        return row;
    }
    
    
    
}
