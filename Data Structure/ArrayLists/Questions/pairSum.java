import java.lang.reflect.Array;
import java.util.ArrayList;

public class pairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();    
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target = 5;

        System.out.println(PairSum1(list,target));
        System.out.println(pairSum2(list, target));

    }
    public static ArrayList<Integer> PairSum1(ArrayList<Integer> list, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {

                if(list.get(i) + list.get(j) == target) {
                    ans.add(i,j);
                }
            }
        }
        return ans;
    }
    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int low = 0;
        int high = list.size() - 1;
        int sum = 0;
        while (high > low) {        // high != low
            sum = list.get(low) + list.get(high);
            
            if(sum == target) {
            return true;
            }
            else if(sum > target) {
                high--;
            }else{
                low++;
            }
        }
        return false;
    }
}
