public class minSizeSubArrSum {
    public static void main(String[] args) {
        // int arr[] = {2,3,1,2,4,3};
        int arr[] = {1,4,4};
        int target = 7;
        System.out.println(MinSubArrLength(arr, target));
    }   
    public static int MinSubArrLength(int arr[],int target) {
        int low = 0;
        int high = 0;
        int sum = 0;

        int res = Integer.MAX_VALUE;    

        while (high < arr.length) {
            sum = sum + arr[high];

            while (sum >= target) {
                int curr_len = high - low + 1;
                res = Math.min(res, curr_len);

                sum = sum - arr[low];
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
