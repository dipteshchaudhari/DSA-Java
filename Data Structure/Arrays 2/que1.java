import java.util.HashMap;
import java.util.HashSet;

public class que1 {
    public static boolean appearsTwiceOrNot(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
            }
        
        return false;
    }
    public static boolean optimize(int arr[]){
        HashSet <Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(optimize(arr));
    }
}
