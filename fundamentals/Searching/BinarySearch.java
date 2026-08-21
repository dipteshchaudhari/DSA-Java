public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[] = {2,5,8,12,16,20,25};
        int target = 16;

        int first = 0;
        int last = arr.length-1;

        while (first <= last) {
            
            int mid = first + (last - first)/2;

            if(arr[mid] == target){
                System.out.println("Found element At index : "+mid);
                return;
            }else if(arr[mid] > target){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        System.out.println("No such Element in Array");
        
    }
}

// time  : O(log n)
// space : O(1)