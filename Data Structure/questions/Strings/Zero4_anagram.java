import java.util.Arrays;
import java.util.HashMap;

public class Zero4_anagram {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        // anagram1(str1, str2);

        // if(anagram2(str1, str2)) {
        //     System.out.println("both are anagrams");
        // }else{
        //     System.out.println("not anagrams");
        // }

        if(anagram3(str1, str2)){
            System.out.println("anagrams");
        }else{
            System.out.println("naah not anagram of each other");
        }
    }
    public static void anagram1(String str1,String str2) {
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int str1_len = str1.length();
        int str2_len = str2.length();

        if(str1_len == str2_len) {
            
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            if(Arrays.equals(charArr1,charArr2)){
                System.out.println("both are anagrams");
            }else{
                System.out.println("not anagrams");
            }
            
        } else {
            System.out.println("not-Anagrams");
        }
    }
    public static boolean anagram2(String str1,String str2) {
        //optimized
        int arr[] = new int[26];

        int n1 = str1.length();
        int n2 = str2.length();

        if(n1 != n2){
            return false;
        }

        for(int i=0; i<n1; i++) {
            arr[str1.charAt(i) - 'a']++;
            arr[str2.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++) {
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static boolean anagram3(String str1,String str2) {
        // HashMap : using hashmap we are solving this

        if(str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            m1.put(str1.charAt(i), m1.getOrDefault(str1.charAt(i), 0) + 1);
            m2.put(str2.charAt(i), m2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        if(m1.equals(m2)){
            return true;
        }else {
            return false;
        }


    }
}


