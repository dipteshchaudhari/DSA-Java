public class pattern9 {
    public static void hollow_pyramid(int number){
        for(int i=1;i<=number;i++){
            for(int space=1;space<=number-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
                if(i==1 || i==number || star == 1 || star == 2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_pyramid(4);
    }
}
