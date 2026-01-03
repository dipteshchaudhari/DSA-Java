public class RemoveDuplicateSortedArr {

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(arr);
        System.out.println("Unique elements count = " + k);

        printArr(arr);
    }

    public static int removeDuplicates(int arr[]) {

        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[j-1]) {       // arr[j] != arr[i]
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
