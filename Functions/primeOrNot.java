import java.util.Scanner;

public class primeOrNot {
    public static Boolean IsPrime(int n){
        // boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){      // for(int i=2;i<=n-1;i++){  or // for(int i=2;i*i<=n;i++)
            if(n%i == 0){
                // isPrime = false;
                return false;
                // break;
            }
        }
        return true;
        // return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        
        boolean result = IsPrime(a);
        if(result == true){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}
