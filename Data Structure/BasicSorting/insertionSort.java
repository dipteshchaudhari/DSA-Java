public class insertionSort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
    public static void insertionSort(int arr[]) {

        for(int i=1; i<arr.length; i++) {
            int key = arr[i]; // element to insert
            int j = i-1;      // last index of sorted part

            while (j >=0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
