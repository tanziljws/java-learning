/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator;

/**
 *
 * @author HP
 */
public class Pembagian extends OperasiAritmatika {

    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return a / b;
    }
}
