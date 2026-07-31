// javac Encapsulation/examples.java
// java Encapsulation/examples

package Encapsulation;

class Studenttt{
    private int roll_number;
    private String name;
    private int marks;

    //getter and setter for roll number :

    public void setRoll(int roll_number) {
        this.roll_number = roll_number;
    }
    public int getRoll() {
        return roll_number;
    }
    // getter and setter for name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // getter and setter for marks
    public void setMarks(int marks) {
        
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }
    public int getMarks() {
        return marks;
    }
    
}
public class examples {
    public static void main(String[] args) {
        Studenttt s1 = new Studenttt();

        s1.setRoll(110);
        System.out.println("Roll Number of the Student :"+ s1.getRoll());
        s1.setName("Nolan");
        System.out.println("Name of the Student:"+s1.getName());
        s1.setMarks(10);
        System.out.println("Marks Of the Student Got :"+s1.getMarks());
        
    }
}
