// BINARY TO DECIMAL NUMBER :

import java.util.Scanner;

public class binToDec {

    public static void binary_to_decimal(int binNum){
        int pow= 0;
        int myNum= binNum;
        int decNum = 0;
        while(binNum > 0){
            int ld = binNum % 10 ;
            decNum = decNum +(ld * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("binary to decimal of "+myNum+" is: "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Binary Number:");
        int b =sc.nextInt();
        binary_to_decimal(b);
    }
}
