import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class tripletSumToZero{
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        Arrays.sort(arr);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> l = new ArrayList<>();

        for(int i=0; i< arr.length - 2; i++) {
            for(int j = i+1; j<arr.length - 1; j++) {
                for(int k = j+1; k<arr.length; k++) {    
                    if(arr[i] + arr[j] + arr[k] == 0){
                        set.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }
        l.addAll(set);
        
        // System.out.println(l);

        System.out.println(tripletSum(arr));

        System.out.println(tripletSum2(arr));

    }
    public static List<List<Integer>> tripletSum(int arr[]) {
        Arrays.sort(arr);

        HashSet<List<Integer>> s = new HashSet<>();
        List<List<Integer>> l = new ArrayList<>();

        for(int i=0; i<arr.length-2; i++) {
            int start = i+1;
            int end = arr.length - 1;

            int sum = 0;
            while (start < end) {
                
                sum = arr[i] + arr[start] + arr[end];

                if(sum == 0) {
                    s.add(Arrays.asList(arr[i],arr[start],arr[end]));
                    start++;
                    end--;            
                }else if(sum > 0) {
                    end--;
                }else{
                    start++;
                }
            }
        }
        l.addAll(s);
        return l;
    }
    public static List<List<Integer>> tripletSum2(int arr[]) {
        
        Arrays.sort(arr);
        List<List<Integer>> l = new ArrayList<>();

        for(int i=0; i<arr.length-2; i++) {
            int low = i+1;
            int high = arr.length-1;

            if(arr[i] > 0) {break;}
            
            if(i > 0 && arr[i] == arr[i-1]) {
                continue;
            }
            while (high > low) {
                
                int sum = arr[i] + arr[high] + arr[low];

                if(sum == 0) {
                    l.add(Arrays.asList(arr[i],arr[high],arr[low]));
                    low++;
                    high--;

                    while(high > low && arr[low] == arr[low-1]) { low++; }
                    while(high > low && arr[high] == arr[high+1]) {high--;}
                }else if(sum > 0) {
                    high--;
                }else{
                    low++;
                }
            }
        }
        return l;
    }
}