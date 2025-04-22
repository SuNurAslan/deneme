
package javaapplication2;


public class araba {
    private String marka;
    private int yil;

    public araba(String marka, int yil) {
        this.marka = marka;
        this.yil = yil;
    }
    public String getMarka(){
        return marka;
        
    }
    public void setMarka(String marka){
       this.marka=marka;
        
    }
    public int getYil(){
        return yil;
    }
    public void setYıl(int yil){
        this.yil=yil;
        
    }
    public void display(){
        System.out.println(" ["+ this.yil +" "+this.marka + " ]");
    }
    
}
