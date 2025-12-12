import java.util.Arrays;

public class practice {
    public static boolean anagramsOrNot(String str1,String str2) {

        if(str1.length() == str2.length()) {

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char[] str1CharArr = str1.toCharArray();
            char[] str2CharArr = str2.toCharArray();

            Arrays.sort(str1CharArr);
            Arrays.sort(str2CharArr);

            if(Arrays.equals(str1CharArr,str2CharArr)) {
            return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        String str1 = "lives";
        String str2 = "elvis";
        boolean result = anagramsOrNot(str1, str2);
        if(result) {
            System.out.println(str1 + " and " +str2+ " both are anagram of each other");
        }else{
            System.out.println(str1 + " and " +str2+ " both are not anagram of each other");
        }
    }
}
