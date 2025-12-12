import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class que3_3sum {

    public static List<List<Integer>> print_3sum(int nums[]){
        int n = nums.length;
        int sum = 0;

        // we need to first sort the array 
        Arrays.sort(nums);    
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();



        for(int i = 0 ; i < n - 2 ; i++){
            for(int j = i + 1 ; j < n - 1 ; j++){
                for(int k = j + 1 ; k < n ; k++){
                    
                    if(nums[i] + nums[j] + nums[k] == 0){
                        s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
    public static List<List<Integer>> threeSum(int nums[]){
        int n = nums.length;
        int sum = 0;

        // we need to first sort the array 
        Arrays.sort(nums);    
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();



        for(int i = 0 ; i < n - 2 ; i++){
            int low = i + 1;
            int high =  n - 1 ;

            while (low < high) {
                sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0){
                    s.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                }else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }   
}
