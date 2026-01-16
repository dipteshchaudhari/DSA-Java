import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(4);
        l.add(3);
        l.add(7);
        l.add(2);
        l.add(1);

        System.out.println(l);

        // int max = Integer.MIN_VALUE;

        // for(int i=0;i <l.size(); i++) {
        //     if(max < l.get(i)){
        //         max = l.get(i);
        //     }
        // }
        // System.out.println("maximum element"+max);

        System.out.println(MaximumElement(l));
    }
    public static int MaximumElement(ArrayList<Integer> l){

        Integer max = Integer.MIN_VALUE;

        for(int i=0; i<l.size(); i++) {
            if(max < l.get(i)) {
                max = l.get(i);
            }
        }
        return max;
    } 
}
