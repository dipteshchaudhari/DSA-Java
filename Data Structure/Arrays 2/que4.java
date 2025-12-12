public class que4 {
    public static int trappedRainwater(int arr[]){
        int n  = arr.length;
        int trappedWater = 0;
        // find left maximun boundry :
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        // find the right maximum boundry :
        int rightMax[] = new int[arr.length];
        rightMax[n-1] = arr[n-1];
        for(int i = n - 2 ;i >= 0; i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        // loop

        for(int i = 0 ;i< n ;i++){
            // finding water level :
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 3, 2, 5};
        int result = trappedRainwater(arr);
        System.out.println(result);
    }
    
}
