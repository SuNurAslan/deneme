
package yeniuygula;

class sınıf{
    private int t = 100;
    
    public String S ="YAZOKULU";
    
    public void yaz(){
        goster();
        System.out.println("Yaz metotu içindesin..");
        System.out.println("t nin değeri = "+t+"dir");
    }
    
    private void goster (){
        System.out.println("Goster metotu calisio..");
    }
    
}


public class metotlaar{
    public static void main(String[] args) {
        sınıf a1 = new sınıf();
        a1.yaz();
        System.out.println(a1.S);
    }
    
}
