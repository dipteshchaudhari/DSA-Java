import java.util.*;
public class primeInRange {
public static Boolean IsPrime(int n){
        
        for(int i=2;i<=Math.sqrt(n);i++){      
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrimesInRange(int num){
        for(int i=2;i<=num;i++){
            if(IsPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
        public static void main(String[] args) {
        PrimesInRange(20);
    }   
}
