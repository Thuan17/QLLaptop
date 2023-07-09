/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import GUI.SQLServerDataProvider;
import POJO.SanPham;
import java.sql.ResultSet;
/**
 *
 * @author thuan
 */
import java.util.ArrayList;
public class SanPhamDAO {
     public static ArrayList<SanPham>GetListSanPham(){
        ArrayList<SanPham>dsSanPham =new ArrayList<SanPham>();
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
                dsSanPham.add(sanpham);
                 
            }
            pro.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return dsSanPham;
    }
}
