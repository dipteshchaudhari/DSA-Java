// 1. What is a Digital Root?
// The digital root of a number mean , take a nummber, add its digits and if its 
// sum has more that 1 digit then repeat again until you get one digit only

public class digital_root{
    public static int digitalRoot(int num){
        if(num == 0) return 0;
        else if (num % 9 == 0) {
            return 9;
        }else{
            return num % 9;
        }
    }
    public static void main(String[] args) {
        int dr = digitalRoot(138);
        System.out.println(dr);
    }
}