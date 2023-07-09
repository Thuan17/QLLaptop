/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.TabSanPham;
import GUI.SQLServerDataProvider;
import POJO.SanPham;
import POJO.TabSanPham.ChiTietSP;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author thuan
 */
public class QLSanPhamDAO {
    public static ArrayList<SanPham>GetSanPham(){
        ArrayList<SanPham>listsanPham = new ArrayList<SanPham>();
        try{
            String sql="Select *from SanPham";
            SQLServerDataProvider pro  = new SQLServerDataProvider();
            pro.open();
             ResultSet rs= pro.executeQuery(sql);
            while(rs.next()){
              SanPham sanpham =new SanPham();
              sanpham.setMasanpham(rs.getString("MaSanPham"));
              sanpham.setTensanpham(rs.getString("TenSanPham"));
              sanpham.setGiasanpham(rs.getFloat("GiaSanPham"));
              sanpham.setLoaisanpham(rs.getString("LoaiSanPham"));
              sanpham.setSoluong(rs.getInt("SoLuong"));
              sanpham.setTenhang(rs.getString("TenHang"));
                listsanPham.add(sanpham);
            }
        }catch(Exception ex){
             ex.printStackTrace();
        }
        return listsanPham;
    }
    
    public static ArrayList<ChiTietSP>TimTheoMaSanPham(String MaSP){
        ArrayList<ChiTietSP>listsanPham = new ArrayList<ChiTietSP>();
        try{
            String sql="select TenSanPham , GiaSanPham,SoLuong from SanPham where MaSanPham = N'"+MaSP+"'";
            SQLServerDataProvider pro  = new SQLServerDataProvider();
            pro.open();
             ResultSet rs= pro.executeQuery(sql);
            while(rs.next()){
              ChiTietSP sanpham =new ChiTietSP();
                sanpham.setTenSP(rs.getString("TenSanPham"));
                sanpham.setGiaBan(rs.getFloat("GiaSanPham"));
                sanpham.setSoLuong(rs.getInt("SoLuong"));
              
           
                listsanPham.add(sanpham);
            }
        }catch(Exception ex){
             ex.printStackTrace();
        }
        return listsanPham;
    }
}
