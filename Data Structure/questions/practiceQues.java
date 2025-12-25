public class practiceQues {
    public static void main(String[] args) {
        // int[][] arr = { 
        //     {4,7,8},
        //     {8,8,7}
        // };
        // int num = 0;
        // for(int i=0; i<arr.length; i++) {
        //     for(int j=0; j<arr[0].length; j++) {
        //         if(arr[i][j] == 7){
        //             num++;
        //         }
        //     }
        // }
        // System.out.println("number of 7's = "+num);


        int[][] nums = { 
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        int sum = 0;
        // for(int i=0; i<nums.length; i++) {
        //     for(int j=0; j<nums[0].length; j++) {
        //         if(i == 1) {
        //             sum += nums[i][j];
        //         }
        //     }
        // }

        for(int j=0; j<nums[0].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("sum = "+sum);
    }
    
}
