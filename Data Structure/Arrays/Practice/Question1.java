public class Question1 {
    public static void find_largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("largest Number is : "+largest);
        System.out.println("smallest Number is : "+smallest);

    }
    public static int find_minimum(int arr[]){
        int ans = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(ans>arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {342,52,233,333,42};
        // find_largest(arr);
       int result = find_minimum(arr);
       System.out.println("minimum number = "+result);
    }
}
