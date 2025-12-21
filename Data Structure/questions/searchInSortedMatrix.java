public class searchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 5;
        // searchInmatrix(matrix, target);
        // System.out.println(stairCaseSearch(matrix, target));
        System.out.println(stairCaseSearch2(matrix, target));
    }
    public static void searchInmatrix(int matrix[][],int target) {

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == target) {
                    System.out.print("("+i+","+j+")");
                }
            }
        }
    }
    public static boolean stairCaseSearch(int matrix[][],int target) {
        //starting from top rigth corner
        int r = 0;
        int c = matrix[0].length-1;

        while (c >= 0 && r < matrix.length) {
            
            if(matrix[r][c] == target) {
                System.out.println("target found at ("+r+","+c+")");
                return true;
            }else if (target > matrix[r][c]) {
                r++;
            }else {
                c--;
            }
        }
        System.out.println("naa malyo");
        return false;
    }
    public static boolean stairCaseSearch2(int matrix[][], int target) {
        // starting from bottom left corner
        int r = matrix.length-1;
        int c = 0;

        while (r >= 0 && c < matrix.length) {
            
            if(matrix[r][c] == target) {
                System.out.println("target found at ("+r+","+c+")");
                return true;
            }else if (target > matrix[r][c]) {
                c++;
            }else{
                r--;
            }
        }
        System.out.println("element not found");
        return false;
    }
}
