public class segregat0sAnd1s {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0};
        printArr(arr);
        arrange(arr);
        System.out.println();
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrange(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (high > mid) {
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                mid++;
                low++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
}
