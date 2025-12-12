public class Question2 {
    public static void reverse_Array(int arr[]){
        int fisrt = 0;
        int last = arr.length-1;

        while (last>fisrt) {
            int temp = arr[fisrt];
            arr[fisrt] = arr[last];
            arr[last] = temp;

            fisrt++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        reverse_Array(arr);

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
    }   
}
