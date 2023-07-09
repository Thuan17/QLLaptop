/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author thuan
 */
public class SanPham {
    private String masanpham,tensanpham,loaisanpham,tenhang;
    private float giasanpham;
    private int soluong;

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public void setLoaisanpham(String loaisanpham) {
        this.loaisanpham = loaisanpham;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public void setGiasanpham(float giasanpham) {
        this.giasanpham = giasanpham;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public String getLoaisanpham() {
        return loaisanpham;
    }

    public String getTenhang() {
        return tenhang;
    }

    public float getGiasanpham() {
        return giasanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public SanPham() {
    }

    public SanPham(String masanpham, String tensanpham, String loaisanpham, String tenhang, float giasanpham, int soluong) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.loaisanpham = loaisanpham;
        this.tenhang = tenhang;
        this.giasanpham = giasanpham;
        this.soluong = soluong;
    }
}
