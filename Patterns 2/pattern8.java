public class pattern8 {
    public static void pyramid_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid_pattern(5);
    }
}
