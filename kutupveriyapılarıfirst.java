
package javaapplication2;

  class ogrenci{
        String ad;
        String soyad;
        char cinsiyet ;
        int yas;
        public ogrenci( String ad,String soyad,char cinsiyet , int yas){
            this.ad=ad;
            this.soyad=soyad;
            this.cinsiyet=cinsiyet;
            this.yas=yas;
            
        }
    }


public class kutupveriyapılarıfirst {
    public static void main(String[] args) {
        ogrenci o = new ogrenci ("eda","aslan",'k',20);
        
        System.out.println(o.ad+ " "+ " "+ o.soyad+" "+o.cinsiyet+" "+o.yas);
        
        
        ogrenci ogr []= new ogrenci[30];
        for(int i =0;i<ogr.length;i++){
            ogr[i]=new ogrenci("a", "b", 'k', 34);
            System.out.println(ogr[i].ad +" "+ogr[i].soyad+" "+ogr[i].cinsiyet+" "+ogr[i].yas);
        }
    }
    
    
      
    
}
