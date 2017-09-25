/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai07;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class HocXuLyToanHoc {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Can bac hai cua n:" + Math.sqrt(n));
        
        int goc = 45;
        double radian = Math.PI * goc /180;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Sin:" + decimalFormat.format(Math.sin(radian)));
        
        Random random = new Random();
        double rNumber = random.nextDouble();
        System.out.println(rNumber);
    }
}
