/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauanpakbejo;

/**
 *
 * @author Ikhsan
 */
public class hitungKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Keramik a = new Keramik((float)0.3,(float)0.3,10,54000);
        System.out.println("Keramik A");
        a.perhitunganHarga();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    
        Keramik a1 = new Keramik((float)0.4,(float)0.4,5,65000);
        System.out.println("Keramik B");
        a1.perhitunganHarga();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    
        Keramik a2 = new Keramik((float)0.3,(float)0.4,8,60000);
        System.out.println("Keramik C");
        a2.perhitunganHarga();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    
    }
}