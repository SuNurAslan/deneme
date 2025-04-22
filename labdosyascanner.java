
package javaapplication1;

import java.io.*;
import java.util.Scanner;

//public class labdosyascanner {
    /*public static void main(String[] args) {
        //Bir dosyaya 100 tane rastgele sayı yazdırma;
        File dosya =new File("sayilar.txt");
        PrintWriter p;
        try {
            p=new PrintWriter(new FileOutputStream(dosya,false));
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                p.println(r.nextInt(0, 100));
                p.close();
                FileInputStream f =new FileInputStream(dosya);
                int dosyaBoyutu =(int)dosya.length();
                byte [] b =new byte[dosyaBoyutu];
                f.read(b);
                for (int j = 0; j < b.length; j++) {
                    System.out.println("");
                    f.close();
                    
                }
            }    
                
            
        } catch (Exception e) {
        }
        
    }*/
    
    
    //Her satırda rastgele sayıda sayı 20 satır dosya oluştur knks
    /*public static void main(String[] args) {
        File dosya = new File("sayi.txt");
        PrintWriter p;
        try {
            p=new PrintWriter(new FileOutputStream(dosya));
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                int elemansay=random.nextInt(5,20);
                for (int j = 0; j < elemansay; j++) {
                    p.print(random.nextInt(0, 100)+"\t");
                    p.println();
                    
                }
                p.close();
            }
            
        } catch (Exception e) {
        }*/
    
    
        //her bir satırın ortalaması kaç eleman varsa
    /*public static void main(String[] args) {
        Scanner oku ;
        File dosya = new File ("sayi.txt");
        try {
            oku = new Scanner(dosya);
            while(oku.hasNext()){
                String okunan =oku.nextLine();
                String []dizi =okunan.split("\t");
                int top =0;
                for (String dizi1 : dizi) {
                    top += Integer.parseInt(dizi1);
                    double ort =(double)top/dizi.length;
                    System.out.println(ort+"\t"+okunan);
                }
                oku.close();
                    
                }
        } catch (Exception e) {
        }*/
   // }
    //ÖDEV:BİR KLASÖRÜN İÇERİSİNDE BİRÇOK TXT UZANTILI DOSYA BULUNMAKTAADIR HER BİR DOSAYDA FARKLI SAYIDA SAYILAR BULUNMAKTADIR.
   // BU DOSYALARRDAKİ SAYILARI OKUYARAK BİRLEŞTİR.TXT İSİMLİ BİR DOSYA OLUŞTURUP 
    //SAYIŞLARI BURDAN BİRLEŞTİREN VE İÇİNDE EN FAZLA SAYI BULUNANA DOSYANIN ADINI EKRANA YAZDIRAN JAVA UYGULAMASINI YAZINIZ.
    //KENDİN OLUŞTUR DOSYALARI.
    //ÖDEV:BİR DOSYADA HARFLER VE RAKAMLAR BULUNMAKTADIR. BU DOSYADAKİ VERİLERİ OKUYARAK HARFLERİ HARF.TXT RAKAMLARI İSE RAKAMLAR.TXT OLARAK YAZDIRAN JAVA KODU.
    //}
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

