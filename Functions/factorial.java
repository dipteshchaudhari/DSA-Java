import java.util.Scanner;
public class factorial {

    public static int factorial(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number for factorial of that number:");
        int a =sc.nextInt();

        int result = factorial(a);
        System.out.println("factorial of given number is :" +result);
        System.out.println(factorial(5));
    }
}
