import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        
        // char[] arr = {'a','b','c','d'};
        // String str = "diptesh Chaudhary";
        // String strr = new String("hello");

        // String s;
        // System.out.println("enter a String:");
        // Scanner sc = new Scanner(System.in);
        // // s = sc.next();
        // s = sc.nextLine();
        // System.out.println(s);
        // System.out.println("length :"+s.length());

        // String s1 = "diptesh";
        // String s2 = "chaudhary";

        // System.out.println(s1+" "+s2);


        // String strr = "hello moto";
        // System.out.println(strr.charAt(0));

        // for(int i=0; i<strr.length(); i++) {
        //     System.out.print(strr.charAt(i));
        // }

        String name = "mynameisdip";
        int SI = 8;
        int EI = 11;
        String ans = substring(name, SI, EI);
        System.out.println(ans);

        System.out.println(name.substring(SI, EI));
    } 
    public static String substring(String name,int SI,int EI) {

        // 1.
        // for(int i=SI; i<EI; i++) {
        //     System.out.print(name.charAt(i)+" ");
        // }

        // 2.
        String sub_str = "";

        for(int i=SI; i<EI; i++) {
            sub_str += name.charAt(i);
        }
        return sub_str;
    }
}
