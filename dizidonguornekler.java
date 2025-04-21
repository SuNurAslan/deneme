
package yeniuygula;


public class dizidonguornekler {
     /*  public static void main(String [] args) {
        int dizi[]={3,5,2,11,28};
        for(int i =dizi.length-1;i>0;i--){
            dizi[i]+=dizi[i-1];
            
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
            
        }
    }*/
    
   /* public static void main(String[] args) {
        int dizi[]={3,5,2,11,28};
         boolean sıraliMi=true;
         for(int i =1;i<dizi.length;i++){
             if(!(dizi[i]>dizi[i-1])){
                 sıraliMi=false;
                 break;
                
             }
         }
         System.out.println(sıraliMi); 
    }
     */
   /* public static void main(String[] args) {
        int dizi[]={96,6,9,11,4,7,28};
        int eb =Integer.MIN_VALUE;
        for(int i =0;i<dizi.length;i++){
            if(dizi[i]>eb&&dizi[i]%2==1)
                eb=dizi[i];
        
        
    }
      System.out.println(eb);   
*/
    
    /*public static void main(String[] args) {
      double terim =2;
      int n=3;
      double top=terim;
      for(int i =0;i<n-1;i++){
          terim*=0.8;
          top+=terim*2;
          
      }
        System.out.println(top);
    */
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sonuc;
        double max=0;
        int maxx,maxy;
        for(int i=0;i<10;i++){
            int x =scanner.nextInt();
            int y=scanner.nextInt();
            
            sonuc=Math.sqrt((x*x)+(y*y));
            if(sonuc>max){
                max=sonuc;
                maxx=x;
                maxy=y;
                
            }
    }
    */
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        int kharsayisi=0;
        int bharfsayisi=0;
        String yeni="";
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                kharsayisi++;
                yeni+=str.charAt(i);
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                bharfsayisi++;
        }
        System.out.println("büyük harf sayısı="+bharfsayisi+
                "kücük harf sayısı = "+kharsayisi+yeni);
    }*/
    
    
   /* public static void main(String[] args) {
        
        int sayac=0;
        int sayi=235;
        for(int i =2;i<sayi;i++){
            if(sayi%i==0){
                sayac=i;
                break;
            }
        }
        if(sayac==0){
            System.out.println("asal");
     
 }else{
            System.out.println("Asal değil "+sayac+" ile tam bölünür");
        }
       }
    
    */
    /*public static void main(String[] args) {
        int top=0;
    int terim=2;
    for(int i =0;i<10;i++){
        top+=terim;
        if(i%2==0){
            terim=terim+2;
            
        }else{
            terim+=4;
        }
    }
        System.out.println(top);
    }
    */
   /* public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
    String str = scanner.nextLine();
    String str2 = scanner.nextLine();
    String yeni="";
   int a= str.length();
   int b=str2.length();
   int uzunluk;
   if(a<b)
       uzunluk=a;
   else{
       uzunluk=b;
    for(int i =0; i<uzunluk;i++){
            if(str.charAt(i)==str2.charAt(i)){
                yeni+=str.charAt(i);
            }
        }
        
    }
        System.out.println(yeni);
    }
   */
  /*  public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        int eb =Integer.MIN_VALUE;
        int ek=Integer.MAX_VALUE;
        double ort;
        int top=0;
        for (int i = 0; i < 7; i++) {
           
            int sayi=scaner.nextInt();
             top+=sayi;
            if(eb<sayi)
                eb=sayi;
            else if(ek>sayi)
                ek=sayi;
        }
        ort=top/7;
        System.out.println(ort+" "+eb+" "+ek);
    }
    */
   /* public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sayi=scanner.nextInt();
        String str=Integer.toString(sayi);
        boolean polindromMu=true;
        int uzunluk =str.length();
        for (int i = 0; i < uzunluk/2; i++) {
            if(str.charAt(i)!=str.charAt(uzunluk-1-i)){
                polindromMu=false;
               
                break;
            } 
            
        }
        if(polindromMu){
             System.out.println("Sayı polindromdur");
       
        }else{
            System.out.println("değildir");
        }
    }
    
    */
   /* public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
       int uzunluk=str.length();
       boolean polindromMu=true;
       for(int i =0;i<uzunluk/2;i++){
           if(str.charAt(i)!=str.charAt(uzunluk-1-i)){
               polindromMu=false;
               break;
           }
       }
       if(polindromMu){
           System.out.println("String polindrpmdur");
       }else{
           System.out.println("Değildir");
       }
    }
    */
    /*public static void main(String[] args) {
    int takım1scor []={1,2,3,4};
    int takım2scor []={4,2,8,7};
    int sayac=0;
    
    for(int i =0;i<takım1scor.length;i++){
        if(takım1scor[i]==takım2scor[i]){
            System.out.println("beraberlik");
        sayac++;
                }
        else if(takım1scor[i]<takım2scor[i])
            System.out.println("takım2 kazandı");
        else if(takım1scor[i]>takım2scor[i])
            System.out.println("takım1 kazandı");
    }
        System.out.println(sayac+ " tane beraberlik");
    
    }*/
    /*public static void main(String[] args) {
         String takımlar[]={"GS","FB","BJK","TS"};
        for (int i = 0; i < takımlar.length; i++) {
            String takim=takımlar[i];
            for (int j = 0; j < takımlar.length; j++) {
                if(i!=j)
                    System.out.println(takim+"-"+takımlar[j]);
                
            }
   
        }
    }
   */
  /*  public static void main(String[] args) {
         String takımlar[]={"BJK","FB","GS","TS"};
         int puanlar[] ={1,4,7,3};
         for(int i =0;i<puanlar.length;i++){
             int ebi =i;
             for(int j =i+1;j<puanlar.length;j++){
                 if(puanlar[j]>puanlar[ebi]){
                     ebi=j;
                 }
             }
             int gecici=puanlar[i];
             puanlar[i]=puanlar[ebi];
             puanlar[ebi]=gecici;
             
             String gecicitakim =takımlar[i];
             takımlar[i]=takımlar[ebi];
             takımlar[i]=gecicitakim;
             }
         for (int i = 0; i < puanlar.length; i++) {
             System.out.println(takımlar[i]+"-"+puanlar[i]);
            
        }
    }
 */
    
   /* public static void main(String[] args) {
        int dizi[]={2,4,7,10,11,45,50,59,60,66,69,70,79};
        int aranan =59;
        int altsinir=0;
        int ortanca;
        int ustsinir=dizi.length-1;
        int indis =-1;
        while(ustsinir>=altsinir){
            ortanca=(altsinir+ustsinir)/2;
            if(aranan==dizi[ortanca]){
                indis=ortanca;
                break;
            }else if(aranan>dizi[ortanca]){
                altsinir=ortanca+1;
            }else{
                ustsinir=ortanca-1;
            }
        }
        
        if(indis>-1){
            System.out.println("aranan sayı "+indis+" te bulundu");
        }else{
            System.out.println("aranananan eleman bulunamadı");
        }
    }
   
    */
    /*public static void main(String[] args) {
        String dizi [] = {"bbb","qwt","aaa","cab","bac"};
    char aranan='a';
    for(int i =0;i<dizi.length;i++){
        for(int j=0;j<dizi[0].length();j++){
            if(dizi[i].charAt(j)==aranan){
           System.out.println(dizi[i]);
           break;
            }
        }
    }
    }
    */
   /* public static void main(String[] args) {
 
    int matris[][] = {{-4,-3,-2},{5,6,7},{17,10,11}};
    int ebdizisi [] = new int [matris.length];
    for(int i =0;i<matris.length;i++){
         ebdizisi[i] =matris[i][0];
        for(int j=0;j<matris[0].length;j++){
            if(matris[i][j]>ebdizisi[i]){
                ebdizisi[i]=matris[i][j];
            }
        }
    }
    
        for (int i = 0; i < matris.length; i++) {
            System.out.println(ebdizisi[i]);
            
        }
    
    
    }
    */
   /* public static void main(String[] args) {
        int matris[][]={{1,2,3},{5,6,7},{17,10,11}};
        int top=0;
        for (int i = 0; i < matris.length; i++) {
            top+=matris[i][i];
            top+=matris[i][matris.length-1];
            
        }
        System.out.println(top);
    }
    */
    
   /* public static void main(String[] args) {
         int matris[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
         int sonucmatris [][] =new int[matris[0].length][matris.length];
         
         for(int i =0;i< matris.length;i++){
             for(int j =0;j<matris[0].length;j++){
                sonucmatris[j][i]=matris[i][j];
             }
         }
          for (int i = 0; i < sonucmatris.length; i++) {
            for (int j = 0; j < sonucmatris[0].length; j++) {
                System.out.print(sonucmatris[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    */
   /* public static void main(String[] args) {
        int matris1 [][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int matris2 [][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int top [][] = new int[matris1.length][matris1[0].length];
        for(int i =0;i<matris1.length;i++){
            for (int j = 0; j < matris1[0].length; j++) {
                
                    top[i][j]=matris1[i][j]+matris2[i][j];
                
                
            }
            
        }
         for(int i =0;i<matris1.length;i++){
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.print(top[i][j]+" ");
            }
             System.out.println(" ");
    }
    } 
    */
   /* public static void main(String[] args) {
         int matris[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
         for (int i = 0; i < matris.length; i++) {
             for (int j = 0; j < matris[0].length; j++) {
                 int r1=(int)(Math.random()*(matris.length));
                 int r2 =(int)(Math.random()*matris[0].length);
                 
                int temp=matris[i][j];
                matris[i][j]=matris[r1][r2];
                matris[r2][r1]=temp;
                 
                 
             }
            
        }
        for (int i = 0; i < matris.length; i++) {
            for(int j =0;j<matris[0].length;j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println(""); 
        }
   
        
    }
    
    */
    
 /*   public static void main(String[] args) {
          int matris[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
          int sonuc[]=new int[matris.length];
         
          for(int i=0;i<matris.length;i++){
              int top=0;
            for(int j=0;j<matris[0].length;j++){
               top+=matris[i][j];
            }
            sonuc[i]=top;
          }
           for(int i=0;i<matris.length;i++){
               System.out.println(sonuc[i]);
           }
        
    }
   */ 
   /* public static void main(String[] args) {
       int f1 =1;
       int f2=1;
        System.out.println(f1);
        System.out.println(f2);
       int c=0;
       for(int i =3;i<=10;i++){
           c=f1+f2;
           f2=f1;
           f1=c;
           System.out.println(c);
       }
        
    }
    */
   /* public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int top =0;
        while(true){
        System.out.println("Bir sayı giriniz: ");
        int sayi =scanner.nextInt();
        top+=sayi;
           
        if(sayi==0){
            System.out.println("Programdan cıklıldı");
             break;
        }
        
           
        }
      System.out.println("toplam : "+top);  
    }
    */
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Bir String giriniz: ");
            String str=scanner.nextLine();
            if(str.charAt(0)=='a'||str.charAt(0)=='A'){
                System.out.println(str + " A veya a ile başlar");
            }else if(str.equals("q")){
                System.out.println("Programdan cıkılıyor");
                break;
            }
        }
    }
    */
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int top=0;
        double ort=1;
        int eb =Integer.MIN_VALUE;
        int ek=Integer.MAX_VALUE;
        for(int i =0;i<10;i++){
            System.out.println("Bir sayı giriniz: ");
            int sayi =scanner.nextInt();
            top+=sayi;
            if(eb<sayi)
                eb=sayi;
            else if(ek>sayi)
                ek=sayi;
            
            ort=top/10;
        }
        System.out.println(ek);
        System.out.println(eb);
        System.out.println(ort);
    }
