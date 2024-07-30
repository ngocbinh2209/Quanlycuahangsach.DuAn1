/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author QUAN
 */
public class Sach {

    private String MaSach;
    private String TenSach;
    private int Gia;
    private int SoTrang;
    private String ChuDe;
    private String TacGia;
    private int SoLuong;
    private int LuotMua;
    private String Bia;
    private String DanhGia;

    public Sach(String MaSach, String TenSach, int Gia, int SoTrang, String ChuDe, String TacGia, int SoLuong, int LuotMua, String Bia, String DanhGia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Gia = Gia;
        this.SoTrang = SoTrang;
        this.ChuDe = ChuDe;
        this.TacGia = TacGia;
        this.SoLuong = SoLuong;
        this.LuotMua = LuotMua;
        this.Bia = Bia;
        this.DanhGia = DanhGia;
    }

    public Sach() {
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    public String getChuDe() {
        return ChuDe;
    }

    public void setChuDe(String ChuDe) {
        this.ChuDe = ChuDe;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getLuotMua() {
        return LuotMua;
    }

    public void setLuotMua(int LuotMua) {
        this.LuotMua = LuotMua;
    }

    public String getBia() {
        return Bia;
    }

    public void setBia(String Bia) {
        this.Bia = Bia;
    }

    public String getDanhGia() {
        return DanhGia;
    }

    public void setDanhGia(String DanhGia) {
        this.DanhGia = DanhGia;
    }

}
