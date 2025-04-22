package javaapplication1;

import java.util.Scanner;
import javafx.beans.binding.Bindings;

public class finalöcnesi {

    public static void main(String[] args) {

        /* int [] liste = new int[4];
     //int [] liste ={1, 2, 3, 4, 5};
     
     liste[0]=0;
     liste[1]=1;
     liste[2]=2;
     liste[3]=3;
     for(int i=0;i<liste.length;i++){
         System.out.println(liste[i]);
     }
     
     Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinizde bulunan sayılarınızı giriniz.");
     int[] array = new int[4];
     
     for(int k = 0; k < array.length; k++){
         array[k] = scanner.nextInt();
         
     }
     for(int i =0;i<array.length;i++){
         System.out.println(array[i]);
     }*/
 /*int[][] table = new int[][]{
            {0,1,2},
            {2,4,6},
            {8,10,15},
            {21,36,48}
                
        };int [][] table2 = new int[4][3];
        table2 [0][0] =0;
        table2 [0][1]=1;
        table2 [0][2]=2;
        

        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table[0].length; k++) {
                System.out.print(table[i][k] + " ");

              
            }
           System.out.println( );
        }
 /*String []students =new String[3];
        students[0]="Eda";
        students[1]="SuNur";
        students[2]="Fatma";
        for(int i = 0 ; i < students.length; i++){
            System.out.println(students[i]);
        }*/
 /*double[] mylist = {1.2 ,1.3 ,1.4, 1.5};
        double total =0;
        double eb = mylist[0];
        for(double number:mylist){
            if(eb < number){
            eb = number;
        }
            total=total+number;
            System.out.println(number);
        }System.out.println("toplam = " +total);
        System.out.println("En büyük : "+eb);*/
 /*String[][] city = new String[3][3];
        city[0][0]="İstanbul";
        city[0][1]="Bursa";
        city[0][2]="Çanakkale";
        
        city[1][0]="Ankara";
        city[1][1]="Konya";
        city[1][2]="Kayseri";
        
        city[2][0]="Diyarbakır";
        city[2][1]="Şanlıurfa";
        city[2][2]="Gaziantep";
        
        for(int i =0; i<city.length; i++){
            System.out.println("---------------");
            for(int k =0; k<city[0].length;k++){
                System.out.println(city[i][k] +" ");
            }
            System.out.println();
        }*/
 /*String message = "Bugün hava çok güzel.";
        System.out.println(message);

        System.out.println("Eleman sayısı =" + message.length());
        System.out.println("5.eleman =" + message.charAt(4));
        System.out.println(message.concat("Yaşasın!"));*/
 /*Scanner scanner = new Scanner(System.in);
        int [] dizi = new int [3];
        for(int i =0; i<dizi.length; i++){
            
         dizi [i] = scanner.nextInt();
         
        } for(int k =0; k<dizi.length; k++){
            System.out.print(dizi[k] + " ");
            
        }*/
 /* Scanner scanner = new Scanner(System.in);
        int[][] dizi = new int[3][5];
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[i].length; k++) {
                dizi[i][k] = scanner.nextInt();
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[i].length; k++) {
                System.out.print(dizi[i][k] + " " );
            }
            System.out.println(" ");
        }*/
 /*Scanner scanner = new Scanner(System.in);
        int top = 0;
        int[][] dizi = new int[4][3];
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[i].length; k++) {
                dizi[i][k] = scanner.nextInt();

            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[i].length; k++) {
                top = top + dizi[i][k];
                System.out.print(dizi[i][k] + " ");
            }
            System.out.println(" ");
        }System.out.println("Toplam = " + top);*/
 /*Scanner scanner = new Scanner(System.in);
        int[][] dizi = new int[3][3];
        int top = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[0].length; k++) {
                dizi[i][k] = scanner.nextInt();
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[0].length; k++) {
                System.out.print(dizi[i][k] + " ");
            }
            System.out.println(" ");
        }


        for (int i = 0, k = 0; i < 3 && k < 3; i++, k++) {
            top = top + dizi[i][k];
            dizi[i][k] = 0;

        }
        System.out.println("Köşegenler toplamı = " + top);
        
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[0].length; k++) {
                System.out.print(dizi[i][k] + " ");
            }
            System.out.println(" ");
        }*/
 /*Scanner scanner = new Scanner (System.in);
        int [] arrays = new int [4];
        for(int i =0; i<arrays.length; i++){
            arrays[i]=scanner.nextInt();
            
        }for(int k =0; k<arrays.length;k++){
            System.out.print(arrays[k] + " ");
        }System.out.println(" ");*/
 /* Scanner scanner =new Scanner(System.in);
        int [][] dizi = new int [3][4];
        for(int i =0; i<dizi.length; i++){
            for(int k = 0; k < dizi[i].length;k++){
                dizi[i][k]=scanner.nextInt();
                
            }
        }
        for(int i= 0; i<dizi.length;i++){
            for(int k = 0; k<dizi[i].length; k++){
                System.out.print(dizi[i][k] + " ");
            }System.out.println(" ");
        }*/
 /*Scanner scanner = new Scanner (System.in);
       int toplam =0;
       
       int[][] dizi = new int [5][5];
       for(int i =0; i<dizi.length; i++){
           for(int k =0; k<dizi.length; k++){
               dizi[i][k]=scanner.nextInt();
           }
            }
       for(int i =0; i<dizi.length;i++){
           for(int k=0; k<dizi.length;k++){
               System.out.print( dizi[i][k] + " ");
           }
           System.out.println(" ");
       }
       
       for(int i=0,k=0; i<=4 && k<=4 ;i++,k++){
           toplam = toplam + dizi[i][k];
           
           dizi[i][k]=0;
       }
       for(int i=0,k=4; i<=4 && k>=0;i++,k--){
           toplam = toplam + dizi[i][k];
           dizi[i][k]=0;
       }
       System.out.println("Köşegen toplamı = "+toplam);
       for(int i=0;i<dizi.length;i++){
           for(int k = 0; k<dizi.length;k++){
               System.out.print(dizi[i][k] + " ");
           }
           System.out.println(" ");
       }*/
      /* Scanner scanner = new Scanner (System.in);
 
        String [] dizi = new String [5];
        System.out.println("Oluşturmak istediğiniz dizinin elemanlarını giriniz:");
        for(int i =0; i<dizi.length;i++){
            dizi[i]=scanner.nextLine();
        }
        for (int i = dizi.length - 1; i >= 0; i--) {
            for (int k = 0; k <= i; k++) {
                System.out.print(dizi[k] + " ");
            }
             System.out.println(" ");
        }*/
        /*int[][] dizi = {
            {1, 2, 3, 2, 1},
            {1, 2, 0, 2, 1},
            {1, 0, 0, 0, 1},
            {1, 2, 0, 2, 1},
            {1, 2, 3, 2, 1}
        };
        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi.length; k++) {
                System.out.print(dizi[i][k] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("   ");

        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi.length; k++) {
                if (dizi[i][k] != 0) {
                    System.out.print(dizi[i][k]);
                } else 
                    System.out.print(" ");
                    System.out.print(dizi[i][k] + " ");
            }
                System.out.println();
            

        }*/
        
       
        
        
        
       
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }


