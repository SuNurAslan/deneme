
package yeniuygula;
import java.util.logging.Level;
import java.util.logging.Logger;


    class uykutesti extends Thread{
    public void run (){
        try {
            while(true){
                System.out.println("uyuyor");
                Thread.sleep(60*10);
            }
        } catch (Exception e) {
        }
        
    }
}
    class robot extends Thread {
        public robot (String isim){
            super(isim);
        }
        public void run(){
            try {
                String isim =this.getName();
                for(int i =0;i<5;i++){
                    if((isim.equals("robot1")&&(i==3))){
                        System.out.println(isim+"  uyutuluyor...");
                        Thread.sleep(100);
                    }else if(isim.equals("robot2")&&i==2){
                        System.out.println(isim+" uyutuluyır...");
                        Thread.sleep(150);
                    }else if(isim.equals("robot3")&&(i==4)){
                        System.out.println(isim+ " uyutuluyor...");
                    }
                    System.out.println(isim+"  "+i);
                    Thread.sleep(200);
                }
            } catch (Exception e) {
            }
        }
    }

public class saniyeileasallariyazdirma extends Thread {
    public static final int maksasal=100;
    public static final int onsaniye=10000;
    public boolean bittimi=false;
    public void run(){
        int []asallar = new int [maksasal];
        int sayi=0;
        for (int i = 2; sayi<maksasal ; i++) {
            if(bittimi) return;
            boolean asalmi=true;
            for (int j = 0; j < sayi; j++) {
                if(i % asallar[j] == 0){
                    asalmi=false;
                    break;
                }
                
            }
            if(asalmi){
                asallar[sayi++]=i;
                System.out.println("bulunan asal:" +i);
            }
            
        }
        
    }
    
   
    public static void main(String[] args) {
        saniyeileasallariyazdirma a2 = new saniyeileasallariyazdirma();
        a2.start();
        try {
            Thread.sleep(onsaniye);
        } catch (Exception e) {
        }
        a2.bittimi=true;
       // robot r1=new robot("robot1");
       // robot r2 =new robot("robot2");
        //robot r3 =new robot("robot3");
        
        //r1.start();
       // r2.start();
        //r3.start();
        
   //     uykutesti u1=new uykutesti();
     //   u1.start();
    }
    
}
