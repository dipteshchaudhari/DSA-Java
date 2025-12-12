//  ****** REVERSE OF A NUMBER ******

// public class prac {
//     public static void reevrse(int number){
//         int myNum = number;
//         int rev = 0;
//         while (number > 0) {
//             int ld = number % 10;
//             rev = (rev * 10) + ld; 
//             number = number / 10;
//         }
//         System.out.println("the reverse number of "+myNum+" is = "+rev);
//     }
//     public static void main(String[] args) {
//         reevrse(32254);   
//     }
// }

// ******* SUM OF A NUMBER *********

// public class prac {
//     public static void main(String[] args) {
//         sumOfDigits(987);
//     }
//     public static void sumOfDigits(int number){
//         int sum = 0;
//         while (number > 0) {
//             int last_digit = number % 10;
//             sum = sum + last_digit;
//             number /= 10;
//         }
//         System.out.print("sum of the Number is:"+sum);
//     }
// }


// *************bionomial coefficient :    nCr =  n! / r! * (n-r)! **********


// public class prac {
//     public static int factorial(int num){
//         int fact = 1;
//         for(int i = 2; i<=num; i++){
//             fact = fact * i;
//         }
//         return fact;
//     }
//     public static void bionomial(int n1 , int r1){
         
//         int n = factorial(n1);
//         int r = factorial(r1);
//         int nmr = factorial(n1-r1);
//         if(n<r){
//             System.out.println("INvalid values");
//         }else{
//             int result = n/ (r * nmr);
//             System.out.println(result);
//         }   
//     }
//     public static void main(String[] args) {
//         bionomial(5,2);
//     }
// }

// ***********binary to decimal conversion **************

// public class prac {
//     public static void Bin_To_decimal(int number){
//         int dec = 0;
//         int pow = 0;
//         while (number > 0) {
//             int ld = number % 10;
//             dec = dec + (ld * (int)Math.pow(2, pow));

//             pow++;
//             number = number/10;
//         }
//         System.out.println("the Decimal number is :"+dec);
//     }
//     public static void main(String[] args) {
//         Bin_To_decimal(111);
//     }
// }

//  *************Decimal to binary conversion *************

// public class prac {
//     public static void decimal_To_Bin(int number){
//         int pow = 0;
//         int binary = 0;
//         while (number>0) {
//             int rem = number % 2;
//             binary = binary + (rem * (int)Math.pow(10, pow));

//             pow++;
//             number = number / 2;
//         }
//         System.out.println("bianary number is :"+binary);
//     }
//     public static void main(String[] args) {
//         decimal_To_Bin(9);
//     }
// }

// ********* math.functions **********

// public class prac {
//     public static void main(String[] args) {
        
//         System.out.println(Math.min(34,23));
//         System.out.println((int)Math.pow(5, 2));
//         System.out.println((int)Math.sqrt(25));
//         System.out.println(Math.abs(32));
//     }
// }
