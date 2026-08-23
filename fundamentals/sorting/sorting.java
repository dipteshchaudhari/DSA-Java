import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        
        int arr[] = {5,3,8,4,2};
        // bubble(arr);
        Insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    //swapping logic :
    static void swap(int arr[],int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void bubble(int arr[]){

        for(int i = 0; i < arr.length; i++) {  
            //we have sort the adjacent element and push the max element at the 
            // end of the array.
            for(int j = 1; j < arr.length - i; j++) {

                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
            }

        }
    }
    static void Selection(int arr[]) {

        for(int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, last, maxIndex);
        }
    }

    // function for finding the maximum element INDEX in the array.
    static int getMaxIndex(int arr[], int start, int end) {

        int max = start;

        for(int i = start; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void Insertion(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {
            
            // now we are starting our with 1 index and check if both element are sorted or not 
            // other wise we swap them. till j > 0

            for(int j = i + 1; j > 0; j--) {

                if(arr[j] < arr[j-1]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }
}
