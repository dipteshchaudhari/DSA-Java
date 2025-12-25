public class CountVowels {
    public static void main(String[] args) {
        String s1 = "DhanJI";

        int count = 0;
        for(int i=0; i<s1.length(); i++) {
            if(isVowel(s1.charAt(i))){
                count++;
            }
        }
        System.out.println("there are "+count+" vowels in "+ s1);
    }
    public static boolean isVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U'){
            return true;
        } else{
            return false;
        }
    }

}
