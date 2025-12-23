import java.util.ArrayList;

public class transposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // int ans[][]=transposee(arr);
        // System.out.println("Original matrix");
        // printArr(arr);
        // System.out.println("Transpose matrix");

        // printArr(ans);
        System.out.println(transpooose(arr));
    }
    public static void printArr(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transposee(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;

        int trans[][] = new int[col][row];      //dimenstions are swaped
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                trans[i][j] = arr[j][i];        // core logic 
            }
        }
        return trans;
    }
    public static ArrayList<ArrayList<Integer>> transpooose(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<row; i++) {
            ArrayList<Integer> l = new ArrayList<>();
            for(int j=0; j<col; j++) {
                l.add(arr[j][i]);
            }
            list.add(l);
        }
        return list;
    }
}
