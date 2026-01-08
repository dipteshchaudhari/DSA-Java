// https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

// Input: s = "aabacbebebe", k = 3
// Output: 7
// Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", 
// which includes 'c', 'b', and 'e'.

import java.util.HashMap;

public class m_longestSubStrWithKuniques {
    public static void main(String[] args) {
        // String str = "aabacbebebe";
        // int k = 3;

        String str = "aaaa";
        int k = 2;
        
        System.out.println(LongestSubStrWkUniques(str, k));
    }
    public static int LongestSubStrWkUniques(String s,int k){

        int n = s.length();
        int low = 0;
        int res = -1;
        HashMap<Character,Integer> freq = new HashMap<>();

        for(int high=0; high<n; high++) {

            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0)+1);

            while (freq.size() > k) {
                char leftchar = s.charAt(low);
                freq.put(leftchar, freq.get(leftchar)-1);
                
                if(freq.get(leftchar) == 0) {
                    freq.remove(leftchar);
                }
                low++;
            }
            if(freq.size() == k) {
                int len = high - low + 1;
                res = Math.max(res, len);
            }   
        }
        return res;
    }
}
