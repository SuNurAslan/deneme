package javaapplication1;

import java.util.Scanner;

public class javaclassroommetotlar {

    /* public static int toplama(int a,int b,int c){
        return a+b+c;
    }*/
 /*public static void toplam(int a ,int b,int c  ){
        System.out.println((a+b+c));
    }*/
 /*  public static void selamlam(String isim){
        
        System.out.println("Selamlar "+isim);
        
    }*/

 /* public static void faktoruyrl(){
     Scanner scanner = new Scanner(System.in);
      System.out.println("Bir sınır sayısı giriiz:");
      int sinir_sayisi=scanner.nextInt();
     int crpm =1;
     for(int i = 1;i<=sinir_sayisi;i++){
         crpm*=i;
         
     }
      System.out.println("sonuc = "+crpm);
      
      
      
  }*/
 /* public static String terseedondur(String kelime) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime1 = scanner.nextLine();
        String sonuc="";
    
        for(int i =kelime1.length()-1;i>=0;i--){
          sonuc+=kelime1.charAt(i);
          
          
            System.out.println(sonuc);
            
            
            
        }

        return sonuc;
    }*/

 public static int harfsayisi(String kelime , char harf){
     
        int sayac=0;
        
        for(int i =0;i<kelime.length();i++){
            if(kelime.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println("Aranılan harf sayısı = "+sayac);
        return sayac;
    }
    public static void main(String[] args) {
        //toplam(4, 5, 3);
        //selamlam("murat");
        //  faktoruyrl();
        /* Scanner scanner= new Scanner (System.in);
        System.out.println("Bir kelime giriniz:");
        String kelime=scanner.nextLine();
        String yeni_kelime="";
        
        for(int i =kelime.length()-1;i>=0;i--){
            yeni_kelime+=kelime.charAt(i);
        }
        System.out.println(yeni_kelime);*/


 Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime =scanner.nextLine();
        System.out.println("Hangi harfi ariosunuz");
        char harf = scanner.next().charAt(0);
        System.out.println(harfsayisi(kelime, harf));
         
    }

}
