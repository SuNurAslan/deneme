
package javaapplication2;

public class ciftbaglıliste {
    Eleman bas;
    Eleman son;
    
    public ciftbaglıliste(){
        bas=null;
        son=null;
    }
  public  void basaekle(Eleman yeni){
      if(bas==null){
          bas=yeni;
          son=yeni;
      }else{
          yeni.ileri=bas;
          bas.geri=yeni;
          bas=yeni;
          
      }
  }
  public void sonaekle(Eleman yeni){
      if(bas==null){
          bas=yeni;
          son=yeni;
      }else{
          yeni.geri=son;
          son.ileri=yeni;
          son=yeni;
      }
      
  }
  
  public void bastansil(){
      if(bas.ileri==null){
          bas=null;
      }else{
          bas.ileri.geri=null;
          bas=bas.ileri;
      }
      
  }
  public void sondansil(){
      
      if(bas.ileri==null){
          bas=null;
          
      }else{
          son.geri.ileri=null;
          son=son.geri;
          
      }
  }
  public void arayaekle(int nereye, Eleman eklenecek){
      Eleman yedek =bas;
      while(yedek.sayi != nereye){
          yedek=yedek.ileri;
          if(yedek == null){
              System.out.println("Hiç eleman yok");
          }
      }
      if(yedek==son){
          eklenecek.ileri=null;
      }else{
          eklenecek.ileri=yedek.ileri;
          yedek.ileri.geri=eklenecek;
      }
      eklenecek.geri=yedek;
      yedek.ileri=eklenecek;
      
      
  }
  public void aradansil(int aranan){
     Eleman yedek =bas;
     while( yedek.sayi != aranan){
         yedek=yedek.ileri;
         if(yedek==null){
             System.out.println("Liste boş");
         }
     }
     if(yedek==bas){
         bas=yedek.ileri;
         bas.geri=null;
     }else{
         yedek.geri.ileri=yedek.ileri;
     }
  }
  String listele(){
      Eleman yedek=bas;
      String liste="";
      while(yedek != null){
          liste=liste+yedek.sayi+"-->";
          yedek=yedek.ileri;
          
          
      }
      return liste;
  }
  
}
