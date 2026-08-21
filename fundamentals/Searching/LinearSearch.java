class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {10,15,20,25,30,35,40};
        int target = 35;

        int i=0;
        boolean found = false;
        int index=-1;
        while (i < arr.length) {
            
            if(arr[i] == target){
                found = true;
                index = i;
                break;
            }
            i++;
       }

       if(found){
        System.out.println("Found the element at index :"+index);
       }else{
        System.out.println("target Not found");
       }
    }
}
// Time comp : O(n)
// Space : O(1)