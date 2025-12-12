public class question1 {
    
    public static boolean isPalindrome(String name) {
        boolean isPalindrome = true;
        int n = name.length();
        for(int i = 0 ; i < n / 2 ; i++) {
            if(name.charAt(i) != name.charAt(n-1-i)){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        String name = "alia";
        System.out.println(isPalindrome(name));
    }
}
