import java.util.Scanner;

public class product {

    public static int multiply(int a,int b){
        int multi = a * b;
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter number 1:");
        int a=sc.nextInt();
        System.out.println("enter numebr 2:");
        int b=sc.nextInt();

        int product= multiply(a, b);
        System.out.println("product of "+a+" and "+ b +" is "+product);
        product = multiply(10, 20);
        System.out.println("product of a and b is "+product);
    }
}
