public class callByValue {

    public static void swap(int a,int b){
        int temp = a;
        a = b ;
        b = temp;

        System.out.println("in swap method:");
        System.out.println("a is now: "+a);
        System.out.println("b is now: "+b);
    }
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("in main method:");
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);

        swap(a, b);
    }
}
