import java.util.ArrayList;

public class transpose {
    public static void main(String[] args) {
        int arr[][] = {
            {2,4,-1},
            {-10,5,11},
            {18,-7,6}
        };
        // System.out.println(transpose2(arr));
        int[][] ans = transpose3(arr);
        printArr(ans);
    }
    public static void transpose(int arr[][]) {

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void printArr(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }



    // store the elements into the List of List (Leetcode)
    public static ArrayList<ArrayList<Integer>> transpose2(int arr[][]) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int r = arr.length;
        int c = arr[0].length;

        for(int i=0; i<c; i++) {
            ArrayList<Integer> l = new ArrayList<>();
            for(int j=0; j<r; j++) {
                l.add(arr[j][i]);
            }
            list.add(l);
        }
        return list;
    }

    public static int[][] transpose3(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        int arr[][] = new int[col][row];
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                arr[i][j] = matrix[j][i];   
            }
        }
        return arr;
    }
}



