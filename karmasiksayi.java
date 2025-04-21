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

    // iki karmaşık sayının toplamını yapan motot

//İKİ MATRİSİN TOPLAMI!!!!
class karmasık {
    public int reel;
    public int imajiner;
}
public class karmasiksayi {
public static karmasık topla (karmasık a ,karmasık b){
    karmasık sonuc = new karmasık();
    sonuc.reel= a.reel+b.reel;
    sonuc.imajiner=a.imajiner+b.imajiner;
    return sonuc;
}
    public static void main(String[] args) {
        karmasık a = new karmasık();
        karmasık b = new karmasık();
        a.reel=10;
        a.imajiner=100;
        b.reel=30;
        b.imajiner=50;
        
        karmasık değer = new karmasık();
        değer=topla(a, b);
        System.out.println(değer.reel+"+" +değer.imajiner+"i");
    }

}

    

