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
public class AvlAgacı {
    Dugum1 kok;
    int heigth(Dugum1 N){
        if(N== null)
        return 0;
        return N.yukseklik;
        
    }
    int max(int a, int b){
        return (a>b) ? a:b;
        
    }
    Dugum1 sagaDondur(Dugum1 y){
        Dugum1 x=y.sol;
        Dugum1 T2 = x.sag;
        
        x.sag=y;
        y.sol=T2;
        
        y.yukseklik= max(heigth(y.sol), heigth(y.sag)) +1;
        x.yukseklik= max(heigth(x.sol), heigth(x.sag)) +1;
        return x;
        
        
    }
    Dugum1 solaDondur(Dugum1 x){
        Dugum1 y= x.sag;
        Dugum1 T2= y.sol;
        
        y.sol=x;
        x.sag=T2;
        
        x.yukseklik= max(heigth(x.sol), heigth(x.sag)) +1;
         y.yukseklik= max(heigth(y.sol), heigth(y.sag)) +1;
         
         
         return y;
         
    }
    
    int getBalance(Dugum1 N){
        if(N== null)
            return 0;
        return heigth(N.sol) - heigth(N.sag);
        
    }
    Dugum1 insert(Dugum1 node, int key){
        if(node==null)
            return (new Dugum1(key));
        if(key< node.anahtar)
            node.sol =insert(node.sol, key);
        else if(key> node.anahtar)
            node.sag= insert(node.sag, key);
        else 
            return node;
        node.yukseklik= 1 + max(heigth(node.sol), heigth(node.sag));
        
        int balance = getBalance(node);
        
        if(balance > 1  && key< node.sol.anahtar)   // sol sol
            return sagaDondur(node);
        
        if(balance < -1 && key> node.sag.anahtar)  // sag sag
            return solaDondur(node);
        
        
        if(balance > 1 && key > node.sol.anahtar){ // sol sag
            node.sol= solaDondur(node.sol);
            return sagaDondur(node);
            
        }
        if(balance < -1 && key< node.sag.anahtar){
            node.sag=sagaDondur(node.sag);
            return solaDondur(node);
            
        }
        return node;
        
            
        
    }
    
    
    void preOrder(Dugum1 node){
        if( node != null){
            System.out.println(node.anahtar + " ");
            preOrder(node.sol);
            preOrder(node.sag);
            
        }
    }
    
    
    
}
