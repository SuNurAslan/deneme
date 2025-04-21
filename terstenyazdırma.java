
package yeniuygula;

import java.util.Scanner;


public class terstenyazdırma {
    public static void faktoriyel() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sınır sayısı belirleyiniz: ");
        int sinir_sayisi = scanner.nextInt();
        int crpm = 1;
        for (int i = 1; i <= sinir_sayisi; i++) {
            crpm *= i;
        }
        System.out.println("Faktöriyel = " + crpm);

    }

    public static int toplam(int a) {
        int rtrn = 1;

        int toplam = 0;
        for (int i = 0; i <= a; i++) {
            toplam += i;
        }
        System.out.println("Toplamı = " + toplam);
        return rtrn;
    }
    public static String terstenyaz(String kelime){
        String rtrn ="";
        String yeni_String="";
        
        for(int i =kelime.length()-1;i>=0;i--){
            yeni_String+=kelime.charAt(i);
        }
        System.out.println("Ters hali :" +yeni_String);
        
        return rtrn;
        
    }

    /* public static String tersedondur(String kelime){
        String rtrn="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        kelime =scanner.nextLine();
        String terstenkelime="";
        for(int i =kelime.length()-1;i>=0;i--){
            terstenkelime+=kelime.charAt(i);
        }
        System.out.println("Kelimenin tersi = "+terstenkelime);
        return rtrn;
    }*/
 /*public static int ebob (int a, int b){
     int ebob =1;
     for(int i=1; i<=a && i<=b; i++ ){
         if(a % i ==0 && b % i ==0){
             ebob =i;
       
         }
     }
     return ebob;
 }*/
 /* public static boolean asalMi(int sayi){
      
        for(int i =2;i<sayi;i++){
            
            if(sayi % i ==0){
                
                return false;
                
            }
        }
        return true;
    }*/
    public static void main(String[] args) {

       // faktoriyel();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Bir sınır sayısı giriniz:");
        //int a = scanner.nextInt();
        //toplam(a);
        System.out.println("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        System.out.println(terstenyaz(kelime));
        // System.out.println(tersedondur("kelime"));

        /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1= scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println(ebob(sayi1, sayi2));*/
 /*  for(int i=2;i<100;i++){
            if(asalMi(i)){
                System.out.println(i);
            }
         }
         */
    }

    
}
