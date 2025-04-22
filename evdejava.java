package javaapplication1;


/*String isim;
int yas;
static int m_no=0;
static double indirim;

public void bilgileriyazdir(){
    System.out.println("Müşteri adi= "+isim+" müşteri no = "+m_no+
            " indirim yüzdesi = "+indirim);
    
}
public evdejava(){
    m_no+=1;
}
    public static void main(String[] args) {
        evdejava.indirim=8.2;
        evdejava m1 = new evdejava();
        m1.isim="eda";
        m1.yas=24;
        m1.bilgileriyazdir();
        
        evdejava m2 = new evdejava();
        m2.isim="Faatma";
        m2.yas=45;
        m2.bilgileriyazdir();
    }*/
   /* class A{
    int i , j ;
    void showij (){
        System.out.println("i and j = "+i+ " "+j);
    }
}
 class B extends A {
     int k ;
     void showk (){
         System.out.println("k: "+k);
     }
     void sum () {
         System.out.println("i + j + k: "+(i+j+k));
     }
 }*/
/*class A {
    int i ;
     int j;
    void setij(int x ,int y){
        i=x;
        j=y;
        
    }
}
class B extends  A {
    int toplam =0 ;
    void sum(){
     toplam =i+j;
    }
}
*/

class urun {
    String isim;
    int id;
    String birim;
    double fiyat;
     public urun (String isim,int id , String birim, double fiyat){
         this.birim=birim;
         this.isim=isim;
         this.id=id;
         this.fiyat=fiyat;
     }
    public String toString(){
        return "ürün adı: "+isim+"Fiyat: "+fiyat+"TL";
        
    }
    
}
/*class icecek extends urun{
   
    String tur;
    String marka;
//public icecek (String tur,String marka,String isim,String birim,){
    this.marka=marka;
    this.tur=tur;
}
   
    }
    






    public class evdejava {
       /* public static void main(String[] args) {
            B b1 = new B();
            b1.setij(39, 41);
            b1.sum();
            System.out.println("Toplam : "+b1.toplam);
        }*/
    
       /* public static void main(String[] args) {
            A a1 = new A();
            B b1 = new B();
            a1.i=25;
            a1.j=31;
            System.out.println("a1 'in nesneleri :");
            a1.showij();
            System.out.println();
            b1.i=1;
            b1.j=2;
            b1.k=3;
            System.out.println("b1'in nesnelreri:");
            b1.showk();
            b1.showij();
            System.out.println();
            System.out.println("üst ve alt sınıflar toplanıyor: ");
            System.out.println("(i+j+k) =");
            b1.sum();
        }*/
    
    
    
    
    
    
    
    
    
    
    
    
    
//}
