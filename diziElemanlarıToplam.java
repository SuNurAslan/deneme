
package yeniuygula;


public class diziElemanlarıToplam {
     public static int toplam(int[] dizi1) {
        int toplam = 0;
        for (int i = 0; i < dizi1.length; i++) {

            toplam += dizi1[i];
        }
        System.out.println("Dizinin toplamı = " + toplam);
        return toplam;
    }

    public static int[] diziyiolustur (int[] dizi1) {
        int[] dizi2 = {};
        for (int i = 0; i < 5; i++) {
            dizi1[i] =( int )( Math.random()*10);
        }
        System.out.println("Dizinin elemanları = ");
        for(int i =0; i<5; i++){
            System.out.print(dizi1[i] + " ");
        }
        
        return dizi2;
    }

    public static void main(String[] args) {
        int[] dizi1 = new int[5];
        diziyiolustur(dizi1);
        toplam(dizi1);
       

    }


    
}
