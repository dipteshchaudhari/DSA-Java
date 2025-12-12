package Assignment;

public class Question1 {
    public static int lowercaseVowels(String str) {
        int count = 0;
        for(int i=0 ; i<str.length();i++) {
            if(isVowel(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // String str = "karan arjun";  // lowercase vowels : 4
        String str = "diptesh"; // lowercase vowels :
        int result = lowercaseVowels(str);
        System.out.println(result);
    }   
}
