public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,4,2,1,5};
        bubbleSort(arr);
        printArr(arr);
    }
    public static void bubbleSort(int arr[]) {
        int totalSwaps = 0;
        for(int turn=0; turn<arr.length-1; turn++) {
            int swaps = 0;
            for(int j=0; j<arr.length-1-turn; j++) {

                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swaps++;
                    totalSwaps++;
                }
            }
            if(swaps == 0) {
                break;
            }
        }
        System.out.println("total swaps="+totalSwaps);
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   
}
