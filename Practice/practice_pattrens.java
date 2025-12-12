public class practice_pattrens {
    public static void pattern(int n){
    //   1st half
        for(int i=1;i<=n;i++){
            for(int star=1;star<=i;star++){
                System.out.print(" * ");
            }
            for(int space=1;space<=2*(n-i);space++){
                System.out.print("   ");
            }
            for(int star=1;star<=i;star++){
                System.out.print(" * ");
            }
            System.out.println();
      }
      for(int i=n;i>=1;i--){
            for(int star=1;star<=i;star++){
                System.out.print(" * ");
            }
            for(int space=1;space<=2*(n-i);space++){
                System.out.print("   ");
            }
            for(int star=1;star<=i;star++){
                System.out.print(" * ");
            }
            System.out.println();
      }
    }
    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++){
              if(i==1 || i == n || star == 1 || star == n){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
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
        // pattern(5);
        // pattern2(5);
        pattern3(5);
    }
}
