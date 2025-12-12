public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='a' ; ch <='z' ;ch++) {
            sb.append(ch);
        }
        // 0(26)
        // in String case : 0(26 * n^2)
        System.out.print(sb);

        
    }
}
