package javaapplication1;

class class1 {

    public class1(String isim, int sayi) {
        System.out.println("(" + isim + "," + sayi + ":)");
    }
}

class class2 extends class1 {

    private String ad;
    private int no;

    public class2(String isim, int sayi) {
        super("2.SINIF", 3);
        this.ad = isim;
        this.no = sayi;
        yazdir();
    }

    public void yazdir() {
        System.out.println("(" + this.ad + "," + this.no + ":)");
    }
}

class class3 extends class2 {

    private String ad;

    public class3() {
        super("3.SINIF", 5);
        System.out.println("(3,1)");

    }
}

public class interfaces {
    public static void main(String[] args) {
        class3 c = new class3();
        
    }

}
