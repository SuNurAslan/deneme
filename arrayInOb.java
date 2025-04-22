
package javaapplication2;


public class arrayInOb {
    private Person person [];
    private int nelements;
    private int size;
    
    public arrayInOb(int size){
        this.size=size;
        this.person= new Person[size];
        this.nelements=0;
        
    }
   public void insert (String last,String first,int age){
       if(this.nelements<this.size){
           this.person[nelements]=new Person(last, first, age);
           this.nelements++;
           
       }else{
           System.out.println(" ");
       }
   } 
   public void display(){
       for(int j =0;j<this.nelements;j++){
           this.person[j].displayPerson();
           
       }
       System.out.println();
   } 
    public void selectionSort(){
        Person tmp;
        int index=0;
        for(int i =0;i<this.nelements;i++){
            index =i;
            for(int j =i;j<this.nelements;j++){
                if(this.person[j].getLastName().compareTo(this.person[index].getLastName())<0){
                    index =j;
                    
                }
            }
            tmp=this.person[i];
            this.person[i]=this.person[index];
            this.person[index]=tmp;
        }
        
    }
}
