import java.util.Scanner;
class ClassExcersice{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int digits[] = new int[4];

        System.out.println("take input of 4 digits:");
        for(int i=0; i < 4; i++) {
            digits[i] = sc.nextInt();
        }

        
        int result = findLetestTime(digits);

        printTime(result);

    }

    public static int findLetestTime(int[] digits) {

        int highest = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == j) continue;
                for(int k = 0; k < 4; k++) {
                    if(k == i || k == j) continue;
                    for(int l = 0; l < 4; l++) {
                        
                        if(l == i || l == j || l == k) continue;

                        int HH = digits[i] * 10 + digits[j];
                        int MM = digits[k] * 10 + digits[l];
                        
                        if(HH <= 23 && MM <= 59) {
                            int Time = HH * 100 + MM;

                            if(Time > highest) {
                                highest = Time;
                            }
                        }
                    }
                }
            }
        }
            return highest;
        
    }

    public static void printTime(int result){

        int HH = result  / 100;
        int MM = result  % 100;
        
        if(result < 0) {
            System.out.println("no valid time");
        }else{
            // System.out.println(HH + ":" + MM);
            System.out.printf("%02d:%02d",HH,MM);
        }
        
    }
}