/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeniuygula;

/**
 *
 * @author VICTUS
 */
public class diziekranayazdirma {
     public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Su";
        ogrenciler[2] = "Azra";
        ogrenciler[3] = "Arda";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        
        System.out.println("----------");
        
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
            
        }

    }
}
