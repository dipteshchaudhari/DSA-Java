public class compression {
    public static void main(String[] args) {
        String str = "aaaabbbccddd";
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
    public static String compression1(String str) {
        String newStr = "";

        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);

            if(count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static String compression2(String str) {
        // using stringBuilder

        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++) {
            int count = 1;
            
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if(count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
}