// Given an array arr[] of distinct integers of size n and a value sum,
// the task is to find the count of triplets (i, j, k), 
// having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k])
// smaller than the given value sum.

// Input: n = 4, sum = 2, arr[] = {-2, 0, 1, 3}
// Output:  2
// Explanation: Below are triplets with sum less than 2 (-2, 0, 1) and (-2, 0, 3). 


// Input: n = 5, sum = 12, arr[] = {5, 1, 3, 4, 7}
// Output: 4
// Explanation: Below are triplets with sum less than 12 (1, 3, 4), (1, 3, 5), (1, 3, 7) and (1, 4, 5).

import java.util.Arrays;

public class TripletWIthSmallerSum {
    public static void main(String[] args) {
        long arr[] = {5, 1, 3, 4, 7};
        int sum = 12;
        int n = 5;

        System.out.println(countTriplets(n, sum, arr));
    }
    public static long countTriplets(int n, int sum, long arr[]) {
        
      Arrays.sort(arr);  
      long count = 0;
      for(int i=0; i<arr.length-2; i++) {
         
        int low = i+1;
        int high = arr.length - 1;
        
        long s = 0;
        
        while(high > low) {
            s = arr[i] + arr[low] + arr[high];
              
            if(s < sum) {
                count += (high - low);
                low++;
            }else{
                high--;
            }
        }
      }
      return count;
    }
}
