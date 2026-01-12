public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3};
        reverseArray(arr);
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        
        while(high > low) {
            
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            
            low++;
            high--;
        }
    }
}
