public class practice {
    public static void isEvenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static int GetIthBit(int n,int i) {
        int bitMask = 1<<i;

        if((n & bitMask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }
    public static int SetIthBit(int n,int i) {
        int bitMask = 1<<i;

        return n | bitMask;
    }
    public static int ClearIthBit(int n,int i) {
        int bitMask = ~(1<<i);

        return n & bitMask;
    }
    
    public static void main(String[] args) {
        // isEvenOrOdd(45);
        // int ans = GetIthBit(15, 2);
        // System.out.println(ans);
        // System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
    }
}
