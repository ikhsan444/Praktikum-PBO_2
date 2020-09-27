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
public class Keramik {
    double ukuran1;
    double ukuran2;
    double box;
    double hargaBox;
    
    Keramik(float u1,float u2,float b,float h){
        this.ukuran1 =u1;
        this.ukuran2=u2;
        this.box=b;
        this.hargaBox=h;
        

    }
    double perhitunganHarga(){
    double harga;
    double jmlBox;
    double total;
    total = this.box*this.ukuran1*this.ukuran2;
    jmlBox =  (100/total) ;
    harga=100/total*this.hargaBox;
    System.out.println("Jumlah total Box nya adalah "+jmlBox);
    System.out.println("Harga total nya adalah Rp."+Math.floor(harga));
    return  harga;
    
    }
}
