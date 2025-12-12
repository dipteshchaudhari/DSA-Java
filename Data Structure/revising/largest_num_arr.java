public class largest_num_arr {
    public static void main(String[] args) {
        int arr[] = {2,4,5,-1,33,6};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum element in the array = "+min);
        System.out.println("minimum elemetn in the array = "+max);
    }
}
