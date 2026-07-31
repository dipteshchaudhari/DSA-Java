class Bank {
    static String bank_name = "SBI";
    static int branch_code = 2930;

    int account_number;
    String Customer_name;


}
class program3{
    public static void main(String[] args) {
        
        Bank b1 = new Bank();

        b1.account_number = 1234;
        b1.Customer_name = "rohit";
        
        System.out.println("details 1 :");
        System.out.println("Bank name :" +Bank.bank_name);
        System.out.println("thier branch code :"+Bank.branch_code);
        System.out.println("account_number :" +b1.account_number);
        System.out.println("customer name :" +b1.Customer_name);

        System.out.println();
        System.out.println();
        
        Bank b2 = new Bank();

        b2.account_number = 5678;
        b2.Customer_name = "rahul";
        
        System.out.println("details 2 :");
        System.out.println("Bank name :" +Bank.bank_name);
        System.out.println("thier branch code :"+Bank.branch_code);
        System.out.println("account_number :" +b2.account_number);
        System.out.println("customer name :" +b2.Customer_name);

        System.out.println();
        System.out.println();

        Bank b3 = new Bank();

        b3.account_number = 12593;
        b3.Customer_name = "mohit";
        
        System.out.println("details 3 :");
        System.out.println("Bank name :" +Bank.bank_name);
        System.out.println("thier branch code :"+Bank.branch_code);
        System.out.println("account_number :" +b3.account_number);
        System.out.println("customer name :" +b3.Customer_name);
    }
}