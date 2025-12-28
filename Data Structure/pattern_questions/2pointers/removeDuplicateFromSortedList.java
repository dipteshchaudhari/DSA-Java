public class removeDuplicateFromSortedList {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        // int arr[] = {1,1,2};
        removeDuplictes(arr);
        int ans = removeDuplicteElement(arr);
        System.out.println(ans);
    }
    public static int removeDuplictes(int arr[]) {

        int i=0;
        int count = 1;
        for(int j=i+1; j<arr.length; j++) {

            if(arr[j] != arr[j-1]) {
                arr[i+1] = arr[j];
                i++;
                count++;
            }
        }
        return count;
    }

    // using while loop 

    public static int removeDuplicteElement(int arr[]) {

        if(arr.length ==0) return 0;

        int i = 0;
        int j = 1;

        int count = 1;

        int n = arr.length;
        while (j < n) {
            
            if(arr[j] != arr[j-1]) {
                arr[i+1] = arr[j];
                i++;
                count++;
            }
            j++;
        }
        return count;
    }
}
