public class stringbuffer_example {
    public static void main(String[] args) {
         StringBuffer sb = new StringBuffer("Hello");
         sb.append(" world");
         sb.insert(5, " java");
         sb.delete(5, 10);
         sb.reverse();
         System.out.println(sb);

    }
}
