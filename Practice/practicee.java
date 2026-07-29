import java.util.Scanner;

public class practicee{
    public static void main(String[] args) {
        // int n = 13;
        // boolean isPrime = true;

        // for(int i=2; i< n; i++) {
        //     if(n % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }
        // if(isPrime == true){
        //     System.out.println("number is prime");
        // }else{
        //     System.out.println("number is not prime");
        // }

        // patterns:

        // int n = 5;

        // for(int i=1; i<=n; i++){
        //     for (int star = 1; star <= i; star++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        // for(int i=1; i<=n; i++){
        //     for (int star = 1; star <= n-i+1; star++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        // for(int i=1; i<= n; i++) {
        //     for(int num = 1; num <= i; num++) {
        //         System.out.print(num+" ");
        //     }
        //     System.out.println();
        // }
        
        
        
        // int a = 1;

        // for(int i=1; i<= n; i++) {
        //     for(int num = 1; num <= i; num++) {
        //         System.out.print(a+" ");
        //         a++;
        //     }
        //     System.out.println();
        // }

        // char c = 'A';
        // for(int i=1; i<= n; i++) {
        //     for(int num = 1; num <= i; num++) {
        //         System.out.print(c+" ");
        //         c++;
        //     }
        //     System.out.println();
        // }

    //     for(int i=1; i<=n; i++) {
    //         for(int space = 1; space <= n-i; space++){
    //             System.out.print(" ");
    //         }
    //         for(int star = 1; star <= i; star++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=1; i<=n; i++) {
    //         for(int space = 1; space <= n-i; space++){
    //             System.out.print(" ");
    //         }
    //         for(int star = 1; star <= i; star++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     // pattern 7: 

    //     int k = 4;
    //     int m = 6;
        
    //     for(int i=1; i<=k; i++) {
    //         for(int j=1; j<=m; j++){
    //             if (i == 1 || i == k || j == 1 || j == m) {
    //                 System.out.print(" * ");
    //             }else{
    //                 System.out.print("   ");
    //             }
    //     }
    //     System.out.println(" ");
    // }
    //     // functions/ methods
    //     Scanner sc = new Scanner(System.in);

    //     int x = sc.nextInt();
    //     int y = sc.nextInt();

    //     int sum = calculateSum(x, y);
    //     System.out.println(sum);


    // binomial coefficient :
    
    Scanner sc = new Scanner(System.in);
    // System.out.println("n = ");
    // int n = sc.nextInt();
    // System.out.println("r = ");
    // int r = sc.nextInt();

    // if(r > n) {
    //     System.out.println("invalid");
    // }else{
    //     int ans = binomial(n,r);
    //     System.out.println("bionomial = "+ans);
    // }

    // System.out.print("enter a binary number : ");
    // int num = sc.nextInt();

    // int ans = binaryToDecimal(num);
    // System.out.println("numbe decimal is : "+ans);
    
    // System.out.print("enter a binary number2 : ");
    // int num2 = sc.nextInt();

    // int ans2 = decimalToBinary(num2);
    // System.out.print("decimal number: "+ans2);


    // patterns : (hollow rectangle)
    // int n = 5;
    // int m = 3;

    // for(int i=0; i <= n; i++) {
    //     for(int j=0; j<=m; j++) {
    //         if(i==0 || i == n || j == 0 || j == m) {
    //             System.out.print(" * ");
    //         }else{
    //             System.out.print("   ");
    //         }
    //     }
    //     System.out.println();
    // }
    
    // pattern : (inverted & rotated half pyramid)
    // int n = 5;

    // for(int i=1; i<=n; i++) {
    //     for(int space = 1; space<= n - i; space++) {
    //         System.out.print("   ");
    //     }
    //     for(int star = 1; star <= i; star++) {
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }

    // pattern : (inverted half pyramid with numbers)

    // int n = 5;

    // for(int i=1; i<= n; i++) {
    //     for(int j=1; j<= n-i+1; j++) {
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }

    // pattern :
    
    // int n = 5;
    // int num = 1;
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<= i; j++) {
    //         System.out.print(num + " ");
    //         num++;
    //     }
    //     System.out.println();
    // }

    // pattern (0-1 Triangle)

    // int n = 5;
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=i; j++) {
    //         if((i+j) % 2 == 0) {
    //             System.out.print(1);
    //         }else{
    //             System.out.print(0);
    //         }
    //     }
    //     System.out.println();
    // }
    
    // pattern 

    int n = 5;

    for(int i=1; i<=4; i++) {
        for(int space=1; space<=n-i; space++) {
            System.out.print(" ");
        }
        for(int num=1; num<=i; num++) {
            System.out.print(num);
        }
        for(int rev=i-1; rev>=1; rev--) {
            System.out.print(rev);
        }
        System.out.println();
    }
    }
    //helper function (for factorial) 
    public static int binaryToDecimal(int num) {

        int pow = 0;
        int decNum = 0;

        while(num > 0) {
            int last_Digit = num % 10;
            decNum = decNum + (last_Digit * (int)Math.pow(2, pow));
            pow++;
            num = num / 10;
        }
        return decNum;
    }
    public static int decimalToBinary(int num) {

        int pow = 0;
        int binNum = 0;

        while(num > 0) {
            int rem = num % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        return binNum;
    }
    public static int factorial(int num) {
        int fact = 1;
        for(int i = 2; i <= num; i++) {
            fact = fact *  i;
        }
        return fact;
    }
    public static int binomial(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_ncr = factorial(n - r);

        int res = fact_n/(fact_r * fact_ncr);
        return res;

    }
    public static int calculateSum(int a,int b) {
        return a+b;
    }
}