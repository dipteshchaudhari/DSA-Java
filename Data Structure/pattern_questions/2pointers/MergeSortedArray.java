import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
       int arr1[] = {1,2,3,0,0,0};
       int arr2[] = {2,4,6}; 

    //    int[] a = mergeArr(arr1, arr2);
    //    printArr(a);


       // for mergeArr2 :
        // mergeArr2(arr1, 3, arr2, 3);
        // printArr(arr1);

        mergeArr3(arr1, 3, arr2, arr2.length);
        printArr(arr1);
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
    public static int[] mergeArr(int arr1[],int arr2[]) {

        int i = 0;
        int j = 0;
        int k = 0;

        int n1 = arr1.length;
        int n2 = arr2.length;
        int ans[] = new int[n1+n2];
        while (i < n1 && j < n2) {
            
            if(arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++; 
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }


        while( i < n1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while ( j < n2){
            ans[k] = arr2[j];
            j++;
            k++;
        }


        // after the while loop if any element left print it to the last of an array
        // if(i < n1) {
        //     ans[k] = arr1[i];
        // }

        // if(j < n2) {
        //     ans[k] = arr2[j];
        return ans;
        }
    
    public static void mergeArr2(int arr1[], int m, int arr2[], int n) {
        // brute force

        int i = m;
        for(int j=0; j<n; j++) {
            arr1[i] = arr2[j];
            i++;
        }   
        Arrays.sort(arr1);
    }

    public static void mergeArr3(int arr1[],int m,int arr2[],int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            
            if(arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            }else{
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }

}
