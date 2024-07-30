/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author QUAN
 */
public class DoanhThu {
    private String Masach;
    private String TenSach;
    private int SoluongBan;
    private int GiaSach;
    private int DoanhThu;

    public DoanhThu(String Masach, String TenSach, int SoluongBan, int GiaSach, int DoanhThu) {
        this.Masach = Masach;
        this.TenSach = TenSach;
        this.SoluongBan = SoluongBan;
        this.GiaSach = GiaSach;
        this.DoanhThu = DoanhThu;
    }

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getSoluongBan() {
        return SoluongBan;
    }

    public void setSoluongBan(int SoluongBan) {
        this.SoluongBan = SoluongBan;
    }

    public int getGiaSach() {
        return GiaSach;
    }

    public void setGiaSach(int GiaSach) {
        this.GiaSach = GiaSach;
    }

    public int getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(int DoanhThu) {
        this.DoanhThu = DoanhThu;
    }


    
    
    
}
