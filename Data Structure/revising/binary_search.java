public class binary_search {
    public static int b_search(int arr[],int key) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key) {
                return mid;
            }else if(arr[mid] < key) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // binary search works for the sorted array
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int result = b_search(arr, key);

        if(result == -1) {
            System.out.println("Not Found");
        }else{
            System.out.println("Element found at index = "+result);
        }
    }
}
