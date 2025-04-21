
package yeniuygula;

import java.util.Scanner;


public class dizi {
      public static int [] arrayi_doldur(int sayi){
        Scanner scanner = new Scanner (System.in);
        int []cıktı =new int [sayi];
        for(int i = 0; i<sayi ; i++){
            cıktı[i]=scanner.nextInt();
        }
        return cıktı;
    }
    public static void arrayi_bastır(int []array){
        for(int i =0; i<array.length;i++){
            System.out.println("Element " + (i+1)+":" +array[i]);
        }
    }
    
    
    
    

    /*public static double ortbul(int[] dizi) {

        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {

            toplam += dizi[i];
        }

        return (double) toplam / dizi.length;

    }

    public static void array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ":" + array[i]);
        }
    }*/

    public static void main(String[] args) {

        //int[] b = {10, 20, 30, 40};
        //array(b);
        /*Scanner scanner = new Scanner(System.in);
     
        int [] dizi = new int[5];
        for(int i =0; i<dizi.length; i++){
            dizi[i]=scanner.nextInt();
        }
        for(int i = 0; i<dizi.length; i++){
            System.out.print(dizi[i] + " ");
        }*/

       // System.out.println("Ortalama = " + ortbul(b));
       
      int[]a = arrayi_doldur(5);
        arrayi_bastır(a);
       
       
       
       
       
       
       
       
    }
    
}
