
package javaapplication2;


public class d {
    String [] elemanlar;
 int indis;
 int boyut;
 
 public d (int boyut){
     this.boyut=boyut;
     this.elemanlar=new String[boyut];
     this.indis=0;
 }
 public void ekle(String kelime) {
     if(this.indis<this.boyut){
         this.elemanlar[this.indis]=kelime;
         this.indis++;
         
     }else{
         System.out.println("Dizi dolu");
     }
    
}
 public int arama (String aranan){
     for(int index =0;index<this.indis;index++){
         if(elemanlar[index].equals(aranan)){
             return index;
         }
         
     }
     return -1;
     
 }
 public void sil (String kelime){
     int i = arama(kelime);
     if(i != -1){
         while(i<this.indis-1){
             this.elemanlar[i]=this.elemanlar[i+1];
             i++;
         }
         this.indis--;
     }else{
         System.out.println("Silinecek eleman bulunamadı");
     }
 }
 public void guncelle(String silinecek,String kelime){
     int i = arama(silinecek);
     if(i != -1){
         this.elemanlar[i]=kelime;
     }else{
         System.out.println("Güncellenecek eleman bulunamadı");
     }
 }
 
 public void yazdır(){
     if(this.indis<=0){
         System.out.println("Dizi boş");
     }else{
         System.out.println("[");
     for(int i =0;i<indis;i++){
         System.out.println(elemanlar[i]+ " ,");
     }
         System.out.println("]");
 }
     
}
 
 public void arayaekle (String kelime,int indis){
     if(this.indis>=this.boyut){
         System.out.println("dizi dolu eleman eklenemiyor");
         
     }
     if(indis<0 || indis>this.indis){
         System.out.println("Gçersiz index ");
         
     }
     for(int i =this.indis;i>=indis;i--){
         this.elemanlar[i+1]=this.elemanlar[i];
         
     }
     this.elemanlar[indis]=kelime;
     this.indis++;
     System.out.println(indis + " .indise "+" "+" elemanı başarıyla eklendi");
 }
 public void aradansil (int index){
     if(index<0 || index>=this.indis){
         System.out.println("Geçersiz indeks");
       
     }
     for(int i =indis;i<this.indis-1;i++){
         this.elemanlar[i]=this.elemanlar[i+1];
     }
     this.indis--;
 }
}
