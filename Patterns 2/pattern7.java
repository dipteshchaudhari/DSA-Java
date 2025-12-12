public class pattern7 {
    public static void print_pattern(int number){
        int n = 1;
        for(int i=1;i<=number;i++){
            for(int space=1;space<=number-i;space++){
                System.out.print("\t");
            }
            for(int num=1;num<=i;num++){
                System.out.print(n + "\t\t");
                n++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_pattern(4);
    }
}
