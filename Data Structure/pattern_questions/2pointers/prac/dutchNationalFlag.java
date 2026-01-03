public class dutchNationalFlag {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        // dutchNationalFlag1(arr);
        dutchNationalFlag2(arr);
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void dutchNationalFlag1(int arr[]) {
        int zeros= 0;
        int ones= 0;
        int twos= 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 0) zeros++;
            else if(arr[i] == 1) ones++;
            else twos++;
        }
        int index = 0;
        for(int i=0; i<zeros; i++) {
            arr[index++] = 0;
        }
        for(int i=0; i<ones; i++) {
            arr[index++] = 1;
        }
        for(int i=0; i<twos; i++) {
            arr[index++] = 2;
        }
    }
    public static void dutchNationalFlag2(int arr[]) {
        
        int i = 0;
        int low = 0;
        int high = arr.length - 1;

        while (i <= high) {
            if(arr[i] == 0){
                int temp = arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
                
                i++;
                low++;
            }else if(arr[i] == 1){
                i++;
            }else{
                int temp = arr[high];
                arr[high] = arr[i];
                arr[i] = temp;

                high--;
            }
        }
    }       
}
