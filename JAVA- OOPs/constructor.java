class student{
    String name;
    int age;
    int roll;

    // no-arguement constructor 
    student(){
        name = "sachin";
        age = 20;
    }
    // paramiterized constructor 

    student(String n,int a){
        name = n;
        age = a;
    }
    student(String n, int a, int r){
        name = n;
        age = a;
        roll = r;
    }
    
}
public class constructor {
    public static void main(String[] args) {

        // student s1 = new student();

        // student s2 = new student("sachin",20);
        // student s3 = new student("dhoni",30);

        // System.out.println(s2.name);
        // System.out.println(s3.age);

        // constructor overloading...

        student s1 = new student();

        student s2 = new student("rahul",20);
        
        student s3 = new student("mahesh",19,101);
    }
}
