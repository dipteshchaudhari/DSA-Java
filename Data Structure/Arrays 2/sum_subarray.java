// Brute Force : 

public class sum_subarray {     
    public static void subarray_sum1(int numbers[]){    //brute Force : TC = (N)**3 
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum + numbers[k];
                }
                System.out.print(sum);
                System.out.println();
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("MAXimum sum among all this Numbers are :"+maxSum);
        
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        subarray_sum1(numbers);
    }
}