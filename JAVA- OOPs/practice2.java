// Create an emoloyee class 
// Create one object using default constructor and 
// one using paramiterized constructor .
// display the details of both the employees. 

class Employee{
    int emp_id;      // instance variable : inside the class but not inside the method
    String emp_name;

    Employee(){
        emp_id = 101;
        emp_name = "ronaldo";
    }
    Employee(int emp_id, String emp_name) { 
        this.emp_id = emp_id;                           // local variable : inside the method or consstuctor 
        this.emp_name = emp_name;
    }
}
public class practice2 {
    public static void main(String[] args) {
        
        Employee E1 = new Employee();

        System.out.println(E1.emp_id);
        System.out.println(E1.emp_name);
        
        Employee E2 = new Employee(102,"messi");

        System.out.println(E2.emp_id);
        System.out.println(E2.emp_name);
    }
}
