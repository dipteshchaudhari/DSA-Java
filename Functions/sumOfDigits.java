public class sumOfDigits {
    public static void SUM(int number){
        int sum = 0;
        while (number > 0) {
            int ld = number %10;
            sum = sum + ld;
            number = number / 10;
        }
        System.out.println("the sum of numebr is :"+sum);
    }
    public static void main(String[] args) {
        SUM(123);
    }
}
