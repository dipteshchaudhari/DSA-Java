import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class LonelyNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        System.out.println(LonelyNumbers(list));
        System.out.println(LonelyNumbers2(list));

    }
    public static ArrayList<Integer> LonelyNumbers(ArrayList<Integer> list) {

        Collections.sort(list);
        ArrayList<Integer> l = new ArrayList<>();

        // checking middle elements are lonely or not
        for(int i=1; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i-1)+1 && list.get(i)+1 < list.get(i+1)) {
                l.add(list.get(i));
            }
        }

        //if array has only one element
        if(list.size() == 1) {
            l.add(list.get(0));
        }

        if(list.size() > 1) {
            
            // checking for first element is lonely or not
            if(list.get(0)+1 < list.get(1)) {
                l.add(list.get(0));
            }

            // checking for last element is lonely or not
            if(list.get(list.size()-1) > list.get(list.size()-2) + 1) {
                l.add(list.get(list.size()-1));
            }
        }
        return l;
    }
    public static ArrayList<Integer> LonelyNumbers2(ArrayList<Integer> list) {

        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0; i<list.size(); i++) {
            m.put(list.get(i), m.getOrDefault(list.get(i), 0)+1);    
        }

        for(int i=0; i<list.size(); i++) {
            if(m.get(list.get(i)) == 1 && !m.containsKey(list.get(i) + 1) && !m.containsKey(list.get(i) - 1)) {
                l.add(list.get(i));
            }
        }
        return l;
    }
}   
