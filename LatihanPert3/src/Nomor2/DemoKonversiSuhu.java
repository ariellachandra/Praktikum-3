/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;

/**
 *
 * @author lenovo
 */
public class DemoKonversiSuhu {
     public static void main(String[] args) {
        KonversiSuhu konversi1 = new KonversiSuhu();
        konversi1.celciusToFahrenheit(100);
        konversi1.celciusToReamur(100);
        
        KonversiSuhu2 konversi2 = new KonversiSuhu2();
        konversi2.fahrenheitToReamur(212);
        
    }
}
