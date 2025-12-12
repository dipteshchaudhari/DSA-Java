// public class linearSearch {
//     public static int linearSearching(int numbers[],int key){
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10,12,14,16,18,20,43};
//         int key = 10;
//         int result= linearSearching(numbers, key);
//         if (result == -1) {
//             System.out.println("Numebr is NOT present in the Array");
//         }else{
//             System.out.println("Numebr is present in the Array at Index:"+result);
//         }
//     }
// }


public class linearSearch {
    public static int linearSearching(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"samosa","vadapav","kachori","pakodi","ajagar"};
        String key = "pakodi";

        int result = linearSearching(menu, key);
        if(result == -1){
            System.out.println("Not found");
        }else{
            System.out.println("found at Index :"+result);
        }
    }
}
