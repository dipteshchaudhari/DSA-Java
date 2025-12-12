//  pattern  1 :
//      *
//      * * 
//      * * *
//      * * * *

public class pattern1 {

    public static void main(String[] args) {
        
        for(int i=1; i<=4 ; i++){
            // number of lines : OUTER LOOP
            for(int line=1;line<=i;line++){
                // how many stars we want to print in line
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}