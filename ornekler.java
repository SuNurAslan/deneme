
package yeniuygula;

import java.util.Scanner;


public class ornekler {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Bir a taban sayısı giriniz");
        int a = scanner.nextInt();
        System.out.println("Bir  b üs saysısı giriniz ");
        int b = scanner.nextInt();
        int crpm = 1;
        for (int i = 0; i < b; i++) {
            crpm = crpm * a;
           
        }
       System.out.println("Sonuç =" + crpm);

        /*Scanner scanner = new Scanner(System.in);
        /* System.out.println("Bir String giriniz: ");
        String string = scanner.nextLine();
        
      for(int i =0;i<string.length();i++){
          for(int j =0;j<=i;j++){
              System.out.print(string.charAt(string.length() - j-1) + " ");
          }
          System.out.println("");
      }*/

 /*System.out.println(" bir sayı giriniz: ");
       int  sayi = scanner.nextInt();
       String s = Integer.toString(sayi);
       for(int i =0;i<s.length();i++){
           for(int j =0; j<=i;j++){
               System.out.print(s.charAt(j)+" ");
               
           }
           System.out.println("");
       }*/
 /*System.out.println("Bir string giriniz: ");
        String s=scanner.nextLine();
        int sayac =0;
        for(int i =0;i<s.length()-1;){
          if(s.charAt(i)=='a' && s.charAt(i+1)=='a'){
            sayac++;
            i+=2;
          }  
         else i++;
        }
        System.out.println(sayac);*/
 /*System.out.println("Bir sayi giriniz.");
        int sayi = scanner.nextInt();
      for(int i =1; i<=sayi;i++){
         for(int j =1; j<=i; j++){
             System.out.print(i+ " ");
             
         } 
         System.out.println("");
      }*/
 /*System.out.println("Bir string giriniz: ");
        String s = scanner.nextLine();
        
       for(int i = s.length()-1; i>=0;i--){
           System.out.print(s.charAt(i));
       }*/
 /* System.out.println("4 basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();
         
         System.out.println(sayi / 1000 + " binler basamağıdır");
         sayi = sayi - (sayi/1000)*1000;
         System.out.println(sayi/100 + " yüzler basamağıdır.");
         sayi = sayi-(sayi/100)*100;
         System.out.println(sayi/10 +" onlar basamağıdır.");
         System.out.println(sayi  % 10 + " birler basamağıdır");
         */
 /* System.out.println("Bir tam sayı giriniz :");
        int sayi = scanner.nextInt();
        
        int temp = sayi ;
        int basamaksayisi =0;
        int gecici=temp;
        if(gecici ==0){
        basamaksayisi=1;
        }else{
            while (gecici>0){
                basamaksayisi++;
                gecici/=10;
            }
        }
        System.out.print("Basamaklar: ");
        int kuvvet =1;
        for(int i =0; i<basamaksayisi-1;i++){
            kuvvet*=10;
        }
       temp=sayi;
        for (int i = 0; i < basamaksayisi; i++) {
            int basamak = temp/kuvvet;
            System.out.print(basamak+" ");
            temp%=kuvvet;
            kuvvet/=10;
        }*/
 /* System.out.println("Bir sayı giriniz: ");
       int k = scanner.nextInt(); 
       
       for(int i =k;i>0;i/=2){
           
           System.out.print(i%2+" ");
           
       }*/
 /*System.out.println("Bir string giriniz: ");
        String s = scanner.nextLine();
        
        System.out.println("Bir string ddaha giriniz: ");
        String s2 = scanner.nextLine();
        
        int boy1 = s.length();
        int boy2 = s2.length();
        int deger;
        if(boy1<boy2){
            deger = boy1;
        }else deger = boy2;
        
        for(int i =0;i<deger;i++){
            
                if(s.charAt(i)==s2.charAt(i)){
                    System.out.print(s.charAt(i));
                
            }
        }*/
 /*System.out.println("2 Tabanlı bir sayı giriniz: ");
        String binary = scanner.nextLine();
        
        boolean binaryMi = true;
        for(int i =0; i<binary.length();i++){
            char ch =binary.charAt(i);
            if(ch != '0' && ch != '1'){
                binaryMi=false;
                break;
            }
        }
       if(!binaryMi){
           System.out.println("Geçersiz binary sayı,Lütfen 0 lardan ve 1 lerden oluşan bir sayı giriniz: ");
           return;
       }
       int tabanlı10 =0;
      
       for(int i =0; i<binary.length();i++){
           char binarychar = binary.charAt(i);
           int binarybas = binarychar-'0';
           
           tabanlı10 =tabanlı10*2+binarybas;
       }
       
        System.out.println("10 lu tabanlı karşılığı: "+tabanlı10);
         */
 /*int toplam =0;
        int sayac =0;
        double ort =0;
        while(true){
        System.out.println("Rastgele bir sayı giriniz: (9999 girilirse program durur) ");
        int sayi = scanner.nextInt();
        if(sayi == 9999){
            break;
        }
        if(sayi % 2 ==0){
            sayac++;
            System.out.println(sayi + " ");
            toplam+=sayi;
        }    
            
        }
      if(sayac>=1){ 
       ort = toplam / sayac;
        System.out.println("ortalama = "+ort);
      }else{
          System.out.println("9999 girildi ya da sayılar tek");
      }*/
 /* System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
         for(int i =2; i<=(int )Math.sqrt((double)sayi); i++){
             if(sayi%i==0){
                 System.out.println("Sayı asal değildir.");
                 break;
             }
            
         }
       System.out.println("Girilen sayı asaldır");  
         */
 /* System.out.println("bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        if (sayi <= 1) {
            asalMi = false;
        } else if(sayi ==2){
            asalMi =true;
        }else if (sayi % 2 == 0) {
            asalMi = false;
        }else {
            for (int i = 3; i <= sayi / 2; i+=2) {
                if (sayi % i == 0) {
                   asalMi=false;
                   break;
                }

            }

        }
        if(asalMi){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }*/
 /* System.out.println("Bir string giriniz: ");
        String s = scanner.nextLine();
        int sayac = 0;
        for(int i =0; i<5;i++){
            char c = scanner.next().charAt(0);
        if(c=='x' || c=='X'){
            
            sayac++;
        }
            
        }
       System.out.println("x ya da X "+sayac +" addeddir");*/
 /*int x=scanner.nextInt();
       int toplam =1;
       for(int i =1;i<=6;i++){
           toplam += Math.pow((double )(x),(double) (i));
           
       }System.out.println("Sonuc = "+toplam);
         */
 /* System.out.println("Bir sayı giriniz: (x)");
        int x = scanner.nextInt();
        int ilkterim =1;
        int toplam =0;
        
        for(int i =0;i<7;i++){
            toplam += ilkterim;
            ilkterim*=x;
            
        }
        System.out.println(toplam);
         */
 /* int top = 0;
        for (int k = 1; k <= 3; k++) 
            for (int m = 1; m <= 5; m++) 
                top += (m + k);
                System.out.print(top+ " ");
         */
 /* int crpm =1;
       for(int m=1; m<=3;m++)
           for(int n =1; n<=4;n++)
               crpm*=(m+n);
        System.out.println(crpm);
         */
 /* double ic_kisim = 1.0;
        double dis_kisim = 0.0;
        for (int m = 1; m <= 3; m++) {
            for (int k = 1; k <= 4; k++) {
                ic_kisim = Math.sin(m) * Math.cos(k);
            }
            dis_kisim += ic_kisim;
            ic_kisim = 1.0;
        }
        System.out.println(dis_kisim);
         */
 /* double ic_kisim= 0.0;
   double dis_kisim=1.0;
   for(int m =1;m<=3;m++){
       for(int k=1;k<=4;k++){
           ic_kisim=Math.sin(m)*Math.cos(k);
          
       }
        dis_kisim*=ic_kisim;
        ic_kisim=0.0;
   }
        System.out.println(dis_kisim);
       
         */
        /*double toplam = -23.0;
        for (double n = 1; n <= 99; n++) {
            toplam=toplam+(n/(n+1));

        }
        System.out.println(toplam);*/
        
       /* double top =-23.0;
        for(double n =1,m=7;n<=99;n++,m+=4){
         top+=n/m;
        }
        System.out.println(top);
        */
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
