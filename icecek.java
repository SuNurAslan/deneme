
package javaapplication1;

public class icecek extends urun1{
    String marka;
    String tur;
    public icecek(String isim,String birim,double fiyat,String marka,String tur){
       super(isim, birim, fiyat);
       this.marka=marka;
       this.tur=tur;
       
    }
    @Override
    public String toString(){
        return "ürün adı:"+isim+"marka: "+marka +"tur: "+tur+
                "idsi: "+id+","+birim+" fiyat"+fiyat+"TL";
    }
    public static void main(String[] args) {
        icecek i = new icecek("Nar suyu", "adet", 4.50, "dimes","gazsız");
        System.out.println(i);
    }
        
    
}
