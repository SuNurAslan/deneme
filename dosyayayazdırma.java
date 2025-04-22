/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeniuygula;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author VICTUS
 */
public class dosyayayazdırma {
     public static void main(String[] args) {
        File dosya =new File("buyukler.txt");
        int [][] matris ={{5,10,15,2},{3,4,8,1},{12,13,23,9}};
        PrintWriter p =null;
        try {
            if(!dosya.exists())
                dosya.createNewFile();
            p=new PrintWriter(new FileOutputStream(dosya,false));
            
            for(int i =0;i<matris.length;i++){
                int enb =matris[i][0];
                for(int j =0;j<matris[i].length;j++){
                  if(matris[i][j]>enb)
                      enb =matris[i][j];
                  
                }
                p.print(enb+" ");
                p.close();
            }
        } catch (Exception e) {
        }
    }
    
}
