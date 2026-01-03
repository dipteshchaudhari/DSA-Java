import java.nio.charset.MalformedInputException;
import java.util.Arrays;

public class three_sum_closest {
    public static void main(String[] args) {
        int arr[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr, target));
    }
    public static int threeSumClosest(int arr[],int target){
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        int ClosestSum = 0;
        for(int i=0; i<arr.length-2; i++) {

            int diff = 0;
            int low = i+1;
            int high = arr.length - 1;

            while (low < high) {
                int sum = arr[i] + arr[low] + arr[high];

                diff = Math.abs(sum - target);

                if(min_diff > diff){
                    min_diff = diff;
                    ClosestSum = sum;
                }

                if(sum == target){
                    return sum;
                }else if(sum > target){
                    high--;
                }else{
                    low++;
                }

            }
        }
        return ClosestSum;
    }
}
