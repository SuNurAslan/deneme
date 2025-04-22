package javaapplication1;

import java.io.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ilhanlab {

    public static void oku(String dad) {
        File dosya = new File(dad + ".txt");
        if (!dosya.exists()) {
            System.out.println("Dosya bulunamadı!!");
        } else {
            try {
                Scanner oku = new Scanner(dosya);
                while (oku.hasNext()) {
                    String okunan = oku.nextLine();
                    String[]dizi=okunan.split("\t");
                    double ort=Integer.parseInt(dizi[1])*0.4+Integer.parseInt(dizi[2])*0.6;
                    System.out.println(dizi[0]+"\t"+dizi[1]+"\t"+dizi[2]+"\t"+ort);
                    
                   // System.out.println(okunan);
                }
                oku.close();
            } catch (Exception e) {

            }
        }
    }

    public static void yaz(String dad, String isim, int v, int f) {
        File dosya = new File(dad + ".txt");
        PrintWriter p;
        try {
            p = new PrintWriter(new FileOutputStream(dosya, true));
            p.print(isim);
            p.println(" " + v + "\t" + f);
            p.close();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1-dosya yaz");
            System.out.println("2-dosya oku");
            System.out.println("3-cıkıs");
            System.out.println("Seciminiz = 1-2-3?");
            int secenek = scanner.nextInt();
            scanner.nextLine();
            if (secenek == 1) {
                System.out.println("İsminiz:");
                String isim = scanner.nextLine();
                System.out.println("Vize ve final notunuz: ");
                int v = scanner.nextInt();
                int f = scanner.nextInt();
                yaz("ogrenci", isim, f, v);
            } else if (secenek == 2) {
                oku("ogrenci");
            } else {
                break;
            }

        } while (true);

    }

}
