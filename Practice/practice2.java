public class practice2 {
    public static void brute_force(int arr[]){      // bruth for cause it has 0(n3) TC .
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               sum = 0;
               for(int k=i; k<=j;k++){
                  sum = sum + arr[k];            
                }
                System.out.println(sum);
                if(sum > maxSum){
                    maxSum = sum;
                }
         }
         System.out.println();
     }
     System.out.println("maximum sum = "+maxSum);
    }
    public static void prefix_sum(int arr[]){       // prefix sum only use two loops so that its TC : 0(n2)

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1 ; i< arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i<prefix.length ;i++){
            sum = 0;
            for(int j = i ; j <prefix.length ; j++){

                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void kadanes_algo(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            sum = Math.max(arr[i], sum + arr[i]);  
            maxSum = Math.max(maxSum, sum);
            
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-1,-1,-3,-23};
        // brute_force(arr);
        // prefix_sum(arr);
        kadanes_algo(arr);
     }
}
