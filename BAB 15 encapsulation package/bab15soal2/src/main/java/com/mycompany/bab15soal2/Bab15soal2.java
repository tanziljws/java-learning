package com.mycompany.bab15soal2;

import kalkulator.Pembagian;
import kalkulator.Pengurangan;
import kalkulator.Perkalian;

public class Bab15soal2 {

    public static void main(String[] args) {
        Pengurangan kurang = new Pengurangan();
        Pembagian bagi = new Pembagian();  
        Perkalian kali = new Perkalian();  

        // Operasi kalkulasi
        int hasilKurang = kurang.kurang(10, 5);
        int hasilBagi = bagi.bagi(10, 2);  
        int hasilKali = kali.kali(10, 2);  

        // Menampilkan hasil
        System.out.println("Hasil Pengurangan (10 - 5): " + hasilKurang);
        System.out.println("Hasil Pembagian (10 / 2): " + hasilBagi);
        System.out.println("Hasil Perkalian (10 * 2): " + hasilKali);
    }
}
