import java.util.Scanner;
public class loops{
    public static void main(String[] args) {

    // int n = 1;
    // while(n <= 10){
    //     System.out.println(n + "\n");
    //     n += 1;
    // }

    // System.out.println("enter any number");
    // Scanner sc=new Scanner(System.in);
    // int input =sc.nextInt();
    // int n = 1;
    // while(n <= input){
    //     System.out.println(n + "\n");
    //     n += 1;

    // System.out.println("enter any number");
    // Scanner sc=new Scanner(System.in);
    // int input =sc.nextInt();
    // int n= 1;
    // int sum = 0;

    // while (n <= input) {
    //     sum = sum + n;
    //     n += 1;
    // }
    // System.out.println("total sum :"+sum );
    //
    
    // for(int i=1;i<=4;i++){
    //     System.out.println("*  *  *  *  ");
    // }


    // #reverse of given number

    // int number = 8493;
    
    // while(number > 0){
    //     int lastdigit = number % 10;    //divide by 10 , so the remainder'll be the last digit
    //     System.out.print(lastdigit);
    //     number = number / 10;           //for removing the last digit 
    // }


    // reverse of given number n storing into variable

    // int number = 109999;
    // int rev = 0 ;

    // while (number > 0) {
    //     int lastdigit = number % 10 ;
    //     rev = (rev * 10) + lastdigit ;
    //     number = number/10; 
    // }
    // System.out.print(rev);

//    for(int i=1; i<=100;i++){
//     if(i == 33){
//         continue; //break;
//     }
//     System.out.println(i);
//    }


        //  you enter number and simply print that number but if that number is in 10th tablr brak it
        
        
        // Scanner sc=new Scanner(System.in);
        
        // do{
        //     System.out.print("Enter your Number: ");
        //     int n =sc.nextInt();
        //     if(n %10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);
        // System.out.println("you break the loop");

        //que : display all number entered by the user except multiple of 10

        // Scanner sc = new Scanner(System.in);
        

        // do{
        //     System.out.println("enter number:");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println(n);
        // }while(true);

        // Check if Number is Prime or Not 
        
        
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("ENTER ANY NUMBER");
    //     int number = sc.nextInt();
    //     Boolean isPrime = true;
    //     if(number == 2){
    //         System.out.println("Number is Prime");
    //     }else{
    //         for(int i=2;i<=number-1;i++){
    //         if(number % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     if(isPrime){
    //     System.out.println("prime number");
    //     }else{
    //     System.out.println("not a prime number");
    //   }
    //     }



        // *****************ASSIGNMENT QUESTIONS*****************


    // QUE 1 : 2 times 


    // QUE 2 : Write a program that reads a set of integers 
    // and the n prints the sum of the even and odd integers


    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter number that many times loops runs: ");
    // int n = sc.nextInt();
    // int evensum= 0;
    // int oddsum= 0;
    // for(int i=1;i<=n;i++){
    //     System.out.println("Enter Number: ");
    //     int number =sc.nextInt();

    //     if(number % 2 ==0){
    //         evensum = number + evensum;
    //     }else{
    //         oddsum = number + evensum;
    //     }
    // }
    // System.out.println("sum of even numbers is :" + evensum);
    // System.out.println("sum of odd number is :" +oddsum);
    // }
    
    // with do while loop
        
        // Scanner sc =new Scanner(System.in);
        // int evensum = 0;
        // int oddsum = 0;
        // int choice;
        // do{
        //     System.out.println("enter numebr:");
        //     int no =sc.nextInt();

        //     if(no % 2 == 0){
        //         evensum += no;
        //     }else{
        //         oddsum += no;
        //     }
            
        //     System.out.println("enter 1 for continue and enter 0 for not continueing !");
        //     choice =sc.nextInt(); 

        // }while(choice == 1);

        // System.out.println("sum of even numbebs is:"+evensum);
        // System.out.println("sum of odd numbers is:"+oddsum);


    // QUE 4 : MULTIPLICATION TABLE OF ANY NUMEBR

        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter number (table)");
        // int number = sc.nextInt();

        // System.out.println("table of "+number + " is :");
        // for(int i=1;i<=10;i++){
        //     System.out.println(number +"X"+ i + "=" + number*i) ;
        // }

    // Que 3 : factorial of given number :

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter any number:");
        // int number = sc.nextInt();
        // int fact= 1;
        // if(number == 0 || number ==1){
        //     // System.out.println("factoail is : 1");
        //     fact = 1;
        // }else{
        //     for(int i = 2; i<=number;i++){
        //     fact =fact * i;
        // }
        // System.out.println("factorial of given number is:"+fact);
        // }
        

        //********* SUM OF DIGITS  ***********

        int number = 555555;
        int sum = 0;

        while(number != 0){
            sum = sum + (number%10);
            number = number/10; 
        }
        System.out.println(sum);
    }
}
