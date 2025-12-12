// pattern 2

//      *
//      * *
//      * * *
//      * * * *
//      * * * * *


public class pattern2 {
    public static void main(String[] args) {
        int n= 4;

        for(int line=1;line<=n;line++){
            //number of lines (Same)
            for(int star=1;star<=(n-line+1);star++){
                // star -> (n-i+1) times we need to print star
                System.out.print(" * ");
            }
            System.out.println();
        }
    }    
}
