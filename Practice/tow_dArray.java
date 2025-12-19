import java.util.Scanner;

public class tow_dArray {
    public static void main(String[] args) {
        int martix[][] = new int[3][3];
        int n = 3; //(martix.length)
        int m = 3; //(matrix[0].length)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elemetns in Array:");
        for(int i=0; i<martix.length; i++) {
            for(int j=0; j<martix[0].length; j++) {
                martix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<martix.length; i++) {
            for(int j=0; j<martix[0].length; j++) {
                System.out.print(martix[i][j] + " ");
            }
            System.out.println();
        }

        int target = 9;
        boolean ans = searching(martix, target);
        if(ans) {
            System.out.println("element exists");
        }else{
            System.out.println("element not found");
        }
    }
    public static boolean searching(int martix[][],int target) {

        for(int i=0; i<martix.length; i++) {
            for(int j=0; j<martix[0].length; j++) {
                if(martix[i][j] == target){
                    System.out.println("element found at "+"{"+i+","+j+"}");
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
}
