/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeniuygula;

/**
 *
 * @author VICTUS
 */
public class dizidekitekveciftleriayirma {
    public static void main(String[] args) {
         int[] dizim = diziolustur();
        int a = dizim.length;
        System.out.print("Olusturulan dizi: ");
        diziyaz(dizim, a);
        tekciftayir(dizim, a);
    }

    public static int[] diziolustur() {
        int[] sample = new int[10];
        for (int i = 0; i < 10; i++) {
            sample[i] = (int) (Math.random() * 10) + 1;
        }
        return sample;
    }

    public static void diziyaz(int a[], int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void tekciftayir(int a[], int b) {
        int[] sample = a;
        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < b; i++) {
            if (sample[i] % 2 == 0) {
                evenSize++;
            } else {
                oddSize++;
            }
        }
        int[] ciftarray = new int[evenSize];
        int[] tekarray = new int[oddSize];
        int j = 0, k = 0;
        for (int i = 0; i < b; i++) {
            if (sample[i] % 2 == 0) {
                ciftarray[j++] = sample[i];
            } else {
                tekarray[k++] = sample[i];
            }
        }
        System.out.print("cift dizi elemanları: ");
        diziyaz(ciftarray, evenSize);
        System.out.print("tek dizi elemanları: ");
        diziyaz(tekarray, oddSize);
    }
}

    
    

