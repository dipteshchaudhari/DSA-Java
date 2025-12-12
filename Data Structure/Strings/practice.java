import java.io.FileReader;
import java.lang.invoke.StringConcatFactory;

public class practice {
    public static String toUpperCasestring(String str) {
        StringBuilder sb = new StringBuilder("");

        // sb.append(Character.toUpperCase(str.charAt(0));
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i < str.length() ; i++) {

            if(str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    //1) check is string palindeome or not
    public static boolean isPalindoemw(String str) {
        int n = str.length();
        boolean isPalindoeme = true;
        for(int i = 0; i< n/2 ; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                isPalindoeme = false;
            }
        }
        return isPalindoeme;
    }
    //2) 4 directions find the shorted path
    public static float shortestPath(String str) {
        int x = 0;
        int y = 0;

        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == 'E') {
                x++;
            }else if (str.charAt(i) == 'W') {
                x--;
            }else if (str.charAt(i) == 'N') {
                y++;
            }else{
                y--;
            }
        }
        float sq_x = x*x;
        float sq_y = y*y;

        return (float)Math.sqrt(sq_x + sq_y);
    }
    //3) sub srting nikalo
        public static String subStr(String str,int SI,int EI) {
            String subS = "";
            for(int i=SI ; i < EI ; i++) {
                subS += str.charAt(i);
            }
            return subS;
        }
    //4) larest string [laxicographic]
        
    public static String largestring(String[] fruits) {
        String largest = fruits[0];

        for(int i = 1 ; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }
    //5) convert string's each first latter to uppercase
    public static String convertUppercase(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i = 1 ; i < str.length() ; i++) {
            if(i < str.length() && str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    //6) String compression
    public static String compressStr(String str) {
        String comStr = ""; 

        for(int i = 0 ; i < str.length(); i++) {
            Integer count = 1;   
            while( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
                    count++;
                    i++;
                }
                comStr += str.charAt(i);
                if(count > 1) {
                    comStr += count.toString();
                }
        }
        return comStr;
    }

    
    //7) count the lowercase vowels occurs in the string
    //8) determine idf 2 strings are anagram of each other 
    public static void main(String[] args) {
        // String str = "izzi";
        // if(isPalindoemw(str) == true) {
        //     System.out.println("palindeome string");
        // }else{
        //     System.out.println("Not a palindrome string");
        // }

        // String str = "WNEENESENNN";
        // System.out.println(shortestPath(str));

        // String str = "machoman";
        // System.out.println(subStr(str, 2, 7)); 

        // String[] fruits = {"raydu","kedu","ananas","dhraksh"};
        // System.out.println(largestring(fruits));

        // String str ="hi my name is diptesh";
        // String s = convertUppercase(str);
        // System.out.println(s);

        String str = "aaaabbcccdd";
        System.out.println(compressStr(str));
    }
}
