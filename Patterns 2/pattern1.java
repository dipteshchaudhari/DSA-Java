public class pattern1 {
    public static void pattern(int r,int c){
        for(int row=1;row<=r;row++){
            for(int col=1;col<=c;col++){
                if(row==1 || row==r || col==1 || col ==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(3, 4);
    }   
}
