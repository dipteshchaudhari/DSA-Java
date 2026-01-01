import java.util.Arrays;
import java.util.*;
public class threeSumClosest {
    public static void main(String[] args) {
        int arr[] = {-1,2,1,-4};
        // int arr[] = {0,0,0,0};
        int target = 1;

        System.out.println(threesumClosest(arr, target));
    }
    public static int threesumClosest(int arr[],int target){
        Arrays.sort(arr);

        int min_diff = Integer.MAX_VALUE;        
        int diff = 0;
        int closestSum = 0;

        for(int i=0; i<arr.length-2; i++) {
            int low = i+1;
            int high = arr.length - 1;


            while(low < high) {
                int sum = arr[i] + arr[low] + arr[high];
                diff = Math.abs(sum-target);

                
                    
                    if(diff < min_diff) {
                        min_diff = diff;
                        closestSum = sum;
                    }
                    
                    if(sum == target) {
                        return sum;
                    }else if(sum > target) {
                        high--;
                    }else{
                        low++;
                    }
                }                
            }   
            return closestSum;
        }
}

