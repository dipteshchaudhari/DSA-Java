import java.util.Scanner;

public class function{
    
    public static int sum(int a,int b){ //<-function method     // formal parameters or parameters
        int sum = a + b;        
        return sum;                             
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1:");
        int a = sc.nextInt();
        System.out.println("enter number 2:");
        int b = sc.nextInt();
        int result = sum(a, b);        //<-function call               // arguments or actual parameters
        System.out.println(result);
    }
}