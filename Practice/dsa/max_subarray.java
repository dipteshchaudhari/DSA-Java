public class max_subarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-4,5};
        // System.out.println(max_subarray_sum(arr));
        // System.out.println(max_subarray_sum2(arr));
        // System.out.println(max_subarray_sum3(arr));
        System.out.println(max_subarray_kadanes(arr));
    }
    public static int max_subarray_sum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int sum=0;
                for(int k=i; k<=j; k++) {
                    sum = sum + arr[k];
                }
                if(maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static int max_subarray_sum2(int arr[]) {

        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<prefix.length; i++) {
            for(int j=i; j<prefix.length; j++) {
                int sum = i == 0? prefix[j] : prefix[i-1];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static int max_subarray_sum3(int arr[]) {
        
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        return max;        
    }
    // more optimized kadane's algo :

    public static int max_subarray_kadanes(int arr[]) {
        int curr_sum = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            curr_sum = curr_sum + arr[i];
            curr_sum = Math.max(curr_sum, arr[i]);

            max = Math.max(max, curr_sum);
        }
        return max;
    }
}
