
package yeniuygula;

import java.util.Scanner;

public class diziornekleri {
     public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in);
        int[][] dizi = new int[3][2];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = scanner.nextInt();

            }
        }
        int top = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                top += dizi[i][j];
                System.out.print(dizi[i][j]+" ");

            }
            System.out.println();

          

        }
          System.out.println("Elemanlar toplamı =" + top);
         */

 /* Scanner scanner = new Scanner(System.in);
        int[][] dizi = new int[3][3];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = scanner.nextInt();
            }
        }
        
         for(int i =0;i<dizi.length;i++){
            for(int j =0;j<dizi[i].length;j++){
                System.out.print(dizi[i][j]+" ");   
            }
             System.out.println();
         }
        for(int i =0;i<dizi.length;i++){
            for(int j =0;j<dizi[i].length;j++){
                if(i==j){
                    dizi[i][j]=1;
                    
                }else{
                    dizi[i][j]=0;
                }
            }
        }
        
        for(int i =0;i<dizi.length;i++){
            for(int j=0;j<dizi[i].length;j++){
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }*/
 /*int [][] dizi ={{1,2,3,2,1},
                     {1,2,0,2,1},
                     {1,0,0,0,1},
                     {1,2,0,2,1},
                     {1,2,3,2,1}};
      
      for(int i=0;i<dizi.length;i++){
          for(int j=0; j<dizi[i].length;j++){
              System.out.print(dizi[i][j] + " ");
          }
          System.out.println();
      }
        System.out.println("*****************");
       for(int i=0;i<dizi.length;i++){
          for(int j=0; j<dizi[i].length;j++){
              if(dizi[i][j]!=0){
                  System.out.print(dizi[i][j]+" ");
              }else{
                  System.out.print("  ");
              }
          }
           System.out.println();
       }*/
 /* Scanner scanner = new Scanner(System.in);

        int[][] dizi = new int[4][3];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("********************");
        int temp = 0;
        for (int i = 0; i < dizi.length - 1; i++) {

            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] > dizi[i + 1][j]) {
                    temp = dizi[i][j];
                    dizi[i][j] = dizi[i + 1][j];
                    dizi[i + 1][j] = temp;
                }

            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }*/
 /*Scanner scanner = new Scanner(System.in);
      Random random=new Random();
      
      int [][] dizi1 = new int [3][3];
      int [][] dizi2 =new int [3][3];
      
      for(int i =0;i<dizi1.length;i++){
          for(int j =0; j<dizi1[i].length;j++){
              dizi1[i][j]=random.nextInt(10);
              dizi2[i][j]=random.nextInt(10);
          }
      }
      int satir =dizi1.length;
      int sutun=dizi1[0].length;
      
     int [][]sonuc = new int [satir][sutun];
     for(int i =0;i<satir;i++){
         for(int j =0;j<sutun;j++){
             sonuc[i][j]=dizi1[i][j]*dizi2[i][j];
             System.out.print(sonuc[i][j]+" ");
         }
         System.out.println();
     }*/
 /* char[][]sos = new char [3][3];
      Scanner scanner= new Scanner(System.in);
      for(int i =0;i<sos.length;i++){
          System.out.println("-----------");
         for(int j =0;j<sos[i].length;j++){
             System.out.print("| |"+" ");
             
         }
         System.out.println();
     }*/
 /*Scanner scanner = new Scanner(System.in);
     int [][] dizi=new int [3][3];
     for(int i =0;i<dizi.length;i++){
         for(int j =0;j<dizi[i].length;j++){
            dizi[i][j]=scanner.nextInt();
         }
         
     }
     int eb =0;
     int ek=1000;
     
     for(int i =0;i<dizi.length;i++){
         if(eb<dizi[i][j]){
             
         }
         for(int j =0;j<dizi[i].length;j++){
             System.out.println(dizi[i][j]+" ");
         }
         System.out.println();
     }*/
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];
        int temp;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = scanner.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");

        }
        for (int j = 0; j < dizi.length; j++) {
            for (int i = 0; i < dizi.length - 1; i++) {
                if (dizi[i] > dizi[i + 1]) {
                    temp = dizi[i];
                    dizi[i] = dizi[i + 1];
                    dizi[i + 1] = temp;
                }
            }
        }
        System.out.println("\n**************");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
         System.out.println("");
    }
     
     
     
     
     
     
     
     
}
