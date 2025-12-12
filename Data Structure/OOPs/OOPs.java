import java.lang.invoke.StringConcatFactory;

public class OOPs {
    public static void main(String[] args) {
        // pen p1 = new pen();
        
        //  p1.setColor("vadadi");
        //  System.out.println(p1.getColor());

        //  p1.setTip(45);
        //  System.out.println(p1.getTip());

        // // System.out.println(p1.color);
        // System.out.println(p1.getColor());
        
        // p1.setTip(5);
        // // System.out.println(p1.tip);
        // System.out.println(p1.getTip());


        // p1.color = "yellow";
        // System.out.println(p1.color);


        // Student s1 = new Student();
        // s1.calculatePercentage(10, 20, 0);
        // System.out.println(s1.percentage);


        // BankAccount acc1 = new BankAccount();
        // acc1.Username = "dipteshchaudhary";
        // // acc1.Password = "kamlesss";  // this will give us an error cuz of private class
        // acc1.setPassword("dipesh420");

        Student s1 = new Student("kamles");
        System.out.println(s1.name);


        Student s2 = new Student();

        Student s3 = new Student(34);

    }
}

class pen{
    private String color;
    private int tip;

    void setColor(String newColor){      
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

    String getColor(){
        return this.color; 
    }

    int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    Student(){
        System.out.println("constructor is called...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
}

// class BankAccount{
//     public String Username;
//     private String Password;

//     void setPassword(String pwd){
//         Password = pwd;
//     }
// }