import java.util.ArrayList;

public class Arraylist_intro{
    public static void main(String[] args) {
        //Syntax:
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add elements : tc : O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,420);
        System.out.println(list);

        // get elements  tc: O(1)

        int element = list.get(2);
        System.out.println(element);

        // remove elements tc : o(n)

        list.remove(1); 
        System.out.println(list);

        // set element at index   O(n)

        list.set(2, 999);
        System.out.println(list);

        System.out.println(list.contains(999));

        
        // for(int i=0; i<list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        //print reverse of an Arraylist :
        
        System.out.println(list);
        for(int i = list.size()-1; i>= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}