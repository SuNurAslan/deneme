
package yeniuygula;

public class ebobbulma {
      // Ebob bulma
    public static int ebobbul (int sayi1,int sayi2){
        if(sayi2==0) return sayi1;
        else
       return ebobbul(sayi2, sayi1%sayi2);
        
    }
    
    public static void main(String[] args) {
        int sayi1=24;
        int sayi2=18;
        System.out.println("ebob ="+ebobbul(sayi1, sayi2));
   
    }
}
