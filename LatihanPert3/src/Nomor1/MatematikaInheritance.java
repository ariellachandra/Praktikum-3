/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

/**
 *
 * @author lenovo
 */
public class MatematikaInheritance {
    public static void main (String[] args){
        Matematika mtk = new Matematika();
        mtk.pertambahan (20, 10);
        mtk.pengurangan (10, 5);
        mtk.perkalian (10, 3);
        mtk.pembagian (21, 2);
        
        Matematika2 mtk2 = new Matematika2();
        mtk2.modulus (25, 4);
        
    }
}
