// https://leetcode.com/problems/fruit-into-baskets/

import java.util.HashMap;

public class fruitsIntoBasket {
    public static void main(String[] args) {
        int fruits[] = {0,1,2,2,2};
        System.out.println(totalFruits(fruits));

    }
    public static int totalFruits(int arr[]) {

        int n = arr.length;
        int low = 0;
        int res = -1 ;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int high=0; high<n; high++) {

            freq.put(arr[high],freq.getOrDefault(arr[high], 0) + 1 );

            while (freq.size() > 2) {
                freq.put(arr[low], freq.get(arr[low]) - 1);

                if(freq.get(arr[low]) == 0) {
                    freq.remove(arr[low]);
                }
                low++;
            }

            if(freq.size() == 2 || freq.size() < 2) {
                int len = high - low + 1;
                res = Math.max(res, len);
            }
        }
        return res;
    }
}
