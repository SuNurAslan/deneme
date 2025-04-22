
package javaapplication2;

public class listeyapısı {
  
    node head = null;
    node tail=null;
    
    void ekle(int x){
        
        node eleman = new node();//eklenecek obje
        eleman.data=x;
        eleman.next=null;
        
        if(head == null){
            head=eleman;
            tail=eleman;
            System.out.println("liste oluşturuldu ilk düğüm oldu");
        }else{
            tail.next=eleman;//son elemanın devamoına yeni düğüm eklenir
            tail=eleman;
            System.out.println("listenin sonuna yeni bir eleman eklendi");
        }
    }
    void yazdır(){
        if(head==null){
            System.out.println("liste yapısı boştur");
            
        }else{
           node temp = head;
            System.out.print("\n bas --> ");
           while(temp != null){
               System.out.print(temp.data +" --> ");
               temp=temp.next;
           }
            System.out.println("son ");
        }
    }
    
}
