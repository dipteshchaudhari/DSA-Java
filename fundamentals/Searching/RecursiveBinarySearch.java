public class RecursiveBinarySearch {

    static int Recursive_BSearch(int[] arr,int low,int high,int target){

        //BASE CASE 
        if(low > high){
            return -1;
        }

        int mid = low + (high - low)/2;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return Recursive_BSearch(arr, low, mid-1, target);
        }else{
            return Recursive_BSearch(arr, mid + 1, high, target);
        }
    }
    public static void main(String[] args) {

        int arr[] = {2, 5, 8, 12, 16, 20, 25};
        int target = 20;

        int low = 0;
        int high = arr.length - 1;
        int result = Recursive_BSearch(arr,low,high,target);

        if(result != -1){
            System.out.println("We found the elmenet at :"+result);
        }else{
            System.out.println("Not found the element");
        }
    }
}
