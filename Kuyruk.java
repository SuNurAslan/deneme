/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author VICTUS
 */
public class Kuyruk {
    Dugum bas;
    Dugum son;
    public Kuyruk(){
        bas=null;
        son=null;
        
    }
    boolean bosmu(){
        return bas==null;
        
    }
    void ekle(Dugum yeni){
        if(!bosmu()){
            son.ileri= yeni;
            
        }else{
            bas= yeni;
            
        }
        son= yeni;
        
    }
    Dugum sil(){
        Dugum sonuc = bas;
        if(!bosmu()){
            bas= bas.ileri;
            if(bas==null){
                sonuc= null;
                
            }
        }
        return sonuc;
    }
}
