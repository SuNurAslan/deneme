/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeniuygula;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class dosyaornekyeni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File klasor;
        String dosya ="C:\\deneme\\";
        int secim;
        do{
            System.out.println("1-Dosya ekle");
            System.out.println("2-Dosya sil");
            System.out.println("3-Dosya listele");
            System.out.println("4-Çıkış");
            System.out.println("Seciminiz(1/2/3/4)?");
            secim =scanner.nextInt();
            scanner.nextLine();//buffer'ı temizle
            if(secim==1){
                System.out.println("Dosyanın adını giriniz:");
                String ad =scanner.nextLine();
                try {
                    klasor=new File (dosya+ad+".txt");
                    if(!klasor.exists())
                        klasor.createNewFile();
                    System.out.println("Klasör oluştu");
                } catch (Exception e) {
                }
            }else if(secim ==2){
                System.out.println("Silinecek dosya adı :");
                String dosyaAdı = scanner.nextLine();
                klasor =new File (dosya+dosyaAdı+".txt");
                if(klasor.exists()){
                    klasor.delete();
                    System.out.println("Klasor silindi");
                }
                
            }else if(secim == 3){
                klasor=new File(dosya);
                File[]liste =klasor.listFiles();
                for(int i =0;i<liste.length;i++){
                    System.out.println(liste[i].getName());
                }
                
            }else if(secim == 4){
                break;
            }else{
                System.out.println("Yanlış giriş yaptınız!");
            }
            
        }while(true);
    }
    
}
