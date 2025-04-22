
package javaapplication2;

public class basasonaekle {
    
    node2 head =null;
    node2 tail =null;
    
    void basaekle (int x){
        
      node2 eleman = new node2(x);
      
     
       if(head == null){
          
           head =eleman;
           tail=eleman;
           eleman.next=null;
       }
       else{
         eleman.next=head;
         head=eleman;
       }
       
        
    }
    
    void sonaekle(int x){
     node2 eleman = new node2(x);
       
        
        if(head == null){
            head = eleman;
            tail=eleman;
        }else{
            eleman.next=null;
            tail.next = eleman;
            tail = eleman;
            
        }
        
    }
    void arayaelemanekle(node2 yeni , node2 once){
        if(head== null){
            head=yeni;
            tail=yeni;
            
        }else if(once == tail){
            tail.next=yeni;
            tail=yeni;
    
        }else{
            yeni.next=once.next;
            once.next=yeni;
 
        }
       
    }
    node2 ara(int aranacakdeger){
        node2 temp =head;
        while(temp!=null){
         if( temp.data2 == aranacakdeger){
             return temp;
            
         }
           temp=temp.next;
        }
        return null;
        
    }
    
    void yazdır(){
      if(head == null){
          System.out.println("Liste boştur");
      } else{
        node2 temp =head;
        while(temp!=null){
            System.out.print(temp.data2+" -->");
            temp=temp.next;
        }
      } 
      
    }
    
}