*/
    
  /*  public static void main(String[] args) {
        int eb =Integer.MIN_VALUE;
        int[]sayidizisi=new int[10];
        Scanner scanner =new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            sayidizisi[i]=scanner.nextInt();
        }
        for(int i =0;i<10;i++){
            if(sayidizisi[i]>eb  && sayidizisi[i]%2==1){
                eb=sayidizisi[i];
            }
        }
        System.out.println(eb);
    }
 
   */
    /*public static void tekboyut(String [][]dizi){
        for (int i = 0; i < dizi.length; i++) {
            String birlesmissutun="";
            for (int j = 0; j < dizi[0].length; j++) {
                birlesmissutun+=dizi[i][j];
                
            }
            System.out.println(birlesmissutun);  
        }
       
    }
    public static void main(String[] args) {
        String dizi [][] ={{"a","b","c"},{"d","e","f"},{"g","h","ı"}};
        tekboyut(dizi);
    }
    */
   /* public static void sayılılar (String [][]dizi){
       
         for(int i=0;i<dizi.length;i++){
             for(int j =0;j<dizi[i].length;j++){
                 String mevcutstring =dizi[i][j];
                  boolean raakamVarMı=false;
                 for (int k = 0; k < mevcutstring.length(); k++) {
                      if(mevcutstring.charAt(k)>'0'&&mevcutstring.charAt(k)<'9'){
                     raakamVarMı=true;
                     break;
                 }
                     
                 }
                 if(!raakamVarMı){
                     System.out.println(mevcutstring);
                 }
             }
         }
        
    }
    public static void main(String[] args) {
         String dizi[][] ={{"444","cd3","tkl"}, 
                            {"abc","de3","tre"}
                           ,{"ouy","3er","qwe"}};
         
        sayılılar(dizi);
    }
   
    */
    /*public static boolean asalMi(int sayi){
        if(sayi<=1)
            return false;
        if(sayi==2&&sayi==3)
            return true;
        if(sayi%2==0){
            return false;
        }
        for(int i =3;i<sayi/2;i+=2)
            if(sayi%i==0){
                return false;
    }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("Bir pozitif sayı giriniz");
        int girilen = scanner.nextInt();
        if(asalMi(girilen)){
            System.out.println("sayı asaldır");
        }else{
            System.out.println("Sayı asal değilidri");
        }
    }
    */
    
   /* public static String yeni (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String  str1 = scanner.nextLine();
        String str2 =scanner.nextLine();
        String yeni="";
         int uzunluk;
         int s1 =str1.length();
         int s2 =str2.length();
         if(s1<s2)
             uzunluk=s1;
         else{
             uzunluk=s2;
         }
             
         for(int i =0;i<uzunluk;i++){
             if(str1.charAt(i)==str2.charAt(i))
                 yeni+=str1.charAt(i);
             
         }
         System.out.println(yeni);
        return yeni;
    }
    public static void main(String[] args) {
        yeni();
    }
    */
   /* public static void main(String[] args) {
         int [][]A={{4,5},{2,3}};
    
    int [][] B=new int[A[0].length][A.length];
     for(int i =0;i<A.length;i++){
         for(int j =0;j<A[0].length;j++){
             B[j][i]=A[i][j];
         }
         
     }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j]+" ");
                
            }
            System.out.println("");
            
        }
    }
   */
   /* public static void main(String[] args) {
        int dizi [] = new int [10];
        int toplam =0;
        
        dizi[0]=2;
        dizi[1]=4;
        
        for(int i =2;i<dizi.length;i++){
            if((i-1)%2==0){
                dizi[i]=dizi[i-1]+2;
                
            }else{
                dizi[i]=dizi[i-1]+4;
            }
        }
        for(int i =0;i<dizi.length;i++){
            System.out.print(dizi[i]+" ");
        }
        for(int i =0;i<10;i++){
            toplam+=dizi[i];
        }
        System.out.println(toplam);
    }
    */
   /* public static void ekbul(int dizi[]){
       int ek = dizi[0];
       int eki=0;
       for(int i =0;i<dizi.length;i++){
           if(ek>dizi[i]){
               ek=dizi[i];
               eki=i;
           }   
       }
        System.out.println(eki);
        
    }
    public static void main(String[] args) {
        int dizi [] ={0,1,-3,4,9,-7,6,9};
        ekbul(dizi);
    }
*/
    /*public static void polindrom(String str [][]){
        for(int i =0;i<str.length;i++){
            for(int j =0;j<str[0].length;j++){
                String kelime=str[i][j];
                int uzunluk =kelime.length();
                boolean polindrommu=true;
                for(int k =0;k<uzunluk/2;k++){
                    if(kelime.charAt(k)!=kelime.charAt(uzunluk-1-k)){
                        polindrommu=false;
                        break;
                    }
                }
                if(polindrommu){
                    System.out.println("Polindrom ="+kelime);
                }
            }
            
        }
    }
    public static void main(String[] args) {
        String str [][] ={{"kek","elma","1221"},{"radar","kabak","deneme"}
                ,{"aba","polindrom","civic"}};
        polindrom(str);
    }
    
    */
    /*public static int [] kbharfsayisi(char [][] dizi){
        int kharfsayisi=0;
        int bharfsayisi=0;
        
        
        
        for(int i=0;i<dizi.length;i++){
            for(int j =0;j<dizi[i].length;j++){
                if(dizi[i][j]>'a'&&dizi[i][j]<'z'){
                    kharfsayisi++;
                }else if(dizi[i][j]>'A'&&dizi[i][j]<'Z'){
                    bharfsayisi ++;
                }
            }
        }
        int [] harfler=new int[2];
        harfler[0]=kharfsayisi;
        harfler[1]=bharfsayisi;
        for (int i = 0; i < 2; i++) {
            System.out.println(harfler[i]);
            
        }
       return harfler;
        
        
    }
    public static void main(String[] args) {
         char dizi [][] ={{'a','b','E'},{'İ','t','l'}
                ,{'ı','t','m'}};
       kbharfsayisi(dizi);
    }
    */
    /*public static double toplamyolhesapla(double ilkyukseklik,double oran){
        double toplamyol=0;
        double yukseklik=ilkyukseklik;
        
        while(yukseklik>0.01){
            toplamyol+=yukseklik;
            
            yukseklik*=oran;
            toplamyol+=yukseklik;
            
        }
        toplamyol-=yukseklik;
        return toplamyol;
    }
    
    public static void main(String[] args) {
        double toplamyol=toplamyolhesapla(2, 0.80);
        System.out.println("topun aldığı toplam yol: "+toplamyol+" metre");
        
        
    }
    
    
    */
   /* public static boolean ozelKarekterMi(char karakter){
        String ozelKarakter="!@#%*&+";
        for(int i =0;i<ozelKarakter.length();i++){
            if(karakter == ozelKarakter.charAt(i))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String testkarakter="abcd%&$#0";
        for(int i =0;i<testkarakter.length();i++){
            
            System.out.print(ozelKarekterMi(testkarakter.charAt(i))+" ");
        }
        
    }
    */
    /* public static void main(String[] args) {
        String [] takimlar = {"GS","FB","BJK","TS"};
		int [] puanlar = {3,4,5,6};
        for (int i = 0; i < puanlar.length; i++) {
            int ebi = i;
            for (int j = i+1; j < puanlar.length; j++) {
                if(puanlar[j]>puanlar[ebi]) {
                    ebi = j;
                }
            }
            int gecici = puanlar[i]; 
            puanlar[i] = puanlar[ebi];
            puanlar[ebi] = gecici;
            
            String geciciTakim = takimlar[i];
            takimlar[i] = takimlar[ebi];
            takimlar[ebi] = geciciTakim;
        }
        for (int i = 0; i < puanlar.length; i++) {
            System.out.println(takimlar[i]+" - "+puanlar[i]);
            
        }
    }
    
    */
    public static void main(String[] args) {
int x=2, y=3, z=1;
while (z < 5) {
if ((++x < 6) || (++y < 4)) {
if (z % 2 == 0) x++;
else --y;
}
z++;
}
System.out.print(x+y);
}
    
    
    
    
}
