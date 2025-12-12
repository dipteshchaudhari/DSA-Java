public class pattern3 {
    public static void pattern3(int n){
        
        for(int i = 1;i<=n;i++){
            for(int num=1;num<=n-i+1;num++){
                System.out.print(num + " ");       
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern3(10);
    }   
}
