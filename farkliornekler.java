
package yeniuygula;

import java.util.Scanner;


public class farkliornekler {
     public static void main(String[] args) {
//aracın km de kaç tl yaktığını bulma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç km gittiniz? ");
        int km = scanner.nextInt();
        System.out.println("Aracınız km de kaç kurus yakıyor?" +"(Örnek = 0.32)");
        double kurus = scanner.nextDouble();
        
        System.out.println("Toplam ödemeniz gereken tutar = "+(km*kurus)+"Tl dir");
         
        //sayıların yerlerini değiştirme
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        
        int temp = sayi1 ;
        sayi1 =sayi2;
        sayi2 =temp;
      
        
        System.out.println("Birinci sayı : "+sayi1);
        System.out.println("İkinci sayı : "+sayi2);
        System.out.println("Sayıların yerleri değişti !!!");
         */
        //hipotenüs bulma
        /* Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        int b = scanner.nextInt();
        double hipo = Math.sqrt(a*a + b*b);
        
        System.out.println("Hipotenüs = " +hipo);
         */
        //hesap makinesi
        /* Scanner scanner=new Scanner(System.in);
        System.out.print("Bir işlem türü giriniz: ");
     int islem=scanner.nextInt();
     switch(islem){
         case(1):
             System.out.println("1.işlem");
             break;
         case(2):
             System.out.println("2.işlem");
             break;
        case(3):
             System.out.println("3. işlem");
             break;
        default:
             System.out.println("Geçersiz işlem");
             break;
                 
     }*/
        //3 sayı arasından en büyüğünü bulma
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 =scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 =scanner.nextInt();
        System.out.println("3.sayıyı giriniz: ");
        int sayi3 =scanner.nextInt();
        
        int eb =0;
        if(sayi1>=sayi2 && sayi1>=sayi3){
            eb = sayi1;
            System.out.println("En büyük sayı = " + sayi1);
        }else if(sayi2>=sayi1 && sayi2>=sayi3){
            eb = sayi2;
            System.out.println("En büyük sayı = " + sayi2);
        }else{
             System.out.println("En büyük sayı = " + sayi3);
        }
         */
        //3 sayı arasında en küçüğünü bulma
        /* Scanner scanner = new Scanner (System.in);
       System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 =scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 =scanner.nextInt();
        System.out.println("3.sayıyı giriniz: ");
        int sayi3 =scanner.nextInt();
        
        int ek =1000;
     if(sayi1<=sayi2 && sayi1<=sayi3){
            ek = sayi1;
            System.out.println("En küçük sayı = " + sayi1);
        }else if(sayi2<=sayi1 && sayi2<=sayi3){
            ek = sayi2;
            System.out.println("En küçük sayı = " + sayi2);
        }else{
             System.out.println("En küçük sayı = " + sayi3);
        }*/
        //hesap makinsı
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1=scanner.nextInt();
        
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 =scanner.nextInt();
        
        System.out.println("Yapmak istediğiniz işlemi swçiniz: Örnek: 1-toplama,2-cıkarma,3-çarpma,4-bölme");
        int islem =scanner.nextInt();
        switch(islem){
            case(1):
                System.out.println("toplama = " + (sayi1 +sayi2));
                break;
            case(2):
                System.out.println("Çıkarma = " + (sayi1-sayi2));
                break;
            case (3):
                System.out.println("çarpma = " + (sayi1*sayi2));
                break;
            case(4):
                System.out.println("Bölme = " + ((double)sayi1/sayi2));  
                break; 
            default:
                System.out.println("Geçersiz işlem girdiniz: ");
        }*/
        //vize ortalamsı hesaplama
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("1.Vize notunuzu giriniz: ");
        int vize1 = scanner.nextInt();
        

        
        System.out.println("Final notunuzu giriniz: ");
        int inal = scanner.nextInt();
        
       double vize11 = (vize1*40) / 100;
       
       double inal1 =   (inal*60) / 100;
               
     double ort = vize11  + inal1;
        System.out.println("Ortalama = " +ort);
      
      if(ort>=90){
          System.out.println("AA ile geçtiniz:");
      }else if(ort>=85){
           System.out.println("BA ile geçtiniz:");
      }else if(ort>=80){
           System.out.println("BB ile geçtiniz:");
      }else if(ort>=75){
           System.out.println("BA ile geçtiniz:");
      }else if (ort>=70){
           System.out.println("CC ile geçtiniz:");
      }else if(ort>=65){
          System.out.println("DC ile geçtiniz: ");
      }else if(ort>=60){
           System.out.println("DD ile geçtiniz:");
      }else if(ort>=55){
           System.out.println("FD ile geçtiniz:");
      }else {
           System.out.println("FF ile kaldınız");
      }
         */
 /*for(int i = 0 , j = 10 ; i<10 && j>0 ;i++ , j--){
           System.out.println("i = " +i);
           System.out.println("j = " + j);
       }*/
        //faktöriyel hesaplama
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz:");
        int fak =scanner.nextInt();
        
        int crpm = 1;
        for(int i =1; i<=fak; i++){
            crpm *= i;
            
        }
        System.out.println("Cevap = " + crpm);
         */
        //sayının amstrong sayı olup olmadığığını kontrol edens syaı

        /* Scanner scanner =new Scanner (System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        System.out.println("Sayının kaç basamaklı olduğunu giriniz: ");
        int bas = scanner.nextInt();
        
        int gecici = sayi;
        int toplam =0;
        do{
            int bas_degeri = gecici % 10;
            gecici = gecici /10;
            
            toplam +=Math.pow(bas_degeri, bas);
            
        }while(gecici>0);
       
       if (sayi == toplam){
           System.out.println("Sayı bir amstrong sayıdır");
       }else{
           System.out.println("Sayı bir amstrong sayı değildir");
       }*/
        //Çarpım tablosu

        /*for(int i = 1; i<=10; i++){
     System.out.println("*********************");
     for(int k =1; k<=10; k++ ){
         
         System.out.println(i+"x"+k +"="+ i*k);
     }
     System.out.println("*********************");
 }*/
        //while döngüsü ile bir kullanıcı girişi yazmaya çalışın:
       /* Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Su Nur ASLAN";
        String sys_parola = "1903";

        System.out.println("********************");

        System.out.println("Kullanıcı girişine hoş geldiniz...");

        System.out.println("********************");

        while (true) {
            System.out.println("Kullanıcı adı :");
            String kullanici_adi = scanner.nextLine();
            System.out.println("Parola :");
            String kullanici_parola = scanner.nextLine();

            if (kullanici_parola.equals(sys_parola) && kullanici_adi.equals(sys_kullanici_adi)) {
                System.out.println("Hoşgeldiniz!!" + kullanici_adi);
                break;
            } else if (kullanici_adi.equals(sys_kullanici_adi) && !kullanici_parola.equals(sys_parola)) {
                System.out.println("Parolanız yanlışş ...");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı = " + giris_hakki);

            } else if (!kullanici_adi.equals(sys_kullanici_adi) && kullanici_parola.equals(sys_parola)) {
                System.out.println("Kullanıcı adınız yanlışş ...");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı = " + giris_hakki);
            }else{
                System.out.println("Kullanıcı adınız veya şifreniz hatalı");
            }
         if(giris_hakki == 0){
         System.out.println("Giriş Hakkınız bittii");
}break;
        }*/
       //Faiz uygulaması
       /*Scanner scanner = new Scanner (System.in);
        System.out.println("Bankamıza hoşgeldinizz ! Faiz oranı %6 dır");
        
        System.out.println("Yatırmak istediğiz tutar : ");
        int anapara = scanner.nextInt();
        
        System.out.println("Kaç yıl vadeli yatırmak istiyorsunuz : ");
        int vade = scanner.nextInt();
        
       double toplam_para  = anapara;
        double faizOranı=0.06;
        
       for(int i = 1; i<vade; i++){
          toplam_para = (toplam_para*faizOranı)+toplam_para;
           System.out.println(i+" yılın sonunda toplam para: "+(int)toplam_para);
       }*/
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

    }
    
}
