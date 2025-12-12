public class isEven {
    public static void main(String[] args) {
        boolean n =isEven(115436278);
        
        if(n){
            System.out.println("number is even");
        }else{
            System.out.println("Numebr is odd");
        }
    }
    public static boolean isEven(int n){
        if(n % 2 ==0){
            return true;
        }
        return false;
    }
}
