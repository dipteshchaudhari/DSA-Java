import java.util.Set;

public class ith_Bit_operation {
    public static int getIthBit(int n,int i) {
        int bitMask = 1 << i ;

        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int ClearIthBit(int n,int i) {
        int bitMask = ~(1 << i);

        return n & bitMask;
    }
    public static int UpadateIthBit(int n,int i,int newBit) {
        
        // 1. approach
        // if(newBit == 0) {
        //     return ClearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        // 2. approach
        n = ClearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
    public static int ClearLastIthBit(int n,int i) {
        int bitMask = (~0)<<i;

        return n & bitMask; 
    }
    public static void main(String[] args) {
        // System.out.println(getIthBit(10, 2));
        // System.out.println(getIthBit(10, 3));

        // System.out.println(setIthBit(10, 2));
        // System.out.println(ClearIthBit(10, 1));

        // int a = 10;
        // int b = 20;

        // a = a ^ b ^ a;
        // b = a ^ b ^ b;
        // System.out.println(a);
        // System.out.println(b);

        // System.out.println(UpadateIthBit(10,2,1));
        System.out.println(ClearLastIthBit(15,2));

    }
}
