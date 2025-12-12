//  Prefix Sum :

public class sum_subArray2 {
    public static void sum_subArray2(int arr[]){
        int prefix[] = new int[arr.length];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = arr[0];
        for(int i = 1 ; i < prefix.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < prefix.length ; i++){
            int start = i;
            sum = 0;
            for(int j = i ; j < prefix.length ; j++){
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            System.out.println();
            
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        System.out.println("MaxSUm is = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};  
        sum_subArray2(arr);      
    }
}
