import java.util.Scanner;

public class practice {
    public static boolean reverse(int n){
        int original = n;
        int rev = 0;
        while (n>0) {
            int ld= n %10;
            rev = (rev * 10) + ld;
            n = n/10;
        }
        if(original == rev){
            return true;
        }else{
            return false;
        }
    }
    public static void sum_of_digits(int n){
        int sum=0;
        while (n>0) {
            int ld = n%10;
            sum = sum + ld;
            n = n / 10;
        }
        System.out.println("sum of the digits is: "+sum);
    }
    public static void factorial_find(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i ;
        }
        System.out.println("factorial of given number is :"+fact);
    }

    public static boolean primeOrNot(int n){
        boolean isPrime = true; 
        for(int i=2;i<=n-1;i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void Bin_To_dec(int number){
        int dec = 0;
        int pow=0;
        while (number > 0) {
            int ld =number % 10;
            dec = dec +(ld * (int)Math.pow(2, pow));

            pow++;
            number = number / 10;
        }
        System.out.println("binary to decimal is:"+dec);
    }
    public static void decimal_t0_binary(int n){
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int remainder = n % 2 ;
            bin = bin + (remainder * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Decimal to Binary is :" +bin);
    }
    public static void main(String[] args) {
        // boolean result = reverse(434);
        // if (result) {
        //     System.out.println("the number is palindrome");
        // }else{
        //     System.out.println("non palindeome number");
        // }

        // sum_of_digits(1234554);

        // factorial_find(3);

        Scanner sc =new Scanner(System.in);
        // System.out.println("enter any Number: ");
        // int n = sc.nextInt();
        // boolean result = primeOrNot(n);
        // if(result == true){
        //     System.out.println("prime number");
        // }else{
        //     System.out.println("non prime number");
        // }

        // Bin_To_dec(10);
        // decimal_t0_binary(4);
    }
}