public class practice {
    public static void bubbleSort(int arr[]){
        int totalSwaps = 0;
        for(int turn=0;turn <arr.length - 1 ; turn ++){
            int currSwap=0;
            for(int j = 0 ; j < arr.length-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    currSwap++;
                    totalSwaps++;
                }
            }
            if(currSwap == 0){
                break;
            }
        }
        System.out.println("total swaps ="+totalSwaps);
    }
    public static void printArry(int arr[]){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    } 
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        printArry(arr);
    }
}
