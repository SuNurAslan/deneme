
package javaapplication2;



public class personornekmain {
    

    public static void main(String[] args) {
        arrayInOb arr = new arrayInOb (50);
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Doc", 59);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Smith", "Paul", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        
        System.out.println("Sıralanmamış dizi");
        arr.display();

        System.out.println("Sıralanmış dizi:");
        arr.selectionSort();
        arr.display();

        
    }
    
}
