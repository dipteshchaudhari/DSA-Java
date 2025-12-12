public class search_in_sorted_matrix {
    public static boolean Search_in_matric(int matrix[][] ,int target) {
        
        //1. Brute Force : 0(n^2)

        // for(int i = 0 ;i < matrix.length ; i++) {
        //     for(int j = 0 ; j < matrix[0].length ; j++) {
        //         if(matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // 2. Binary Search row wise :  0(n log n) = n time we apply binary search on each row 

         






        // 3. Stair case Search : [search in Soerted amtrix : most efficient method :]  
        // worst case : 0(n) 
         int r = 0;
         int c = matrix[0].length - 1;

         while ( r < matrix.length &&  c >= 0) {
            if((matrix[r][c] == target)) {
                System.out.println("Key found at index : (" + r + "," + c + ")");
                return true;
            }else if(target > matrix[r][c]) { 
                r++;
            }else{
                c--;
            }
         }
         System.out.println("key not found");
         return false;  
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int target = 50;

        System.out.println(Search_in_matric(matrix, target));
    }
}
