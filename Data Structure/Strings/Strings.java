import java.util.Scanner;
import java.util.Set;

public class Strings{
    public static void print_chars(String name) {
        
        for(int i = 0 ; i <name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println( );
    }
    public static void subString(String str,int SI,int EI) {
        String subStr= "";
        for(int i = SI ; i < EI ; i++) {
            // subStr += str.charAt(i);
            System.out.print(str.charAt(i) + " ");
        }
        // return subStr;
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str ="abcd";
        // String str2 = new String("xyz");


        // //"Strings Are Immutable"
        // Scanner sc = new Scanner(System.in);

        // String name;
        // // name = sc.next();
        // name = sc.nextLine();
        // System.out.println(name);


        // length function : 

        // String name = "Tony Stark";
        // int l = name.length();
        // System.out.println(l);

        // concatenation
        // String firstName = "Diptesh";
        // String lastName = "chaudhary";
        // String fullName = firstName +" "+ lastName;

        // System.out.println(fullName);


        //finding character at perticular index chatAt() function :
        // String name = "Diptesh";
        // System.out.println(name.charAt(0));
        // print_chars(name);  


        //subString : 

        String str = "HelloWorld";
        // System.out.println(subString(str, 0, 5));
        // subString(str,0,5);

        System.out.println(str.substring(0,5));
    }
}