import java.util.ArrayList;
import java.util.Collections;

public class sortingInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(9);
        l.add(3);
        l.add(6);
        l.add(2);

        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        Collections.sort(l,Collections.reverseOrder());
        // comparator - fnx - logic
        System.out.println(l);
    }
}
