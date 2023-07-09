/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author thuan
 */
public class NhanVien {
    private String manhanvien , pass, tennhanvien;
    private float luong;
    private int chucvu ;

    public NhanVien(String manhanvien, String pass, String tennhanvien, float luong, int chucvu) {
        this.manhanvien = manhanvien;
        this.pass = pass;
        this.tennhanvien = tennhanvien;
        this.luong = luong;
        this.chucvu = chucvu;
    }

    public NhanVien() {
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public String getPass() {
        return pass;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public float getLuong() {
        return luong;
    }

    public String getChucvu() {
        String ql="Quan Ly";
        String nv ="Nhan Vien";
       if(chucvu == 0){
           return ql ;
       }else{
           return nv;
       }
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public void setChucvu(int chucvu) {
        this.chucvu = chucvu;
    }
    

    
    
}
