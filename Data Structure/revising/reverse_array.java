public class reverse_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rev_Arr(arr);   // call by reference 

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void rev_Arr(int arr[]) {
        int fisrt = 0;
        int last = arr.length-1;

        while(fisrt < last) {
            int temp = arr[fisrt];
            arr[fisrt] = arr[last];
            arr[last] = temp;
            
            fisrt++;
            last--;
        }
    }
} 
