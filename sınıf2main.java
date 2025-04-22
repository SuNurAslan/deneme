
package javaapplication2;

import java.util.Scanner;

public class sınıf2main {
    public static void main(String[] args) {
        d dizi = new d (6);
        Scanner scanner = new Scanner (System.in);
        int secim =0;
        int index;
        do{
            System.out.println("**** MENÜ****");
            System.out.println("1-ekle");
            System.out.println("2-sil");
            System.out.println("3-güncelle");
            System.out.println("4-ekrana yazdır");
            System.out.println("5-ara");
             System.out.println("6-araya eleman ekle");
             System.out.println("7-aradan eleman sil");
            System.out.println("8-çıkış");
            secim=scanner.nextInt();
            String kelime;
            switch(secim){
                case 1:
                    System.out.println("Eklenecek elemanı griin");
                    kelime =scanner.nextLine();
                    dizi.ekle(kelime);
                    break;
                case 2:
                    System.out.println("Silinecek elemanı girin");
                    kelime=scanner.nextLine();
                    dizi.sil(kelime);
                    break;
                case 3:
                    System.out.println("güncellenecek elemanı girin");
                    kelime =scanner.nextLine();
                    System.out.println("Yazılacak elemanı girin");
                    String guncellenecekeleman =scanner.nextLine();
                    dizi.guncelle(kelime, guncellenecekeleman);
                    break;
                case 4:
                    System.out.println("Dizideki elemanlar");
                    dizi.yazdır();
                    break;
                case 5:
                    System.out.println("aranacak kelime");
                    kelime = scanner.nextLine();
                    System.out.println(dizi.arama(kelime));
                    break;
                case 6: 
                    System.out.println("eklenecek elemanı gir:");
                    kelime=scanner.nextLine();
                    System.out.println("index girin: ");
                    index=scanner.nextInt();
                    dizi.arayaekle(kelime, index);
                    break;
                case 7: 
                    System.out.println("Silinecek elemanın indexini gir:");
                    index=scanner.nextInt();
                    dizi.aradansil(index);
                    break;
                case 8:
                    System.out.println("Çıkış yapılıyor");
                    secim=8;
                    break;
            }
        }while(secim != 8);
    }
    
}
