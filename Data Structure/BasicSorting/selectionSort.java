public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        selectionSort(arr);
        printArr(arr);

    }   
    public static void selectionSort(int arr[]) {
        int count = 0;
        for(int i=0; i<arr.length-1; i++) {
            int minpos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;  
            
            count++;
        }
        System.out.println("total = "+count);
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
