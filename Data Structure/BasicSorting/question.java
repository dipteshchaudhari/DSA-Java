public class question {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Question : Use Sorting algorithms to sort an array in DESCENDING order :

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubble(arr);
        // selection(arr);
        // counting_sort(arr);
        insertionSort(arr);
        printArr(arr);
    }
    public static void bubble(int arr[]) {
        
        for(int turn=0; turn<arr.length-1; turn++) {
            
            for(int j=0; j<arr.length-1-turn; j++) {
                
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void counting_sort(int arr[]) {
    
        int largest = arr[0];
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j =0;
        for(int i=count.length-1; i>=0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        // int j=0;
        // for(int i=0; i<count.length; i++) {
        //     while (count[i] > 0) {
        //         arr[j] = i;
        //         j++;
        //         count[i]--;
        //     }
        // }
    }
    public static void selection(int arr[]) {
        
        for(int i=0; i<arr.length; i++) {
            int maxPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]) {

        for(int i=1; i<arr.length; i++) {
            int key = arr[i]; // element to insert
            int j = i-1;      // last index of sorted part

            while (j >=0 && key > arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;    // insertion of element
        }
    }
}
