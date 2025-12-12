public class practice {
    public static void main(String[] args) {
        
        //     *
        //    * *
        //   * * *
        //  * * * *
        // int n = 4;

        // for(int line=1;line<=n;line++){
        //     for(int space=1;space<=n-line;space++){
        //         System.out.print(" ");
        //     }
        //     for(int star=1;star<=line;star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 4;

        // for(int line=1;line<=n;line++){
        //     for(int space=1;space<=n-line;space++){
        //         System.out.print(" ");
        //     }
        //     for(int star=1;star<=line;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int row = 4 ;
        // int column = 7;

        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=column;j++){

        //         if(i == 1 || i == row || j == 1 || j == column){
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
