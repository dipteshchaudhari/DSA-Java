class company{
    int employee_id;
    String employee_name;

    static String company_name = "PIET";

    static void show_Company(){
        System.out.println("Company name is Flipcart");
        System.out.println("....exiting.....");
    }
}
public class program4 {
    public static void main(String[] args) {
        
        company c = new company();
        
        c.employee_id = 102;
        c.employee_name = "aditya";

        System.out.println("Employee id is : "+c.employee_id);
        System.out.println("Employee name is ="+c.employee_name);

        System.out.println("company :"+company.company_name);
        company.show_Company();
    }
}
