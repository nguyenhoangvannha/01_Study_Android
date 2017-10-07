/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai07;

import java.text.DecimalFormat;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class HocXulyDinhDangSo {
    public static void main(String[] args) {
        double toan = 6;
        double ly = 7;
        double hoa = 7;
        double tb = (toan + ly + hoa)/ 3;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Diem trung binh: " + decimalFormat.format(tb));
    }
}
