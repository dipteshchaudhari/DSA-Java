import java.util.ArrayList;

public class ContainerWithMostWater{
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
        System.out.println(storeWater2(height));

    }
    public static int storeWater(ArrayList<Integer> list) {

        // Brute Force :
        int maxWater = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {

                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int Water = height * width;

                if(Water > maxWater) {
                    maxWater = Water;
                }
            }
        }
        return maxWater;
    }
    public static int storeWater2(ArrayList<Integer> list) {

        // Optimize : (Two Pointer Approach)

        int maxWater = Integer.MIN_VALUE;

        int low = 0;
        int high = list.size()-1;

        while(high > low) {
            
            int width = high - low; 
            int height = Math.min(list.get(low), list.get(high));
            int Water = height * width;

            if(maxWater < Water) {
                maxWater = Water;
            }

            if(list.get(high) > list.get(low)) {
                low++;
            }else{
                high--;
            }
        }
        return maxWater;

    }
}