
package yeniuygula;


public class polindrom {
    public static boolean isPalindrom2(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return false;

    }

    public static void main(String[] args) {
        
        String str ="yapay";
        if(isPalindrom2(str))
            System.out.println(str +"kelimesi bir palindromdur.");
        else
            System.out.println(str+" kelimesi bir palindrom değildir.");

    }

    
}
