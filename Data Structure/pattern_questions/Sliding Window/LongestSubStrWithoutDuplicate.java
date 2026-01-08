// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;

public class LongestSubStrWithoutDuplicate {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(longestSubStr(s));
    }
    public static int longestSubStr(String str) {
        int low = 0;
        int n =  str.length();
        int res = -1;

        HashMap<Character,Integer> freq = new HashMap<>();

        for(int high=0; high<n; high++) {

            char c = str.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            int k = high - low + 1;
            while (freq.size() < k) {
                
                char leftchar = str.charAt(low);
                freq.put(leftchar, freq.get(leftchar) - 1);

                if(freq.get(leftchar) == 0) {
                    freq.remove(leftchar);
                }
                low++;
                k = high - low + 1;
            }
            if(freq.size() == k) {
                int len = high - low + 1;
                res = Math.max(len, res);
            }
        }
        return res;
    } 

}
