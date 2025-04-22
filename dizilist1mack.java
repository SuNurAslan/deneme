
package javaapplication2;


public class dizilist1mack {
    public static void main(String[] args) {
        sinif A = new sinif();
        sinif B = new sinif();
        sinif C = new sinif();
        
       
      
      A.next=B;
      B.next=C;
      C.next=null;
      
       A.sayi=32;
       B.sayi=33;
      C.sayi=34;
      
      sinif temp=A;
      while( temp !=  null ){
          System.out.println(temp.sayi);
          temp=temp.next;
      }
       
    }
}
