package DAO;

import GUI.SQLServerDataProvider;
import POJO.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import GUI.QuanLy;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thuan
 */
public class QLBanHangDAO {
      
   public static String getKhachHang(String sdt){
       String SDT="";
       try{
           String sql = "select TenKhach from KhachHang where Sdt ='0329867771'";
           SQLServerDataProvider pro  = new SQLServerDataProvider();
                pro.open();
                ResultSet rs = pro.executeQuery(sql);
                while(rs.next()){
                     SDT=rs.getString(1);
                }
       }catch(Exception ex){
           System.out.print( "Lỗi load Teen khach");
       } 
       return SDT;
     }
   
   
     public static String getHang(){
        String Hang= "";
        try{
            String sql = "select * from HangSanXuat";
             SQLServerDataProvider pro  = new SQLServerDataProvider();
                pro.open();
                ResultSet rs = pro.executeQuery(sql);
                while(rs.next()){
                     Hang=rs.getString(1);
                }
        }catch(Exception ex){}
        return Hang ;
    
    }
     
     public static String findSanPham(String  mSP){
         String SanPham="";
         try{
             String sql = "SELECT  TenSanPham  FROM SanPham where MaSanPham =N'"+mSP+"'";
              SQLServerDataProvider pro  = new SQLServerDataProvider();
                pro.open();
                ResultSet rs = pro.executeQuery(sql);
                while(rs.next()){
                     SanPham=rs.getString(1);
                             }
         }catch(Exception ex){
        }
         return SanPham;
         
     }
     
     public static String listSPP(String MaSP){
       MaSP=QuanLy.NameSP;
         String Ma="";
            try{
                String sql ="SELECT  TenSanPham  FROM SanPham where MaSanPham =N'"+MaSP+"'";
                SQLServerDataProvider pro  = new SQLServerDataProvider();
                 pro.open();
                ResultSet rs= pro.executeQuery(sql);
                while(rs.next()){
                     SanPham sanpham =new SanPham();
                }
                pro.close();
            }catch(Exception ex){}
         return Ma;
     }
     
     
       public static String getLoaiSanPham(String MaSP){
        String Hang= "";
        try{
            String sql = "select LoaiSanPham from SanPham where MaSanPham = N'"+MaSP+"'";
             SQLServerDataProvider pro  = new SQLServerDataProvider();
                pro.open();
                ResultSet rs = pro.executeQuery(sql);
                while(rs.next()){
                     Hang=rs.getString(1);
                }
        }catch(Exception ex){}
        return Hang ;
    
    }
       
    public static double getGiaSanPham(String MaSP){
        double sum = 0 ;
        try{
            String sql ="select GiaSanPham from SanPham where MaSanPham = N'"+MaSP+"'";
             SQLServerDataProvider pro  = new SQLServerDataProvider();
                pro.open();
                ResultSet rs = pro.executeQuery(sql);
                while(rs.next()){
                     sum=rs.getDouble(1);
                }
        }catch(Exception ex){
           System.out.print( "Lỗi load Tiên");
        }
        return sum ;
    }
    
    
     
     
     
     
     
     
   
}
     
  
