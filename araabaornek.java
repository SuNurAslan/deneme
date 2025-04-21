
package yeniuygula;
class motor{
  private static int motor_gucu =3600;
  public void cali(){
      System.out.println("Motor çalışıyor..");
  }
  public void dur(){
      System.out.println("Motor durdu..");
  }
    
}


public class araabaornek {
    private motor m = new motor();
    public void hareketet(){
        m.cali();
        System.out.println("Aile arabası hareket edio..");        
    }
    public void dur(){
        m.dur();
        System.out.println("Aile arabası durdu..");
    }
    
    public static void main(String[] args) {
       araabaornek aa = new araabaornek();
       aa.hareketet();
       aa.dur();
        
    }
}


    

