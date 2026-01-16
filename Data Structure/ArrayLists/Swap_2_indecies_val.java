import java.util.ArrayDeque;
import java.util.ArrayList;

public class Swap_2_indecies_val {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        int ind1 = 1, ind2 = 3;
        SwapValues(l, ind1, ind2);
        System.out.println(l);
    }
    public static void SwapValues(ArrayList<Integer> l,int ind1, int ind2) {
        int temp = l.get(ind1);
        l.set(ind1, l.get(ind2));
        l.set(ind2, temp);
    }
}
