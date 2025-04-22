package javaapplication1;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

public class elizyum2 {

    //kullanıcıdan 20 tane isim al bu isimleri ters bir şekilde sırala
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int kalan = 5;
   
       for( int i = 1; i <= 5; i++ ){
           
           System.out.println("isim giriniz: ");
           String isim = scanner.nextLine();
           System.out.println("Kalan isim: " + (kalan-i));
           
       }
 
        scanner = new Scanner(System.in);
         
        System.out.println("sınır sayısını giriniz: ");
        int sinir_sayisi = scanner.nextInt();
        
        int Sayi1 = 0;
        int Sayi2= 1;
        int sayi3;
        
        System.out.print(Sayi1 + " " + Sayi2 + " "  );
        
        for( int i= 3; i <= sinir_sayisi; i++ ){
            sayi3 = Sayi1 + Sayi2;
            Sayi1 = Sayi2;
            Sayi2 = sayi3;
            
            System.out.print(sayi3 + " ");
            
            
            
         }
    }
}
 /*Scanner scanner = new Scanner(System.in);

        int eb = 1;
        for (int i = 1; i <= 5; i++) {

            System.out.println("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();
            if(sayi > eb){
               eb = sayi; 
            }
            

        }
        System.out.println(eb);*/
 /*Scanner scanner = new Scanner(System.in);
      
        System.out.println("Birinci sayıyı giriniz");
        int a = scanner.nextInt();
        
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scanner.nextInt();
        int x;
        x=a;
        a=b;
        b=x;
        
        
        System.out.println("1. sayı = " +a );
        System.out.println("2. sayı = "+ b );*/
 /*Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyelini bulmak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        
        int carpım=1;
        
        for( int i = 1; i<=sayi; i++){
            
            carpım = carpım *i;
            
        }
        System.out.println(carpım);*/
 /*for (int a = 0; a < 4; a++) {
            System.out.print(" * ");
            for (int i = 1; i <= 4; i++) {
                System.out.print(" * ");
            }
            
          System.out.println(" ");  
        }*/
 /*Scanner scanner = new Scanner(System.in);
        
        System.out.println("bir taban degeri giriniz: ");
        int n = scanner.nextInt();
        
        System.out.println("bir üs değeri giriniz: ");
        int m = scanner.nextInt();
        int crpm = 1;
        
        for( int i = 1; i <= m; i++){
            crpm = crpm * n;
            
        }
        System.out.println(crpm);*/
 /*Scanner scanner = new Scanner(System.in);
        
        System.out.println("Oluşturmak istediğiniz satır sayısını giriniz: ");
        int satir_sayisi=scanner.nextInt();
        
        int sayi = 1;
        
        for(int i =1; i <= satir_sayisi; i++){
            for(int a = 1; a <= i; a++  ){
                
                System.out.print(sayi +" ");
                
            sayi++;
                
            
        }
            System.out.println(" ");
        
        }*/
 /*Scanner scanner = new Scanner(System.in);
        System.out.println("dögünün sayısını giriniz: ");
        int dongu = scanner.nextInt();
        
        int sayi = 1 ;
        for(int i = 1; i <= dongu; i++){
            for(int a = 1; a <= i; a++){
                System.out.print(sayi);
            }
            sayi++;
            System.out.println("");
                
        }*/
 /*Scanner scanner =new Scanner (System.in);
      
        System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz:");
        int sayı = scanner.nextInt();
        int Crpm=1;
        for(int i= 1; i<= sayı; i++){
            
            Crpm = Crpm * i;
        }System.out.println(Crpm);*/
 /*int a1 = 1;
        int a2 = 1;
        int a3;
        System.out.print(a1 + " " + a2 + " ");
        for (int i = 2; i < 10; i++) {

            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            System.out.print(a3 + " ");
        }*/
 /*Scanner scanner = new Scanner(System.in);
      
      int toplam = 0;
      while(true){
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        if(sayi == 0){
            break;
        } else{
             toplam = toplam + sayi;
        }
      }System.out.println("toplam = "+toplam);*/
 /*Scanner scanner = new Scanner(System.in);
        int eb = 0;
        int ek = 0;
        double ort = 0;
        int toplam = 0;
        int sayi;
        for (int i = 1; i <= 5; i++) {

            System.out.println("Pozitif bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if (eb < sayi) {
                eb = sayi;

            }
            if (sayi < ek || ek == 0) {
                ek = sayi;

            }
            toplam = toplam + sayi;
            ort = toplam / 5;

        }
        System.out.println("sayıların ortalaması: " + ort);

        System.out.println("En büyük sayı: " + eb);
        System.out.println("en kücük sayı: " + ek);

    }

}*/

 /*Scanner scanner =new Scanner (System.in);
boolean q_mu = true;

do{
    System.out.println("String giriniz: ");
    String string = scanner.nextLine();
    if( charAt.string(0)=='q'){
        
        System.out.println("Döngüden cıktık.");
        boolean q_mu = false;
    }
    
    if(string.charAt(0) == 'A' || string.charAt(0)== 'a' ) {
    boolean q_mu = true;
    System.out.println("");
}*/
    

