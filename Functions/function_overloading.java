// ***************Function overloadog using parameters *********


// public class function_overloading {
   
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {

//         System.out.println(sum(5, 5));
//         System.out.println(sum(4,5,6));
//     }
// }




//  ********** FUnction overloading using fata types *******



public class function_overloading {
    
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,4));
        System.out.println(sum(3.8f, 4.2f));

    }
}
