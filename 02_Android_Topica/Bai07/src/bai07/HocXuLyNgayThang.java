/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import jdk.nashorn.internal.ir.Symbol;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class HocXuLyNgayThang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Year: " + year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Month: " + (month + 1));
        int day = calendar.get(Calendar.DATE);
        System.out.println("Day: " + day);
        
        Date date = Calendar.getInstance().getTime();
        System.out.println("Date: " + date);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Hom nay:" + sdf.format(date));
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss");
        System.out.println("Time: " + sdf2.format(date));
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss aaa");
        System.out.println("Sang hay chieu: " + sdf3.format(date));
    }
    
}
