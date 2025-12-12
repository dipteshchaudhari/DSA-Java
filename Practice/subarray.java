public class subarray {
    public static void print_subarrays(int numbers[]){
        int total =0;
        for(int i=0;i<numbers.length;i++){       //loop : start
            int start = i;
            for(int j=i;j<numbers.length;j++){     // loop : end
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k] + " ");     // print
                }
                total++;
                System.out.println();
            }   
            System.out.println();
            
        }
        System.out.println("total :"+total);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        print_subarrays(numbers);
    }
}
