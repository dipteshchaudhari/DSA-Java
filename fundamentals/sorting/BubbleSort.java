import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args) {
        
        int arr[]  = {5,3,8,4,2};   // Answer : {2,3,4,5,8}

        for(int i=0; i<arr.length - 1; i++) {
            // for turns
            for(int j=0; j<arr.length-1-i; j++) {
                // for swaping
                if(arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int arr[]){
        
        for(int i = 0; i < arr.length; i++) {
            // Counter Loop
            for(int j = 1; j < arr.length - i; j++) {
                // Swapping logic

                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

// Time Complexity  : O(n^2)
// Space Complexity : O(1)
