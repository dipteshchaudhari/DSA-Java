public class que2 {
    public static int search(int nums[],int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while (high >= low) {
            int mid = (low + high)/2;
            
            // if target found at mid : 
            if(nums[mid] == target){
                return mid;
            }
            // check if the left half is sorted :
            else if (nums[mid] >= nums[low]) {
                //if target is in a left half :
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid;
                }else{
                    low = mid + 1;
                }
                // right half is sored
            }else{
                // if target is in a right half
                if(target >= nums[mid+1] && target <= nums[high]){
                    low = mid + 1;  
                }else{
                    high = mid;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int nums[] = {1};
        int target = 0;
        int result = search(nums, target);
        System.out.println("your element is present in array at :"+result);
    }
}
