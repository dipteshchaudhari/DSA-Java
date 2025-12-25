public class palindromeOrNot {
    public static void main(String[] args) {   
        // String str = "racecar";
        // System.out.println(str);
        // System.out.println(palindrome(str));

        String str = " ";
        System.out.println(palindorm_leetcode(str));

    }
    public static boolean palindrome(String str) {
        int n =str.length();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    // Question : A phrase is a palindrome if, after converting all 
    // uppercase letters into lowercase letters and removing all non-alphanumeric
    // characters, it reads the same forward and backward.
    // Alphanumeric characters include letters and numbers.


    public static boolean palindorm_leetcode(String str) {
        int start = 0;
        int last = str.length() -1;

        if(str.isEmpty()){
            return true;
        }
        while (start <= last) {
            char currFirst = str.charAt(start);
            char currLast = str.charAt(last);
            
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            }else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
