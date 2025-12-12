import java.util.*;

public class practice{
    public static int BinarySearch(int arr[],int target){
        int fisrt = 0;
        int last = arr.length-1;

        while (fisrt <= last) {
            int mid = (fisrt+last)/2;
            
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                last = mid - 1;
            }else{
                fisrt = mid + 1;
            }
        }
        return -1;
    }
    public static int linearSearch(int arr[],int target){
        
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int linearS(int arr[],int target){
        
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }   
    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ;i < arr.length ; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("samllest = "+smallest);
        return largest;

    }
    public static int Bsearch(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while(high >= low) {
            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void ReverseArr(int arr[]) {
        int low = 0 , high = arr.length - 1 ;
        while (low < high) {

                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low ++ ;
                high --;
            
        }
    }
    public static void printArray(int arr[]) {
        for(int i = 0 ;i < arr.length ; i++) {
            System.out.print(arr + " ");
        }
    }
    // pairs of array 
    public static void pairs_of_Arr(int arr[]) {
        int total = 0;
        for(int i = 0 ;i < arr.length-1; i++) {
            for(int j = i + 1 ; j < arr.length ; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                total ++ ;

            }
            System.out.println();
        }
        System.out.println("total pairs = "+total);
    }
    public static void print_subArr(int arr[]) {
        int total = 0;
        for(int i = 0 ;i < arr.length ; i++) {
            for(int j = i ; j < arr.length ; j++) {
                for(int k = i ; k <= j ; k++) {
                    System.out.print(arr[k]+ " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arr =" +total);
    }
    public static void sum_subArr_Bruteforce(int arr[]) {
        int sum = 0;
        int  maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length ; i++) {
            for(int j = i ; j < arr.length ; j++) {
                sum = 0;
                for(int k = i ; k <= j ; k++) {
                    sum = sum + arr[k];
                }
                System.out.println(sum);
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("maximum sum of subarray is =" + maxSum);
    }
    public static void prefix_subArr_sum(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            prefix[i] = arr[i] + prefix[i-1] ;
        }

        for(int i = 0 ; i < prefix.length ; i++) {
            sum = 0;
            for(int j = i ; j < prefix.length ; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.println(sum);
            }
            if(sum > maxSum) {
                maxSum = sum ;
            }
        }
        System.out.println("maximun sum is="+maxSum);
    }
    public static void max_subArr_sum_kadanes(int arr[]) {
        int sum =0;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length ; i++) {
            sum = sum + arr[i];
            if(sum < 0 ) {
                sum = 0;
            }
            maximum = Math.max(sum, maximum);
            // System.out.println(sum);
        }
        System.out.println("maximum value ="+maximum);
    }
    public static int TrappedWater(int arr[]) {

        //left max boundry --> auxiliery array : 
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        // same for right max boundry :

        int rightMax[] =new int[arr.length];
        rightMax[rightMax.length-1] = arr[arr.length-1];
        
        for(int i = rightMax.length - 2 ; i >= 0 ;i--) {
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        int trappedRainWater=0;
        for(int i = 0 ; i < arr.length ; i++) {
            int waterLevel = Math.min(rightMax[i],leftMax[i]);
            trappedRainWater += waterLevel - arr[i];
        }
        return trappedRainWater;
    }
    public static boolean containDuplicatesOrNot(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i  <arr.length ; i++) {
            if(set.contains(arr[i])){
                return true ;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }
    public static int leetcode(int arr[],int target) {
        int start = 0 ;
        int end = arr.length -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] > arr[start]) {
                if(arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
         }
         return -1;
    }
    public static int maxProfit(int arr[]) {

        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maximum_profit = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(buyPrice < arr[i]){
                profit =  arr[i] - buyPrice;
                maximum_profit = Math.max(maximum_profit, profit);  
            }else{
                buyPrice = arr[i];
            }
        }
        return maximum_profit;
    }
 
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("enter Number of elements you want in array:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];

        // for(int i=0;i<n;i++){
        //     System.out.println("enter element on "+i+" :");
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("Enter Target ELement :");
        // int target= sc.nextInt();

        // int result = BinarySearch(arr, target);
        // if(result == -1){
        //     System.out.println("Element not found !!");
        // }else{
        //     System.out.println("element Found at index :"+result);
        // }

        // int result = linearS(arr, target);
        // if(result == -1){
        //     System.out.println("Element not found !!");
        // }else{
        //     System.out.println("element Found at index :"+result);
        // }

        int arr[] = {7, 6, 4, 3, 1};
        // System.out.println("largest is = "+largest(arr));
        // System.out.println(Bsearch(arr, 3));
        // ReverseArr(arr);
        // for(int i = 0 ;i < arr.length ; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        
        // pairs_of_Arr(arr);
        // print_subArr(arr);
        // sum_subArr_Bruteforce(arr);
        // prefix_subArr_sum(arr);
        // max_subArr_sum_kadanes(arr);
        // System.out.println(TrappedWater(arr));
        // boolean r = containDuplicatesOrNot(arr);
        // System.out.println(r);
            // int ans = leetcode(arr, 5);
            // System.out.println(ans);
        int x = maxProfit(arr);
        System.out.println(x);
        
    }
}