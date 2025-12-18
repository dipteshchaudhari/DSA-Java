public class digital_root{
    public static void main(String[] args) {
        int num = 138;
        int digitalRoot = 0;
        if(num == 0) {
            digitalRoot = 0;
        }else if(num % 9 == 0) {
            digitalRoot = 9;
        }else{
            digitalRoot = num % 9;
        }
        System.out.println("digital root of "+num+" is :"+digitalRoot);
    }
}