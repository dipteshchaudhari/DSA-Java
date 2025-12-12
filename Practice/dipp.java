import java.util.Scanner;

public class dipp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Numeber:");
        // int num = sc.nextInt();
        // boolean isPrime = true;

        // if(num <= 1){
        //     System.out.println("Non-Prime Number");
        //     return;
        // }
        // for(int i=2;i <= Math.sqrt(num);i++){
        //     if(num % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        // if(isPrime == true){
        //     System.out.println("its prime number");
        // }else{
        //     System.out.println("Non Prime Number");
        // }   

        // System.out.print("ENter How many fibonacci numbers u want: ");
        // int n = sc.nextInt();
        // int first = 0;
        // int sec = 1;

        // System.out.print(first+" ");
        // System.out.print(sec+" ");
        // for(int i=2; i<n;i++){
        //     int third = first + sec;
        //     System.out.print(third+" ");
        //     first = sec;
        //     sec = third;
        // }

        // int number = 1434;

        // while(number > 0){
        //     int ld = number % 10;
        //     System.out.print(ld);
        //     number /= 10;  
        // }
        
        // logic for getting reverse of a number by storing value into variable :
        
        // int n = 142;
        // int rev = 0;
        // while(n > 0){
        //     int ld = n % 10;
        //     rev = rev * 10 + ld;
        //     n=n/10;
        // }
        // System.out.println(rev);

        // Sum of digits
        
        // int num = 1234; // sum = 10
        // int sum=0;
        // while(num > 0){
        //     int id = num % 10;
        //     sum = sum + id;
        //     num /= 10;
        // }
        // System.out.println("sum of digits = "+sum);

        // int n = 5;
        // int fact = 1;
        // for (int i= 1 ; i<=n ;i++){
        //     fact =fact * i;
        // }
        // System.out.println("factorial of given number is ="+fact);

        // Patterns
        // int n = 4;
        // for(int i = 1; i<=n ; i++) {
        //     for(int hash = 1 ; hash<=i ; hash++) {
        //         System.out.print("#");
        //     }
        //     System.out.println();
        // }
        // int n = 4;
        // for(int i = 0 ; i< n ;i++) {
        //     for(int start = 0; start<n-i; start++) {    
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n = 4;
        // for(int i=1; i<=n ;i++) {
        //     for(int j = 1 ; j <= i ; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // } 
        // int n = 4;
        // char ch='A';
        // for(int i=1;i<=n;i++) {
        //     for(int j = 1 ; j<=i ; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // int n = 4;
        // for(int i = 1; i<= n; i++) {
        //     for(int space = 1 ; space <= n - i ; space++) {
        //         System.out.print(" ");
        //     }
        //     for(int star = 1 ; star <= i; star++ ) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n = 4;
        // for(int i = 1; i<=n;i++) {
        //     for(int space = 1; space <=n-i; space++) {
        //         System.out.print(" ");
        //     }
        //     for(int star = 1; star <=i ; star ++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n=4; // rows 
        // int m=6; // cols 
        // for(int rows = 1 ; rows <= n ; rows++) {
        //     for(int col = 1; col <= m ; col++) {

        //         if(rows == 1 || rows == n || col == 1 || col == m) {
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // // BioNomial coefficient
        // // --> bhai use long data type instead of int cause it can give big values for big factorials 
        // System.out.print("enter value of n: ");
        // int n = sc.nextInt();
        // System.out.print("enter value of r: ");
        // int r = sc.nextInt();

        // // logic for checks 
        // if(n < 0 || r < 0) {
        //     System.out.println("Invalid n and r must not be nagative");
        //     return;
        // }
        // if (n < r) {
        //     System.out.println("r can not be greater than n bro");
        //     return;
        // }

        // boolean invalid = r > n;
        // if(invalid){
        //     System.out.println("Invalid");
        // }else{
        //     int result = bioNomial_fact(n, r);
        //     System.out.println("bionomial factorial of a number is = "+ result);

        // Array : list of elemetns of the same type in a contiguos memory location

        // // creating an array:
        // int arr[] = new int[10];
        // int num[] = {1,2,3};

        // // arr[0] = 32;
        // // arr[1] = 39;
        // System.out.println(arr[0]);

        // for(int i = 0; i<arr.length; i++) {
        //     System.out.print("Enter a Number "+i+" :");
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Array Elements : ");
        // for(int i=0;i < arr.length ;i++) {
        //     System.out.print(arr[i] +" ");
        // }

        // when we pass array as an parameter so that time --> pass by reference 
        // meaning change in the array , changes the actual array also.
        int marks[] = {1,2,3,4,5};
        array_oprtn(marks);

        for(int i=0;i < marks.length ;i++) {
            System.out.print(marks[i] +" ");
        }

        
    }



        public static void array_oprtn(int marks[]){
            for(int i=0;i < marks.length ;i++) {
            marks[i] = marks[i] + 1;
            }
        }

        public static int factorial(int num) {
            int fact = 1;
            for(int i =1; i<= num ;i++) {
                fact = fact * i;
        }
        return fact;
        }
         public static int bioNomial_fact(int n,int r) { 
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nmr = factorial(n-r);

            int result = fact_n/(fact_r*fact_nmr);
            return result;
        }
    
    }
