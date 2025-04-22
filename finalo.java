package javaapplication1;

import java.util.Scanner;

public class finalo {

    public static double indekshesapla(int us, int taban) {
int a =0;
        Scanner scanner = new Scanner(System.in);
        double kilo = scanner.nextDouble();
        int boy = scanner.nextInt();

        double indeks = (kilo / (boy * boy));
        System.out.println("Sonuç = " + indeks);

        return a;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        System.out.println("Boyunuzu giriniz: ");
        int boy = scanner.nextInt();
        indekshesapla(163, 58);
        
        if(indekshesapla (163,58)< 18.5){
            System.out.println("İdeal kilonuzun altındasınız..");
            
        }else if(indekshesapla(163, 58)<24.9 && indekshesapla(163, 58)>18.5){
            System.out.println("İdeal kilodasınız..");
            
        }else if(indekshesapla(163, 58)<29.9 && indekshesapla(163, 58)>25){
            System.out.println("İdeal kilonuzun üstündesiniz...");
            
        }else if(indekshesapla(163, 58)<39.9 && indekshesapla(163, 58)>30){
            System.out.println("İdeal kilonuzun çok üstündesiniz..." + "Obezsiniz !");
            
        } else{System.out.println("İdeal kilonuzun çok çok üstündesiniz..." + " Morbid obezsiniz !");
            
        }

    }

}
