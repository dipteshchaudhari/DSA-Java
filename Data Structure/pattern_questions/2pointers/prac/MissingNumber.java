public class MissingNumber {
    public static void main(String[] args) {
        // int arr[] = {3,0,1};
        int arr[] = {0,1,2,3,5,6};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int nums[]) {
        int n = nums.length;
        int total = n*(n+1)/2;
        int element = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
        element = total - sum;
        return element;
    }
}
