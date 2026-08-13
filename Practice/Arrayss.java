import java.util.Scanner;

class Arrayss{
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements :");
        n = sc.nextInt();


        int[] arr = new int[n];

        System.out.println("Enter "+n+" Elements");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
}