import java.util.*;
public class binomial_fact {
    public static int factorial(int m){
        int fact = 1;
        for(int i =1;i<=m;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int bionomial_fact(int n_fact,int r_fact){
        int n = factorial(n_fact);
        int r = factorial(r_fact);
        int c = factorial(n_fact - r_fact);

        int result = n/(r * c);
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("****for find the Bionomial of any Number****");
        System.out.println("enter number n :");
        int n = sc.nextInt();
        System.out.println("Enter number r :");
        int r = sc.nextInt();

        if(r>n){
            System.out.println("Invalid input cause r can not be greater than n");
        }else{
              int result = bionomial_fact(n,r);
        System.out.println(result);
        // System.out.println(bionomial_fact(n1, n2));
        }
      

    }
}
