import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(arr, target);
        printArr(ans);
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] twoSum(int arr[],int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {

            int element = target - arr[i];

            if(map.containsKey(element)){
                return new int[]{map.get(element),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
