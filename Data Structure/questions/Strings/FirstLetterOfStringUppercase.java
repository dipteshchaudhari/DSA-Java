public class FirstLetterOfStringUppercase {
    public static void main(String[] args) {
        String str = "hi My Name is diptesh";
        //O/P of " toUpperCaseString " : Hi, My Name Is Diptesh
        //O/P of(leetcode) " toUpperCaseString2 " hi, my Name is Diptesh
        // System.out.println(toUpperCaseString(str));
        System.out.println(toUpperCaseString2(str));

    }
    public static String toUpperCaseString(String str){

        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
    public static String toUpperCaseString2(String str){

        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<words.length; i++) {

            String w = words[i].toLowerCase();

            if(w.length() > 2) {
                w = Character.toUpperCase(w.charAt(0)) + w.substring(1);
            }

            sb.append(w);

            if(i < words.length - 1) {
                sb.append(" ");
            } 
        }
        return sb.toString();
    }
}
