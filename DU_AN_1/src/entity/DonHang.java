/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author QUAN
 */
public class DonHang {
    private String maDonHang, MakhachHang, diaChi, TrangThai;
    private Date ngayMua;

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMakhachHang() {
        return MakhachHang;
    }

    public void setMakhachHang(String MakhachHang) {
        this.MakhachHang = MakhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public DonHang(String maDonHang, String MakhachHang, String diaChi, String TrangThai, Date ngayMua) {
        this.maDonHang = maDonHang;
        this.MakhachHang = MakhachHang;
        this.diaChi = diaChi;
        this.TrangThai = TrangThai;
        this.ngayMua = ngayMua;
    }
    
}
