// Optimized Solution (Boyer–Moore Voting Algorithm)
public class majority_element2 {
    public static void main(String[] args) {
        
        int nums[] = {2,2,1,1,1,2,2};
        int ans = majority_num(nums);
        System.out.println("majority element = "+ans);
    }
public static int majority_num(int nums[]) {
        int count = 0;
        int maj_element = 0;
        for (int num : nums) {
            if(count == 0) {
            maj_element = num;
            }
            if(maj_element == num) {
                count++;
            }else{
                count--;
            }
        }
        return maj_element;
    }
}


