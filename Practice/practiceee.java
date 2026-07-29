public class practiceee {

    public static void main(String[] args) {
    
    // int n = 4;

    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=i; j++) {
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }
    
    
    // for(int i=1; i<=n; i++) {

    //     for(int space=0; space<=n-i+1; space++) {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // int row = 5;
    // int col = 5;

    // for(int i=1; i<=row; i++) {
    //     for(int j=1; j<=col; j++) {
    //         if(i == 1 || i == row || j == 1 || j == col) {
    //             System.out.print(" * ");
    //         }else{
    //             System.out.print("   ");
    //         }
    //     }
    //     System.out.println();
    // }


    // Converting Binary to decimal 

    int number = 101;
    int pow = 0;
    int dec = 0;
    while (number>0) {
        int ld = number % 10;

        dec = dec + (ld * (int)Math.pow(2, pow)); 
        pow++;
        number = number/10;
    } 
    System.out.println("decimal = "+dec);
    }
}