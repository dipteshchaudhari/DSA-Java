public class searching {
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10};
        int key = 6; // <-- ans == 2 index

        int ans = linear_Search(arr,key);

        if(ans == -1) {System.out.println("Key Not Found!!");}
        else{System.out.println("elemtnt found at index:"+ans);}


    }

    public static int linear_Search(int arr[],int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}