public class decToBin {
    public static void decimal_to_binary(int dec){
        int myNum = dec;
        
        int pow =0;
        int binNum=0;
        while (dec > 0) {
            int rem = dec % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            dec = dec/2;
        }
        System.out.println("decimal to binary of "+myNum+" is: "+binNum);
    }
    public static void main(String[] args) {
        decimal_to_binary(8);
    }
}
