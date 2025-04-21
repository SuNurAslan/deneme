
package yeniuygula;


public class sozluksirasidiziornegi {
    //kendisine parametre olarak gelen bir 2 boyutlu string dizisi içinden 
    //sözlükte en önce gelen Stringi ve satırı ve sutunuda bulup geri döndüren metotu yazınız.
     public static String[] dondur (String [][] s){
         int satir=0; int sutun=0;
          String ilk =s[0][0];
          for (int i = 0; i <s.length; i++) {
              for (int j = 0; j < s[0].length; j++) {
                  if(ilk.compareTo (s[i][j])>0)
                      ilk =s[i][j];
                  satir=i;
                  sutun=j;
                      
                  
                  
              }
             
         }
         String geri [] ={ilk,Integer.toString(satir),Integer.toString(sutun)}; 
          return geri;
      }  
        
    public static void main(String[] args) {
        String [][] s = {{"ali","veli","ayse"},{"aaa","bbb","ccc"}};
        String gg [] = dondur(s);
        System.out.println(gg[0]+" "+gg[1]+" "+gg[2]);
    
    
}}
    

