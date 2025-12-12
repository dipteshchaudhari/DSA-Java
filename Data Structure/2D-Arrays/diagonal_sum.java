public class diagonal_sum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // 1> Brute Force :

        //Primary Diagonal where i and j are equal 
        // and for secondray sum when i + j == n - 1 that time we calculate the sum 
        // for(int i = 0 ;i < matrix.length ; i++) {       // TC = 0(n^2)
        //     for(int j = 0 ; j < matrix[0].length ; j++) {
        //         if(i == j) {
        //             sum = sum + matrix[i][j];
        //         }
        //         else if(i + j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }


        // 2> Optimizezd :

        for(int i = 0 ; i < matrix.length ; i++) {

            //Primary diagonal :
            sum += matrix[i][i];

            //Secondary Diagonal:       here , j = matrix.length - 1 - i ;
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }



        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(diagonalSum(matrix));
    }
}