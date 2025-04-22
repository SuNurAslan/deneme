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
public class cokboyutludiziler {
    public static void main(String[] args) {
        String s[][]={{"ali","ayşe"},
               {"osman","aliaysefatma"},
               {"eda","hafsaaa"}};
 
String enuzun =s[0][0];
int satir=0;
int sutun =0;
int eb=s[0][0].length();
 for(int i =0;i<3;i++){
     for(int j =0;j<2;j++){
         if(eb<=s[i][j].length()){
             eb =s[i][j].length();
             enuzun=s[i][j];
             satir=i;
             sutun=j;
         }
     }
 }
        System.out.println("en uzun string = "+enuzun+" uzunlugu= "+eb);
        System.out.println(satir+". satır ve "+sutun+". sutundadır");  
 
    }
    
}
