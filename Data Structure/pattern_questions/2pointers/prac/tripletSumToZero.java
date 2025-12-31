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
        
        System.out.println(l);
    }
}