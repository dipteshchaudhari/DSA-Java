public class two_sum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        int ans[] = two_sum(arr, target);
        printArr(ans);
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] two_sum(int arr[],int target){
        int low = 0;
        int high = arr.length - 1;

        while (high > low) {
            
            int sum = arr[high] + arr[low];

            if(sum == target) {
                return new int[]{low+1,high+1};

            }else if(sum > target){
                high--;
            }else{
                low++;
            }
        }
        return new int[]{-1,-1};
    }   
}
