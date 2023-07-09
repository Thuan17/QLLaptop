/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import GUI.SQLServerDataProvider;
import java.sql.ResultSet;

/**
 *
 * @author thuan
 */
public class QLHoaDonDAO {
    public static String HoaDon (String MaHD ,String NoiDung){
        String HoaDon="";
        try{
            String sql ="insert into test values('"+MaHD+"',N'"+NoiDung+"')";
            SQLServerDataProvider pro  = new SQLServerDataProvider();
                pro.open();
                ResultSet rs = pro.executeQuery(sql);
                while(rs.next()){
                     HoaDon=rs.getString(1);
                }
        }catch(Exception ex){
            
        }
        return HoaDon;
    }
    
}
