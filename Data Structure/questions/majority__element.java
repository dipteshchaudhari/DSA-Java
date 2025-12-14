// Brute Force Approach 
public class majority__element{
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<n; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n/2) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int nums[] = {2,2,1,1,1,2,2};
        int nums[] = {3,2,3};
        int ans = majorityElement(nums);
        System.out.println("Answer is = "+ans);
    }
}
// Time Complexity : O(n^2)

