// class Student{
//     int roll;
//     String name;
//     static String Clg_name = "PIET";

//     static void show_college(){
//         System.out.println("college name is" + " " +Clg_name);
//     }
// }
public class static_keyword {
    // public static void main(String[] args) {
        
    //     // Student s1 = new Student();
    //     // System.out.println(Student.Clg_name);

    //     // System.out.println(s1.Clg_name);

    //     // Student.show_college();
    // }

    static {
        System.out.println("First");
    }
    static{
        System.out.println("Second");
    }

public static void main(String[] args) {
    System.out.println("Main method");          // for static method
}
}