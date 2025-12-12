import java.util.HashSet;
// #Optiomize solution
public class arr_duplicate2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        boolean ans = duplicate_Arr(arr);
        if(ans == true) {
            System.out.println("it has duplicates!!");
        }else{
            System.out.println("no duplicate elements!!");
        }
    }
    public static boolean duplicate_Arr(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<=arr.length-1; i++) {
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}
