import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequent {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        int key = 2;
        System.out.println(MostFrequent(list, key));
    }
    public static int MostFrequent(ArrayList<Integer> list, int key) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) == key) {
                map.put(list.get(i+1), map.getOrDefault(list.get(i+1), 0)+1);
            }
        }

        int freq = Integer.MIN_VALUE;
        int ans = 0;
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > freq) {
                ans = entry.getKey();
                freq = entry.getValue();
            }
        }
        return ans;
    }
}
