import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class BasicSorting {
    public static void BubbleSort(int arr[]) {
        int totalSwaps = 0; // count all swaps

        for (int turn = 0; turn < arr.length - 1; turn++) {         // for turns
            int swapCount = 0; // track swaps in this turn only

            for (int j = 0; j < arr.length - 1 - turn; j++) {       // for swapping
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapCount++;
                    totalSwaps++;
                }
            }

            // if no swap happened in this first turn → break that means     array is already sorted
            if (swapCount == 0) {
                break;
            }
        }

        System.out.println("Total swaps performed: " + totalSwaps);
    }


    public static void SelectionSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1 ; j<arr.length ; j++){
                    if(arr[minPos] > arr[j]){
                        minPos = j;
                    }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void countingSort(int arr[]) {
        
        // finding largest element cause we need largest element for creating array
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i = 0 ; i < arr.length ; i++) {
            count[arr[i]]++ ;
        }
        int j =0 ;
        for(int i = 0 ; i < count.length ; i++) {       //    for(int i =count.length-1; i >= 0 ; i--) {
            while(count[i] > 0){
                arr[j] = i ;
                j++;
                count[i]--;
            }
            
        }


    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,5};
        // Integer arr[] = {3,2,4,5,1};    // for using Collections.reverseOder we use Interger not basic primitive variable 
                                        // we object variable to store it

        // BubbleSort(arr);
        // SelectionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,2);
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,2,Collections.reverseOrder());
        countingSort(arr);
        printArr(arr);
    }
}
