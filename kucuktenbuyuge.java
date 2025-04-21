
package yeniuygula;

import java.util.Scanner;


public class kucuktenbuyuge {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayı giriniz: ");
        int Sayi1 = scanner.nextInt();
        boolean sıralı = true;
        
        for(int i = 2; i<=5 ; i++){
            System.out.println(i +".Sayıyı giriniz.");
            int Sayi2 =scanner.nextInt();
            
            if(Sayi1 > Sayi2 ){
                
                sıralı = false;
                
                break;
            }
            
            else
                Sayi1 = Sayi2;
                
            
        }
        if (sıralı)
            System.out.println("Küçükten büyüğe doğru sıralı");
        
        else 
            System.out.println("Küçükten büyüğe doğru sıralı değil.");
        
        
        
    }
    
    
}
