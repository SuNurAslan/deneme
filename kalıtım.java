
package yeniuygula;



    class ınsan {
    public ınsan (int par){
        System.out.println("Insan yapılandırıcısı "+par);
    }
}
class zekınsan extends ınsan {
    
    public zekınsan(int par) {
        super(par+1);
        System.out.println("Zeki insan yapılandırıcısı "+par);
    }
    
}
class hacker extends zekınsan{
    public hacker (int par ){
        super(par+1);
        System.out.println("Hacker yapılandırıcısı "+par);
    }
}
public class kalıtım {
    public static void main(String[] args) {
      hacker hc = new hacker(5);  
    }
    
}


