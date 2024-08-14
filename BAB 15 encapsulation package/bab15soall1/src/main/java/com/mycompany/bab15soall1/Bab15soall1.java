/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soall1;

import kalkulatorpack.Kalkulator;

/**
 *
 * @author HP
 */
public class Bab15soall1 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int hasilTambah = kalkulator.tambah(10, 5);
        System.out.println("Hasil Pertambahan: " + hasilTambah);

        int hasilKurang = kalkulator.kurang(10, 5);
        System.out.println("Hasil Pengurangan: " + hasilKurang);

        float hasilKali = kalkulator.kali(10, 5);
        System.out.println("Hasil Perkalian: " + hasilKali);

        float hasilBagi = kalkulator.bagi(10, 5);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
}
