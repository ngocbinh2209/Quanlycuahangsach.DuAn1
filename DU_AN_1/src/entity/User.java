/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author QUAN
 */
public class User {
    private String userName, passWork;
    private int isClient;

    public User(String userName, String passWork, int isClient) {
        this.userName = userName;
        this.passWork = passWork;
        this.isClient = isClient;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWork() {
        return passWork;
    }

    public void setPassWork(String passWork) {
        this.passWork = passWork;
    }

    public int getIsClient() {
        return isClient;
    }

    public void setIsClient(int isClient) {
        this.isClient = isClient;
    }
    

    

    public User() {
    }
    
}
