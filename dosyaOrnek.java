/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeniuygula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class dosyaOrnek {
public static void main(String[] args) throws FileNotFoundException{
        
       /* String path="d:\\deneme.txt";
       
        File dosya = new File (path);
        
        try{
            if(!dosya.exists()){
                dosya.createNewFile();
            }else{
                System.out.println("Dosya mevcut");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
       
       /*File f = new File ("alis.txt");
       if(f.isDirectory()){
           File [] tumDosyalar = f.listFiles();
           for (int i = 0; i < tumDosyalar.length; i++) {
               System.out.println(tumDosyalar[i].getName());
           }   
           }else{
                   System.out.println("Klasör veya dizin değil");
           
       }*/
       
        
       /*PrintWriter ciktiAkimi=null;
       String dosya = "ornek.txt";
       try{
          ciktiAkimi = new PrintWriter(new FileOutputStream(dosya));
       }
           
       catch(FileNotFoundException e){
            System.out.println("ornek.txt dosyası olustururken hata oldu");
       System.exit(0);
       
}
        System.out.println("Bir ornek cümle giriniz: ");
        Scanner scanner = new Scanner (System.in);
        String cumle = scanner.nextLine();
        ciktiAkimi.println("klavyeden girilen cümle = "+cumle);
        ciktiAkimi.println("dosyayı kapatabilirsiniz");
        ciktiAkimi.close();
        System.out.println("Girilen cumle ornek.txt dosyasına yazıldı");
*/
       
       /*File dosya = new File ("abla.txt");
       if(dosya.exists()){
           System.out.println("Dosya zaten var");
           System.exit(0);
       }
       else{
           try {
               PrintWriter pw =new PrintWriter(dosya);
           pw.print("Ali bal");
           pw.println(90);
           pw.print("Ayşe DÖNMEZ");
           pw.println(60);
           pw.close();
               
           } catch (Exception e) {
               System.out.println("Hata bulundu");
           }
           
       }*/
      /* File dosya = new File ("nisa.txt");
       PrintWriter cikti = null;
       Scanner scanner = new Scanner (System.in);
        try {
            if(!dosya.exists()){
           dosya.createNewFile();
       }else{
           cikti = new PrintWriter(dosya);
           for (int i =0; i<3;i++){
               System.out.println(i+".Ogrenci adi soyadi ve notu");
               String ad = scanner.nextLine();
               String soyad = scanner.nextLine();
               int not =scanner.nextInt();
               cikti.print(ad + " " +soyad +" "+not);
           }
           cikti.close();
       }
            
        } catch (Exception e) {
        }*/
     
      
      File dosya = new File ("ornek.");
        
            Scanner giris= new Scanner(dosya);
            while(giris.hasNext()){
                String isim = giris.next();
                String soyad = giris.next();
                int notu = giris.nextInt();
                System.out.println(isim +" "+soyad + " "+notu);
            }
             giris.close();
        
       
       
      
       
       
       
       
       
       
       
       
       
        
       
       
       
       
       
       
       
       
    }
    
}
