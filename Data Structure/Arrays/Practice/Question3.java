public class Question3 {
    public static void pairs_in_Array(int arr[]){
        int total_pairs=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs in of this arrays is :"+total_pairs);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairs_in_Array(arr);
    }
}
