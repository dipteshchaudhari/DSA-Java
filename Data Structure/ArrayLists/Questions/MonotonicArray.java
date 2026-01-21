import java.util.ArrayList;

public class MonotonicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(MonotonicArray(list));
        
        int arr[] = {1,2,2,3};
        System.out.println(MonotonicArray2(arr));
        System.out.println(monotonic(list));
    }
    public static boolean MonotonicArray(ArrayList<Integer> list) {
        
        boolean inc = true;
        boolean des = true;

        for(int i=0; i<list.size()-1; i++) {
            
            if(list.get(i) > list.get(i+1)) {
                inc = false;
            }
            if(list.get(i) < list.get(i+1)) {
                des = false;
            }
        }
        return inc || des;
    }
    public static boolean MonotonicArray2(int nums[]) {
        
        int n = nums.length;
        if (nums[0] < nums[n - 1]) {
            for (int i = 1; i < n; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < n; i++) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean monotonic(ArrayList<Integer> list) {

        int n = list.size();
        
        if(list.get(0) < list.get(n-1)) {
            
            for(int i=1; i<n-1; i++) {
                if(list.get(i) > list.get(i+1)) {
                    return false;
                }
            }
        }else {
            for(int i=1; i<n-1; i++) {
                if(list.get(i) < list.get(i+1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
