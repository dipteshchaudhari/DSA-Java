import java.util.HashSet;

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

    void LinearSearch(int arr[],int target){
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Number is found at index :"+i);
                return;
            }
        }
        System.out.println("Number is Not Found in Array");

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


        //linear Search :

        int target = 90;
        obj.LinearSearch(arr,target);


        System.out.println();
        System.out.println();
        System.out.println("------- Count Even Numbers-------");

        // Count Even Numbers

        int arr3[] = {12, 7, 8, 15, 20, 3, 6};

        int even = 0;
        for(int i=0; i<arr3.length; i++) {

            if(arr3[i] % 2 == 0){
                even++;
            }
        }
        System.out.println("Total Even Numbers in Arrays are :"+even);


        System.out.println();
        System.out.println();
        System.out.println("-------Problem 6 : Find Second Largest-------");

        // Problem 6 — Find Second Largest

        
        int arr4[] = {10, 25, 5, 40, 30};

        int largest = arr4[0];
        int second_largest = arr4[0];

        for(int i=1; i<arr4.length; i++) {
            
            if(arr4[i] > largest){
                second_largest = largest;
                largest = arr4[i];
            }else if(arr4[i] > second_largest){
                second_largest = arr4[i];
            }
        }

        System.out.println("Largest Number ="+largest);
        System.out.println("Second Largest Number ="+second_largest);


        System.out.println();
        System.out.println();
        System.out.println("-------Array Insertion and Deletion.-------");
        // Array Insertion and Deletion.

        int arr5[] = new int[6];

        arr5[0] = 10;
        arr5[1] = 20;
        arr5[2] = 30;
        arr5[3] = 40;
        arr5[4] = 50;
        
        int element = 25;
        int index = 2;
        int size = 5;

        
        for(int i=size; i>index; i--){
            arr5[i] = arr5[i-1]; 
        }

        arr5[index] = element;
        size++;        

        System.out.println("Array after Inserting 25 at 2nd index!!");
        for(int i=0; i<size; i++) {
            System.out.print(arr5[i] + " ");
        }

        // Deleting Element from an Array

        int delete_index = 2;

        for(int i = delete_index; i<size - 1; i++) {
            arr5[i] = arr5[i+1];
        }
        size--;
        System.out.println("\nArray after Deleting 25 from the 2nd index!!");

        for(int i=0; i<size;i++){
            System.out.print(arr5[i] + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("-------2D-Array-------");

        // 2-D Array

        int[][] arr6 ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };  

        int summ = 0;

        for(int i=0; i<arr6.length;i++) {
            for(int j=0; j<arr6[i].length; j++){
                System.out.print(arr6[i][j] + " ");
                summ = summ + arr6[i][j];
            }
            System.out.println();
        }
        System.out.println("sum of 2d array elements are : "+summ);


        // Count positive numbers

        int arr7[] = {-2, 5, -7, 8, 10, -1, 3};  

        int pos = 0;
        for(int i=0; i<arr7.length; i++){
            if(arr7[i] > 0){
                pos++;
            }
        }
        System.out.println("Total Positive numbers are :"+pos);


        // Find the second smallest

        int arr8[] = {15, 4, 9, 2, 20, 7};

        int Smallest = arr8[0];
        int second_smallest = Integer.MAX_VALUE;  

        for(int i=1; i<arr8.length; i++){

            if(arr8[i] < Smallest){
                second_smallest = Smallest;
                Smallest = arr8[i];
            }else if(arr8[i] < second_smallest){
                second_smallest = arr8[i];
            }
        }

        System.out.println("Second smallerst number is :" +second_smallest);


        // Check if an array is sorted
        int arr9[] = {2, 4, 6, 8, 10};

        Boolean sort = true;
        for(int i=0; i<arr9.length-1; i++){

            if(arr9[i] > arr9[i+1]){
                sort = false;
                break;
            }
        }
        if(sort){
            System.out.println("Array is sorted.");
        }else{
            System.out.println("Array is not sored");
        }
        

        // find the duplicate elements 
        int[] arr10 = {1, 3, 4, 3, 5, 1};

        // for(int i=0; i<arr10.length-1; i++){
        //     for(int j=i+1; j<arr10.length; j++) {

        //         if(arr10[i] == arr10[j]){
        //             System.out.print(arr10[i] + " ");
        //         }
        //     }
        // }

        // find the duplicates using hashset

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr10.length; i++) {
            
            if(set.contains(arr10[i])){
                System.out.println(arr10[i] +" ");
            }else{
                set.add(arr10[i]);
            }
        }


     }
}
