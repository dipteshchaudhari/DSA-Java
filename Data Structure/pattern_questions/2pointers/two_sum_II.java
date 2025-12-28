import java.util.HashMap;

public class two_sum_II{
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        // int[] r = approach1(arr, target);
        // int[] r = approach3(arr, target);
        // System.out.println(r[0] + " " + r[1]);

        int[] r = approach3(arr, target);
        System.out.println(r[0]+" "+r[1]);
    }

    // brute force 

    public static int[] approach1(int arr[],int target) {

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // better Using HashMap :
    
    public static int[] approach2(int arr[],int target) {

        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            
            int element = target - arr[i];

            if(m.containsKey(element)) {
                return new int[]{m.get(element) + 1,i + 1};
            }

            m.put(arr[i], i);
           
        }
        return new int[]{-1,-1};
    }

    // optimized Using Two Pointers

    public static int[] approach3(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {

        int sum = arr[start] + arr[end];

        if (sum == target) {
            return new int[]{start + 1, end + 1};
        } 
        else if (sum > target) {
            end--;
        } 
        else {
            start++;
        }
    }
    return new int[]{-1, -1};
}

}