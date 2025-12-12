public class assignment {

    // Question 1: Print the number of 7’s that are inthe 2d array.
    public static int print_accurance(int arr[][] , int key) {
        int times = 0;
        for(int i = 0 ;i < arr.length ; i++) {
            for(int j = 0; j < arr[0].length ; j++) {
                if(key == arr[i][j]) {
                    times ++;
                }
            }
        }
        return times;
    }

    // Question 2 : Print out the sum of the numbers inthe second row of the “nums” array.
    public static int sum_Of_Row(int nums[][] , int row) {
        int sum=0;
        for(int j = 0 ; j < nums[0].length ; j++) {
            sum += nums[row][j];
        }
        return sum;
    }
    public static void transpose_of_matrix(int mat[][]) {
        
        for(int r = 0 ; r < mat.length -1 ; r++ ) {
            for(int c = r + 1 ; c < mat[0]. length ; c++) {
                int temp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = temp;
            }
        }

        for(int i = 0 ; i < mat.length ; i ++) {
            for(int j = 0 ; j < mat[0].length ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        // Que 1 :
        // int[][] arr = { 
        //     {4,7,8},
        //     {8,8,7} 
        //    };
        // int key = 7;

        // System.out.println(print_accurance(arr, key));

        // Que 2 :

        // int[][] nums = { 
        //     {1,4,9},
        //     {11,4,3},
        //     {2,2,3}
        // };

        // int row = 2 ;

        // System.out.println(sum_Of_Row(nums, row));

        int[][] mat = { 
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        transpose_of_matrix(mat);

    }
}
