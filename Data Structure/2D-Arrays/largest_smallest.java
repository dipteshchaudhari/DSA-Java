import java.util.Scanner;

public class largest_smallest {
    public static void largest_n_minimum(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < matrix.length ; i++) {
            for(int j = 0 ; j < matrix[0].length ; j++) {
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                // largest = Math.max(largest,matrix[i][j]);
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("largest element is="+largest);
        System.out.println("minimum element is="+min);

        
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("enter array elements : ");
        for(int i = 0 ; i < n ; i++) { 
            for(int j = 0 ; j < m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        largest_n_minimum(matrix);
    }
}
