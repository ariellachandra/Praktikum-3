/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;

/**
 *
 * @author lenovo
 */
public class KonversiSuhu {
    private double celcius;
    
    void celciusToFahrenheit(double celcius) {
        celcius = (celcius * 9/5) + 32;
        System.out.println("Celcius ke Fahrenheit: " + celcius);
    }

    void celciusToReamur(double celcius) {
        celcius = celcius * 4/5;
        System.out.println("Celcius ke Reamur: " + celcius);
    }

}
