
package javaapplication2;


public class Agac {
    Dugum kok;

    public Agac() {
        kok=null;
    }
    Dugum agacAra(int eleman){
        Dugum d= kok;
        while(d!= null){
            if(d.icerik== eleman){
                
                return d;
            }
            else if(d.icerik> eleman){
                d= d.sol;
                
                
            }else{
                d=d.sag;
                
            }
        }
        return null;
        
    }
    Dugum min(){
        Dugum sonuc= kok;
        while(sonuc.sol!= null){
            sonuc= sonuc.sol;
            
        }
        return sonuc;
        
    }
    Dugum max(){
        Dugum sonuc =kok;
        while(sonuc.sag!= null){
            sonuc= sonuc.sag;
            
        }
        return sonuc;
        
    }
    
    void ekle(Dugum yeni){
        Dugum y= null;
        Dugum x=kok;
        while(x!= null){
            y=x;
            if(yeni.icerik< x.icerik){
                x= x.sol;
                
            }else{
                x=x.sag;
                
            }
        } 
        
        if(y==null){
            kok=yeni;
            
        }else if(yeni.icerik< y.icerik){
            y.sol= yeni;
            
        }else{
            y.sag= yeni;
        }
    }
    
    void inorder(Dugum node){
        if(node == null){
            return ;
        }
        inorder (node.sag);
        System.out.println(node.icerik + " ");
        inorder(node.sag);
    }
        
        void peorder(Dugum node){

        if(node== null){
            return;
            
        }
        System.out.println(node.icerik + " ");
        peorder(node.sol);
        peorder(node.sag);
        
    }

void posterder(Dugum node){
            if(node== null){
                return ;
            }
            posterder(node.sol);
            posterder(node.sag);
            System.out.println(node.icerik + " ");
            
        }
public boolean yapraksil(int key){
    Dugum current =kok;
    Dugum parent= kok;
    boolean isLeftChild= true ;
    
    while(current.icerik != key){
        parent= current;
        if(key< current.icerik){
            isLeftChild = true;
            
            current= current.sol;
            
        }else{
            isLeftChild = false;
            
            current= current.sag;
            
        }
        if(current== null){
            return false;
            
        }
        
    }
    if(current.sol == null && current.sag ==null){
        if(current == kok){
            kok=null;
            
        }else if( isLeftChild ){
            parent.sol=null;
            
        }else{
            parent.sag= null;
            
        }
        return true;
        
    }else{
        return false;
        
    }
    
}

void seviyegoster(){
    Kuyruk k= new Kuyruk();
    Dugum tmp= kok;
    if(tmp != null){
        k.ekle(tmp);
        int i= 0, j=0;
        System.out.print(" ");
        int top=0;
        
        while(!k.bosmu()){
            tmp= k.sil();
            top+= tmp.icerik;
            if(tmp.sol != null)
                k.ekle(tmp.sol);
                if(tmp.sag != null)
                    k.ekle(tmp.sag);
                
                System.out.print(tmp.icerik + " ");
            int us= (int)Math.pow(2, j);
            i++;
            if(i== us){
                j= j+1;
                i=0;
                System.out.println();
                
            }
            
            
        }
        System.out.println("toplam = " + top);
    }
}
    }
    
    

