/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import GUI.SQLServerDataProvider;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thuan
 */
public class DangNhapDAO {
   public static String getPass(String user){
        String password="";
        try{
              String sql = "select PassWord from NhanVien where MaNhanVien =N'"+user+"'";
            SQLServerDataProvider pro  = new SQLServerDataProvider();
          
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while(rs.next()){
                 password=rs.getString(1);
            }
             pro.close();
        }catch(Exception ex){
            System.out.print("Lỗi không thấy dữ liệu1111");
        }
        return password;
    }
    
     public static String getUsername(String user){
         String userName="";
        try{
          String sql = "select MaNhanVien from NhanVien where  MaNhanVien ='"+user+"'";
           SQLServerDataProvider pro  = new SQLServerDataProvider();
          
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while(rs.next()){
                 userName=rs.getString(1);
            }
             pro.close();
        }catch(Exception ex){
            System.out.print("Lỗi không thấy dữ liệu");
        }
        return userName;
       
    }
     
     public static String getName(String user ){
         String Name="";
            try{
                String sql="select TenNhanVien from NhanVien where MaNhanVien='"+user+"' ";
                  SQLServerDataProvider pro  = new SQLServerDataProvider();
                pro.open();
                ResultSet rs = pro.executeQuery(sql);
                while(rs.next()){
                     Name=rs.getString(1);
            }
             pro.close();
            }catch(Exception ex){
                System.out.print("Lỗi không thấy dữ liệu ten nhan vien");
            }
         
         
         return Name;
     
     }
     
     public static String checkRole(String user,String pass){
         String Role = "";
         try{
             String sql = "select ChucVu from NhanVien where MaNhanVien='"+user+"' and PassWord ='"+pass+"'";
             SQLServerDataProvider pro = new SQLServerDataProvider();
             pro.open();
             ResultSet rs= pro.executeQuery(sql);
             while(rs.next()){
                 Role=rs.getString(1);
             }
             pro.close();
         }catch(Exception ex){
             System.out.print("Loi Role");
         }
         return Role;
     }
     
     
     public void checkRolee(String user,String pass){
         try{
             String sql = "select ChucVu from NhanVien where MaNhanVien='"+user+"' and PassWord ='"+pass+"'";
            SQLServerDataProvider pro  = new SQLServerDataProvider();
            pro.open();
            int n= pro.executeUpdate(sql);
            pro.close();
         }catch(Exception ex){
             System.out.print("Loi Role");
         }
     }
  
     
    
     
  
     
     
     

     
     
     
     

     
     
     
}
