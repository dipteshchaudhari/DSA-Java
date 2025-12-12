public class practice {
  
    public static void sumsubArray(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                sum = 0;
                for(int k = i; k <= j ; k++){
                    // System.out.print(arr[k]);
                    sum = sum + arr[k];    
                }
                System.out.print(sum);
                System.out.println();
                if(maxSum < sum){
                    maxSum = sum ;
                }
            }
            System.out.println();
        }
        System.out.println("MAXIMUM SUM = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        sumsubArray(arr);
    }
}
