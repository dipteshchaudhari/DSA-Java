import java.util.ArrayList;
import java.util.List;

public class spiralMartix {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.print(spiralPrint(matrix));
    }
    public static ArrayList<Integer> spiralPrint(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix[0].length-1;
        int endCol = matrix.length-1;

        ArrayList<Integer> l = new ArrayList<>();

        while(startRow <= endRow && startCol <= endCol) {
            // printing top 
            for(int i=startCol; i<=endCol; i++) {
                // System.out.print(matrix[startRow][i] + " ");
                l.add(matrix[startRow][i]);
            }
            //printing right
            for(int i=startRow+1; i<=endRow; i++) {
                // System.out.print(matrix[i][endCol] + " ");
                l.add(matrix[i][endCol]);
            }
            //prining bottom
            for(int i=endCol-1; i>=startCol; i--) {
                if(startRow == endRow) {
                    break;
                }
                // System.out.print(matrix[endRow][i] + " ");
                l.add(matrix[endRow][i]);
            }
            //printing left side
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                // System.out.print(matrix[i][startCol] + " ");
                l.add(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return l;
    }
}
