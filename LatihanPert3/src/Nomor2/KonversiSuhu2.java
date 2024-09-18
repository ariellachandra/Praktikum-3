/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;

/**
 *
 * @author lenovo
 */
public class KonversiSuhu2 extends KonversiSuhu {
    private double fahrenheit;
    
    void fahrenheitToReamur(double fahrenheit) {
        fahrenheit = (fahrenheit - 32) * 4/9;
        System.out.println("Fahrenheit ke Reamur: " + fahrenheit);
    }
}
