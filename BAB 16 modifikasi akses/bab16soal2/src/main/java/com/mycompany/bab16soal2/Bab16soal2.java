/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16soal2;

import Aritmatika.Penjumlahan;
import Aritmatika.Pengurangan;
import Aritmatika.Perkalian;
import Aritmatika.Pembagian;
/**
 *
 * @author HP
 */
public class Bab16soal2 {

    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;

        // Membuat objek dari setiap operasi
        Penjumlahan penjumlahan = new Penjumlahan(a, b);
        Pengurangan pengurangan = new Pengurangan(a, b);
        Perkalian perkalian = new Perkalian(a, b);
        Pembagian pembagian = new Pembagian(a, b);

        // Mengakses metode protected melalui metode public getHasil()
        System.out.println("Hasil Penjumlahan (9.5 + 2.5): " + penjumlahan.getHasil());
        System.out.println("Hasil Pengurangan (9.5 - 2.5): " + pengurangan.getHasil());
        System.out.println("Hasil Perkalian (9.5 * 2.5): " + perkalian.getHasil());
        System.out.println("Hasil Pembagian (9.5 / 2.5): " + pembagian.getHasil());
    }
}
