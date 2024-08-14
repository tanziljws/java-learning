/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11soal1;

/**
 *
 * @author HP
 */
public class Bab11Soal1 {

    public static void main(String[] args) {
       Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(0001, "Uzumaki Bayu", "yaadi", "tukang live tiktok", 100000);
        karyawan1.getKaryawan();
        
        System.out.println("----------------------------");
        
        Karyawan karyawan2 = new Karyawan();
        karyawan2.setKaryawan(0002, "zidan", "nana", "karyawan mrbeast", 6000000);
        karyawan2.getKaryawan();
        
        System.out.println("----------------------------");
        
        Karyawan karyawan3 = new Karyawan();
        karyawan3.setKaryawan(0003, "Rajib", "dani", "simpenan janda", 1200000);
        karyawan3.getKaryawan();

        System.out.println("----------------------------");

        Karyawan karyawan4 = new Karyawan();
        karyawan4.setKaryawan(0004, "Tanzil", "O", "Ustadz", 1500000000);
        karyawan4.getKaryawan();
    }
}
