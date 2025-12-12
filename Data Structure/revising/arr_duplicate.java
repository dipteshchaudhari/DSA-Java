// #Brute Force 
public class arr_duplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5,4};
        boolean ans = contain_duplicate(arr);
        if(ans == true) {
            System.out.println("it has duplicates!!");
        }else{
            System.out.println("no duplicate elements!!");
        }
    }
    public static boolean contain_duplicate(int arr[]) {
                
        for(int i=0; i<=arr.length-2; i++) {
            for(int j=i+1 ; j<=arr.length-1; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
