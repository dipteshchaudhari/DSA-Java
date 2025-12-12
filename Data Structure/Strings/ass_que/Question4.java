package Assignment;

import java.util.Arrays;
import java.util.HashMap;

public class Question4 {
    public static boolean isAnagram(String str1,String str2) {
        
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);      
        Arrays.sort(arr2);          

        System.out.println(arr1);
        System.out.println(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static boolean isAnagram2(String str1,String str2) {
        if(str1.length() != str2.length()) {
            return false;
        } 
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        for(int i = 0 ; i < str1.length() ; i++) {
            m1.put(str1.charAt(i),m1.getOrDefault(str1.charAt(i),0)+1);
            m2.put(str2.charAt(i),m2.getOrDefault(str2.charAt(i),0)+1);
        }
        return m1.equals(m2);
    }
    public static boolean isAnagram3(String str1,String str2) {

        int count[] = new int[26];

        if(str1.length() != str2.length()) return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i=0 ; i<str1.length() ; i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for(int i =0 ; i<count.length ; i++) {
            if(count[i] != 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String Str1 = "care";
        String str2 = "racE";
        boolean result = isAnagram3(Str1, str2);
        
        if(result == true){
            System.out.println("enagram strings");
        }else{
            System.out.println("Not anagram strings");
        }
    }
}
