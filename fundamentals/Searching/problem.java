//      Find the first occurrence of 7 in:

//      int arr[] = {2, 4, 7, 7, 7, 9, 12};
//      int target = 7;

//      Expected : First occurrence = index 2


public class problem {
    public static void main(String[] args) {

        int arr[] = {2, 4, 7, 7, 7, 9, 12};
        int target = 7;

        int low = 0;
        int high = arr.length-1;
        int answer = -1;

        while (low <= high) {
            
            int mid = low + (high-low)/2;
            

            if(arr[mid] == target){
                answer = mid;
                high = mid-1;
            
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        if(answer != -1){
            System.out.println("First Occurance: "+answer);
        }else{
            System.out.println("Element not foundx  ");
        }
    }
}
