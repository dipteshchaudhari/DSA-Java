public class squareOfsortedArr {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        int r[] = SortedaArr(arr);
        printArr(r);
        
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] SortedaArr(int arr[]){
        int result[] = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;

        int pos = result.length - 1;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        while (right >= left) {
            
            if(arr[left] > arr[right]){
                result[pos] = arr[left];
                left++;
            }else{
                result[pos] = arr[right];
                right--;
            }
            pos--;
        }
        return result;
    }
}
