/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aritmatika;

/**
 *
 * @author HP
 */
public class Perkalian extends OperasiAritmatika {

    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {  
        return a * b;
    }

    public double getHasil() {
        return hitung();
    }
}