import java.util.Arrays;

public class SquareOfArray {
    public static void main(String[] args) {
        int arr[] = {-4,-2,0,3,10};

        // int[] ans = Square(arr);
        // printArr(ans);

        
        int[] ans = Square2(arr);
        printArr(ans);

    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] Square(int arr[]) { 
        // Brute force : n log n
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    public static int[] Square2(int arr[]) {
        
       int[] result = new int[arr.length];

       int left = 0;
       int right = arr.length-1;

       int pos = arr.length - 1;

       while (right >= left) {

            int sqrOfLeft = arr[left] * arr[left];
            int sqrOfRight = arr[right] * arr[right];

            if(sqrOfLeft < sqrOfRight) {
                result[pos] = sqrOfRight;
                right--;
            } else {
                result[pos] = sqrOfLeft;
                left++;
            }
            pos--;
       }
       return result;
    }

}
