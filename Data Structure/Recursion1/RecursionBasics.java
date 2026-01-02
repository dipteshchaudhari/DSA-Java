public class RecursionBasics{
    public static void main(String[] args) {
        printNum(10);
        printInc(10);
        System.out.println();
        System.out.println(fact(5));
    }
    public static void printNum(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void printInc(int n) {

        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n) {

        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int f = n * fnm1;
        return f;
    }
}