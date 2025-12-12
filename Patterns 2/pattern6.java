public class pattern6 {
    public static void print_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int space= 1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int num=1;num<=i;num++){
                System.out.print(num);
            }
            for(int r=i-1;r>=1;r--){
                System.out.print(r);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_pattern(4);
    }   
}
