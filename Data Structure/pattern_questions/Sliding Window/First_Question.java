// link : https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1


public class First_Question{
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        System.out.println(subArr3(arr, k));
    }
    public static int subArr(int arr[],int k){
        // Using For Loop

        int start = 0;
        int end = k-1;
        
        int max = Integer.MIN_VALUE;

        // while (end < arr.length) {
            int sum = 0;    
            for(int i=start; i<=end; i++) {
                sum = sum + arr[i];
            }
            max = sum;
            
            // sliding window
            for(end=k; end <arr.length; end++){
                sum = sum + arr[end] - arr[start];
                start++;
                max = Math.max(sum,max);
            }
        // }  
        return max; 
    }
    public static int subArr2(int arr[],int k){
        // Using while loop

        int start = 0;
        int end = k-1;
        int sum = 0;

        for(int i=start; i<=end; i++) {
            sum += arr[i];
        }
        int max = sum;
        
        while (end  < arr.length) {

           max = Math.max(sum, max);
           start++;
           end++;

           sum = sum - arr[start];

           if(end == arr.length){
            break;
           }
           sum = sum + arr[end];
           
        }
        return max;
    }
    public static int subArr3(int arr[],int k){
    int start = 0;
        int end = k-1;
        int sum = 0;
        
        for(int i=0; i<=end; i++) {
            sum += arr[i];
        }
        int max = sum;
        
        while(end < arr.length){
            start++;
            end++;
            
            if(end == arr.length){
                break;  
            }
            sum = sum - arr[start-1];
            
            sum = sum + arr[end];
            
            max = Math.max(sum,max);
        }
        
        return max;
    }
}