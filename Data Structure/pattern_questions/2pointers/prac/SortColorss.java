public class SortColorss {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        // ArrangColors(arr);
        ArrangColorsUsingTwoPointers(arr);
        printArr(arr);
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // Not Two Pointer but Optimized Approach:
    public static void ArrangColors(int arr[]){    // T.C : O(n) & S.C : O(1)
        
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            }else if(arr[i] == 1){
                one++;
            }else{
                two++;
            }
        }
        int index = 0;
        for(int i=0; i<zero; i++) {
            arr[index++] = 0;
        }
        for(int i=0; i<one; i++) {
            arr[index++] = 1;
        }
        for(int i=0; i<two; i++) {
            arr[index++] = 2;
        }
    }
    // Using Two Pointer :
    public static void ArrangColorsUsingTwoPointers(int arr[]) {

         int low = 0;
        int mid = 0;
        int high = arr.length - 1; 
        
        while (high >= mid) {

             if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
           
        }   
    }
}


