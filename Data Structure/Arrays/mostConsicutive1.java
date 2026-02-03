public class mostConsicutive1{
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1};
        System.out.println(mostConsicutive(arr));
    }   
    public static int mostConsicutive(int arr[]) {
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            }else{
                count = 0;
            }
        }
        return maxCount;
    } 
}