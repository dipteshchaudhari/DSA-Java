import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int arr[] = {-11,0,234,-32};
        Selection2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int arr[]){

        for(int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;

            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, last, maxIndex);

        }   
    }
    static int getMaxIndex(int arr[],int fisrt,int last) {

        int maxIndex = fisrt;
        
        for(int i = fisrt; i <= last; i++) {
            
            if(arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int arr[], int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void Selection2(int arr[]) {

        for(int i = 0; i < arr.length; i++) {

            // Selecting minimum element from the remaining array and swapping it 
            // to the starting of an array.

            int start = i;  
            int last = arr.length;
            int minindex = getMinIndex(arr,start,last);
            swap(arr,start, minindex);

        }
    }
    static int getMinIndex(int arr[], int start, int last) {

        int minindex = start;

        for(int i = start; i < last; i++) {
            if(arr[minindex] > arr[i]) {
                minindex = i;
            }
        }
        return minindex;
    }
}
