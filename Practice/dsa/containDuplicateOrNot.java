import java.util.HashSet;

public class containDuplicateOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1};
        System.out.println(diplicateOrNot(arr));
        System.out.println(duplicateOrNot2(arr));
    }
    // Brute Force:
    public static boolean diplicateOrNot(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            } 
        }
        return false;
    }
    public static boolean duplicateOrNot2(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
        
    }
}
