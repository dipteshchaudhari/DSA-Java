public class Arrayss {
    void reverseArr(int arr[]){

        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    void maximum(int arr[]){
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("MAximum element from Array is: "+max);
    }

    void manimum(int arr[]){
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("minimum element from Array is: "+min);
    }

    public static void main(String[] args) {
        
        // 1. Create first, then assign values individually

        int arr[]  = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 2. Initialize directly

        // Array Traversal :

        int arr2[] = {1,2,3,4,5};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int i=0; i<arr.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        // Find the sum of an array :
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of an array is:"+sum);

        // Reverse an Array

        // not reversing, here we are just printing from back side.
        // for(int i=arr.length-1; i>=0; i--) {
        //     System.out.print(arr[i] + " ");
        // }
        
        Arrayss obj = new Arrayss();
        obj.reverseArr(arr);
        System.out.println();
        obj.reverseArr(arr2);

        System.out.println();
        obj.manimum(arr);
        obj.maximum(arr);

        
    }
}
