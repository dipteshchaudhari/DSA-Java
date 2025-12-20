public class diagonal_sum {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}

            // {1,2,3},
            // {4,5,6},
            // {7,8,9}
        };
        System.out.println(diagonal_sum2(matrix));
    }
    // brute force : // O(N^2)
    public static int diagonal_sum(int matrix[][]) {    
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
                else if(i + j == matrix.length-1){      //else if required because of odd matrix form 
                    sum += matrix[i][j];                 
                }
            }
        }
        return sum;
    }
    // optimized : O(N)
    public static int diagonal_sum2(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            //primary diagonal
            sum += matrix[i][i];

            //secondary diagonal
            // i + j = matrix.length-1 --> j = matrix.length - 1 - i
            
            if(i != matrix.length -1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
}
