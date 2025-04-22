
package javaapplication2;

public class linkedlist {
    private NNode ilk;

    public linkedlist() {
        this.ilk = ilk;
    }
    public void insert (araba Araba){
        NNode yeniEleman =new NNode(Araba);
        if(this.ilk==null){
            this.ilk=yeniEleman;
            
        }else{
            if(yeniEleman.getAraba().getYil()<this.ilk.getAraba().getYil()){
                yeniEleman.setNext(this.ilk);
                this.ilk=yeniEleman;
                
            }else{
                NNode temp = ilk;
                while(temp.getNext() != null && yeniEleman.getAraba().getYil()>temp.getAraba().getYil()){
                    temp = temp.getNext();
                }
                yeniEleman.setNext(temp.getNext());
                temp.setNext(yeniEleman);
            }
        }
    }
    
    public void display(){
        NNode p =ilk;
            while(p != null){
                p.getAraba();
                p=p.getNext();
            }
            System.out.println("");
    }
}
