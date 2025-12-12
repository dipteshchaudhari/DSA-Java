import java.util.*;
public class arrays{
    public static void main(String[] args) {
       
        int marks[] = new int[50];
        Scanner sc=new Scanner(System.in);
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        
        System.out.println("physics marks:"+marks[0]);
        System.out.println("chemistry marks:"+marks[1]);
        System.out.println("biology marks:"+marks[2]);
        
        marks[2]=100;
        System.out.println("biology marks(after updation):"+marks[2]);

        marks[1] = marks[1]+1;
        System.out.println("chemistry marks:(after upadation)"+marks[1]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("PERCENTAGE ="+percentage+"%50");

        System.out.println("length of array is ="+marks.length);
    }
}