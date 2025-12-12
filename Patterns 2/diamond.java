public class diamond {
    public static void diamond_pattern(int n){
        // 1st half

        for(int i=1;i<=n;i++){
            for(int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n;i>=1;i--){
            for(int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_pattern(4);
    }
}
