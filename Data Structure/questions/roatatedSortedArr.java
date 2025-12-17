public class roatatedSortedArr {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 2;
        int ans = find_element(nums, target);

        if(ans == -1) {
            System.out.println("element not found!!");
        }else{
            System.out.println("element found at index :"+ans);
        }
    }
    public static int find_element(int nums[],int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = low + (high - low) /2;

            if(target == nums[mid]) {
                return mid;
            }
            else if(nums[low] <= nums[mid]) {

                if(target >= nums[low] && target <= nums[mid]) {
                    high = mid;
                }else{
                    low = mid + 1;
                }
            } else {

                if(target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                }else{
                    high = mid;
                }
            }
        }
        return -1;
    }
}
