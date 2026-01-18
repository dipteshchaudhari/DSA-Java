import java.util.ArrayList;

public class pairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSumInRoatedSortedArr(list, target));
    }
    public static boolean pairSumInRoatedSortedArr(ArrayList<Integer> list,int target) {

        // finding breaking point :
        int n = list.size();
        int bp = -1;
          
        for(int i=0; i<n-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        
        // this case is extra if array is not rotated,, only sorted (simply ignore this in rotated sorted question)

        // if (bp == -1) {
        //     int l = 0, r = n - 1;
        //     while (l < r) {
        //         int sum = list.get(l) + list.get(r);
        //         if (sum == target) return true;
        //         else if (sum > target) r--;
        //         else l++;
        //     }
        //     return false;
        // }

        int low = bp + 1;
        int high = bp;
        
        while (low != high) { // <- condition
            
            int sum = list.get(low) + list.get(high);

            if(sum == target) {
                return true;
            }else if(sum > target) {
                high = (high-1+n)%  n;
            }else{
                low = (low+1) %n;
            }
        }
        return false;
    }
}   
