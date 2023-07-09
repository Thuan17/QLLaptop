/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO.TabBanHang;

/**
 *
 * @author thuan
 */
public class ListSanPham {
    public String TenSanPham,LoaiSanPham ;
    public float GiaBan;
    public int SoLuong;

    public ListSanPham(String TenSanPham, String LoaiSanPham, float GiaBan, int SoLuong) {
        this.TenSanPham = TenSanPham;
        this.LoaiSanPham = LoaiSanPham;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
    }

    public ListSanPham() {
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public String getLoaiSanPham() {
        return LoaiSanPham;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public void setLoaiSanPham(String LoaiSanPham) {
        this.LoaiSanPham = LoaiSanPham;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
