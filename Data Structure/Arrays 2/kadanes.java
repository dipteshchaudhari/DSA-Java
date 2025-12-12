public class kadanes {
    public static void subArrSum(int numbers[]){
        int max = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i < numbers.length ; i++){
            current_sum = current_sum + numbers[i];

            if(current_sum < 0){ 
                current_sum = 0;
            }
            max = Math.max(max, current_sum);
        }
        System.out.println("SUM is = "+max);
        
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        subArrSum(numbers);

    }
}
