/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO.TabSanPham;

import java.util.logging.Logger;

/**
 *
 * @author thuan
 */
public class ChiTietSP {
    public String TenSP;
    public float GiaBan;
    public int SoLuong;

    public ChiTietSP(String TenSP, float GiaBan, int SoLuong) {
        this.TenSP = TenSP;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
    }

    public ChiTietSP() {
    }

    public String getTenSP() {
        return TenSP;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
  
    
}
