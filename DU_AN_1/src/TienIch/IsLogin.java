/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienIch;

import entity.User;
import java.util.List;

/**
 *
 * @author QUAN
 */
public class IsLogin {
    public static User islogin = null;
    
    
    public void clearLogin(){
        IsLogin.islogin = null;
    }
    
    public boolean getLogin(){
        return IsLogin.islogin!=null;
    }
    
}
