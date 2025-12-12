public class pattern6 {
    public static void main(String[] args) {

        // pattern6 : hollow rectangle 
        //    * * * * * * *         
        //    *           *
        //    *           *
        //    * * * * * * *         

            // int row = 4;
            // int column = 7;

            // for(int i=1;i<=row;i++){
            //     for(int j=1;j<=column;j++){
            //         if(i == 1 || i==row || j==1 || j==column){
            //             System.out.print("*");
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }



            // same code

            int n = 4;
            int m = 7;

            for(int row=1 ;row<=n;row++){
                for(int column=1;column<=m;column++){
                    if(row == 1 || row == n || column == 1 || column == m){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
}
