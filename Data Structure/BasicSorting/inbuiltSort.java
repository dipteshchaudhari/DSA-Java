import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        Integer arr[] = {5,4,1,3,2};

        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());    // this works only on objects 
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr2(arr);                                 // primiitve type variable not supported
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     public static void printArr2(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
