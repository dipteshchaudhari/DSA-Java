import java.util.*;
// Time Coplexity : O(n^3)

public class three_sum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum_opt_prc(arr));
    }
    public static List<List<Integer>> threeSum(int arr[]) {
        int sum = 0;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();

        int n = arr.length;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum == 0) {
                        s.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }
        ans.addAll(s);
        return ans;
    }

    public static List<List<Integer>> threeSum_opt(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);  // sort the array
        int sum = 0;
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> list  =new ArrayList<>(); 

        for(int i=0; i<n-2; i++) {
            int low = i+1;
            int high = n-1;

            while (low < high) {
                sum = arr[i] + arr[low] + arr[high];
                if(sum == 0) {
                    s.add(Arrays.asList(arr[i],arr[low],arr[high]));
                    low++;
                    high--;
                } else if(sum < 0) {
                    low++;
                }else {
                    high--;
                }
            }
        }
        list.addAll(s);
        return list;
    }

    public static List<List<Integer>> threeSum_opt_2(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // Early stop: smallest number already > 0
            if (nums[i] > 0) break;

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate second & third elements
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    left++;    // need a larger value
                } else {
                    right--;   // need a smaller value
                }
            }
        }
        return result;
    } 
    public static List<List<Integer>> threeSum_opt_prc(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++) {

            if(nums[i] > 0) {
                break;
            }

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0) {
                    list.add(Arrays.asList(nums[i],nums[low],nums[high]));

                    low++;
                    high--;

                    while (low < high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    while ((low < high && nums[high] == nums[high+1])) {
                        high--;
                    }
                } else if(sum < 0) {    
                    low++;
                } else {
                    high--;
                }
            }
        }
        return list;
    } 

}
