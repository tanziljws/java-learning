/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal1;

/**
 *
 * @author HP
 */
public class Bab18soal1 {

    public static void validate(int age) {
        if (age < 17) {
            throw new ArithmeticException("Orang ini belum memenuhi syarat untuk vote!");  // ini adalah contoh throw (Melempar exception )
        } else {
            System.out.println("Orang ini sudah memenuhi syarat untuk vote!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // ini adalah contoh Block try catch (Menangkap Exception)
        }
        System.out.println("Rest of the code...");
    }
}

/* 
Throw (Melempar Exception):
Digunakan untuk secara langsung melemparkan exception, biasanya saat menemukan kondisi error. Ini memungkinkan exception tersebut untuk ditangani oleh kode pemanggil atau di level yang lebih tinggi.

Blok try-catch (Menangkap Exception):
Digunakan untuk menangkap dan mengatasi exception yang terjadi selama eksekusi program. Ini memungkinkan program untuk tetap berjalan setelah exception ditangani.
 */