import java.util.ArrayList;
import java.util.Arrays;

public class getMinMav{
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3};
        System.out.println(getMinMax2(arr));
    }
    public static ArrayList<Integer> getMinMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(arr[0]);
        res.add(arr[n-1]);
        
        return res;
    }
    public static ArrayList<Integer> getMinMax2(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {            
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        
        list.add(min);
        list.add(max);

        return list;
    }
}