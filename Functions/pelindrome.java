public class pelindrome {
    public static void palindromeOrNot(int number){
        int original = number;
        int rev =0;
        int pow = 0;
        while(number>0){
            int last_digit = number % 10;
            rev = (rev*10)+last_digit;
            number = number /10;
        }
        if(original == rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Non-palindrome Number");
        }
    }

    public static void main(String[] args) {
             palindromeOrNot(1234321);
    }
}