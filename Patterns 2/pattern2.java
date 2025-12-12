public class pattern2 {
    public static void inv_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_pyramid(10);
    }
}
