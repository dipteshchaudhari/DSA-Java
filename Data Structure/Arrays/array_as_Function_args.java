public class array_as_Function_args {
    public static void array_args(int marks[],int non_changable){
        non_changable = 10;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {50,60,45};
        int non_changable = 5;                      // call by value
        array_args(marks , non_changable);          // Call by Reference -> Array only
        System.out.println(non_changable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();

    }
}
