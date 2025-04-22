package javaapplication1;

import java.util.Scanner;
import sun.font.TrueTypeFont;

public class evdelab {

    /*public static boolean asalMa(int a){
        if(a<=1){
            return false;
    }
    for(int i=2;i<=Math.sqrt(a);i++){
        if(a%i==0){
            return false;
        }
    }
    return true;
    } 
    public static void main(String[] args) {
        System.out.println(asalMi(9));
        
    }*/
 /*   public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
        
    public static void main(String[] args) {
        System.out.println(isPrime(51));
    }*/

 /*public static int faktoriyelhesapla(int a) {
    if(a<0){
    return -1;
    }
        int sayac = 0;
        int fak = 1;
        while (fak <= a) {
            sayac++;
            fak *= sayac;

        }
        if (fak != a) {
            return -1;

        }
        return sayac;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int a = scanner.nextInt();
        int fakhesaplama =faktoriyelhesapla(a);
        if(fakhesaplama!= -1){
            System.out.println(a+" = "+fakhesaplama+"!");
        }else{
            System.out.println(a+" bir faktöriyel değil");
        }
    }*/
 /*public static int kackez (String str ,char karakter){
        int sayac =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==karakter){
                sayac++;
            }
        }
        return sayac;
        
    }
    public static void main(String[] args) {
        String girilen ="Hello World";
        char karakterChar ='o';
        
        int sıklık = kackez(girilen, karakterChar);
        System.out.println("Karakter "+karakterChar+" "+sıklık+"kez geçiyor");
    }*/
 /* public static int ebobbul (int sayi1,int sayi2){
        if(sayi2==0) return sayi1;
        else
       return ebobbul(sayi2, sayi1%sayi2);
        
    }
    
    public static void main(String[] args) {
        int sayi1=24;
        int sayi2=18;
        System.out.println("ebob ="+ebobbul(sayi1, sayi2));
   
    }*/
 /*public static void asalcarpanbulma (int sayi){
        for(int i =2;i<=sayi;i++){
            while(sayi %i==0){
                System.out.print(i+ " ");
                sayi/=i;
            }
        }
    }
    public static void main(String[] args) {
        int number =12;
        System.out.println("Sayının asal çarpanları: ");
        asalcarpanbulma(number);
    }*/
 /* public static boolean polndromMu(String str){
        if(str == null||str.isEmpty()){
            return false;
        }
        int i =0;
        int j =str.length()-1;
        while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
            
        }
        i++;
        j--;
    }
    
    return true;
    
}
    public static void main(String[] args) {
        String str ="level";
        if(polndromMu(str)){
            System.out.println(str+" bir polindromdur.");
        }else{
            System.out.println(str+" bir polindrom değildir");
        }
    }*/
 /*public static boolean polindromMu(String str){
        if(str==null||str.length()<=1){
            return true;
        }else if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }else{
            return polindromMu(str.substring(1,str.length()-1));
        }
    }
    public static void main(String[] args) {
        String str ="level";
        if(polindromMu(str)){
            System.out.println(str + " bir polindromdur.");
        }else{
            System.out.println(str + " bir polindrom değildir");
        }
    }*/
 /* public static int diziToplam (int []dizi,int index){
       if(dizi == null || index<0 || index>=dizi.length){
           return 0;
       }
       if(index == dizi.length-1){
           return dizi[index];
       }
       return dizi[index]+diziToplam(dizi, index+1);
   }
    public static void main(String[] args) {
        int [] dizi ={1,2,3,4};
        int toplam =diziToplam(dizi, 0);
        System.out.println("toplam = "+toplam);
    }*/
 /* public static void tahmin (int sayi){
    
    for(int i =1;i<=sayi;i++){
            for (int j = 0; j <=sayi; j++) {
                for (int k = 0; k < sayi; k++) {
                    if(2*i+4*j+4*k==sayi){
                        System.out.println(i+" "+j+" "+k);
                    }
                }
                    
                }
                
            }
    
}
    public static void main(String[] args) {
        tahmin(24);
    }*/
    /*public static String onaltıtabanı(int sayi) {
        String sb = "";
        while (sayi > 0) {
            int kalan = sayi % 16;

            char kalanchar = (kalan < 10) ? (char) ('0' + kalan) : (char) ('A' + (kalan - 10));
            sb = kalanchar + sb;
            sayi /= 16;

        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println(onaltıtabanı(266));
    }*/
    public static String ikilibul(int m){
        String str ="";
        while(m>0){
            int i =0,ikikuvvet=1;
            while (true) {  
                ikikuvvet*=2;
                if(ikikuvvet>m){
                    ikikuvvet=ikikuvvet/2;
                    break;
                }
                i++;
            }
            System.out.println(str = str+"2^"+i+"+");
            m=m-ikikuvvet;
            
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(ikilibul(398));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
