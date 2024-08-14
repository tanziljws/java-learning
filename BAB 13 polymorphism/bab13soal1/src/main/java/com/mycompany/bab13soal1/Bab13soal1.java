/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal1;

/**
 *
 * @author HP
 */
public class Bab13soal1 {

    public static void main(String[] args) {
        SimpleCalculator objek = new SimpleCalculator(); 
        
        System.out.println("Hasil Pertambahan : " + objek.tambah(20, 10));
        System.out.println("Hasil Pengurangan : " + objek.kurang(10, 20));
        System.out.println("Hasil Perkalian : " + objek.kali(20, 10));
        System.out.println("Hasil Pembagian : " + objek.bagi(20, 10));
    }
}
