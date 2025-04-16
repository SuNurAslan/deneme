
package yeniuygula;

import java.util.Scanner;

public class YeniUygula {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("Diğer sayiyi giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seciniz\n(1-Toplama 2-cıkarma 3-çarpma 4-bölme): ");
        int islem = scanner.nextInt();

        switch (islem) {
            case (1): //toplama
                int toplam = sayi1 + sayi2;
                System.out.println("toplam = " + toplam);
                break;
            case (2): //cıkarma
                int cikarma = sayi1 - sayi2;
                System.out.println("cikarma = " + cikarma);
                break;
            case (3)://carpma
                int carpma = sayi1 * sayi2;
                System.out.println("carpma = " + carpma);
                break;
            case (4)://bolme  
                double bolme = sayi1 / sayi2;
                System.out.println("bölme = " + bolme);
                break;
                default:
                    System.out.println("Öyle bir işlem numarası yok.");
        }

    }
}
       
    
    

