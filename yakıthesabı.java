/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeniuygula;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class yakıthesabı {
    public static void main(String[] args) {

        // km birim fiyatı =0.105
        //12 yaşından kücükse %50 indiriim
        //12 24 yas arasındaysa %10 indirim
        //65 yasından büyükse %30 indirim
        //gidiş dönüş alırsa %20 indirim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Kaç km yol gideceksiniz?");
        int yol = scanner.nextInt();

        double km = 0.105;
        double standart_fiyat = km * yol;
        double fiyat1;
        System.out.println("Yolculuk tipini giriniz: \n1-Tek gidiş\n2-gidiş-dönüş");
        int tip = scanner.nextInt();

        if (yas > 0 && yol > 0 && (tip == 1 || tip == 2)) {
            System.out.println("Girdiler hesap yapmaya uygun.");

            if (yas <= 12 && tip == 2) {

                fiyat1 = 2 * ((standart_fiyat) - (standart_fiyat * 0.5) - (standart_fiyat * 0.2));
                System.out.println("Ödemeniz gereken ücret = " + fiyat1);

            } else if (yas <= 12 && tip == 1) {

                fiyat1 = (standart_fiyat) - (standart_fiyat * 0.5);

                System.out.println("Ödemeniz gereken ücret: " + fiyat1);
            } else if (yas >= 65 && tip == 2) {

                fiyat1 = 2 * ((standart_fiyat) - (standart_fiyat * 0.3) - (standart_fiyat * 0.2));
                System.out.println("Ödemeniz gereken ücret: " + fiyat1);

            } else if (yas >= 65 && tip == 1) {
                fiyat1 = (standart_fiyat) - (standart_fiyat * 0.3);
                System.out.println("Ödemeniz gereken ücret: " + fiyat1);
            } else if (yas > 12 && yas <= 24 && tip == 2) {
                fiyat1 = 2 * ((standart_fiyat) - (standart_fiyat * 0.1) - (standart_fiyat * 0.2));
                System.out.println("ödemeniz gereken tutar= " + fiyat1);
            } else if (yas > 12 && yas <= 24 && tip == 1) {
                fiyat1 = (standart_fiyat) - (standart_fiyat * 0.1);
                System.out.println("ödemeniz gereken tutar " + fiyat1);

            } else if (yas > 24 && yas < 65 && tip == 1) {
                fiyat1 = standart_fiyat;
                System.out.println("ödemeniz gereken tutar " + fiyat1);
            } else if (yas > 24 && yas < 65 && tip == 2) {
                fiyat1 = (standart_fiyat) - (standart_fiyat * 0.2);
                System.out.println("ödemeniz gereken tutar " + fiyat1);
            } else {
                System.out.println("Girdiler hesap yapmaya uygun değil !");
            }

        }
    }
}
    

