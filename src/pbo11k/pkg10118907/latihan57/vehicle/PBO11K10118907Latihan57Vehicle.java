/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan57.vehicle;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan vehicle
 * 
 */
public class PBO11K10118907Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.setMyBrand("Trek Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        
        System.out.println("Brand : "+b.getMyBrand());
        System.out.println("Model : "+b.getMyModel());
        System.out.println("Jumlah Gear : "+b.getMyGearCount());
        System.out.println("");
        
        Skateboard s = new Skateboard();
        s.setMyBrand("Ally Skate");
        s.setMyModel("Rocket");
        s.setMyBoardLength(54.5);
        
        System.out.println("Brand : "+s.getMyBrand());
        System.out.println("Model : "+s.getMyModel());
        System.out.println("Panjang Board : "+s.getMyBoardLength());
    }
    
}
