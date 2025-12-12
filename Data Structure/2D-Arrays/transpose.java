//assignment Question :

public class transpose {
    public static void transpose(int mat[][]) {

        for(int r = 0 ; r < mat.length -1 ; r++ ) {
            for(int c = r + 1 ; c < mat[0].length ; c++) {
                int temp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = temp;
            }
        }
        System.out.println("After= ");
        for(int i = 0 ; i < mat.length ; i++) {
            for(int j = 0 ; j < mat[0].length ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("Before =");
        for(int i = 0 ; i < mat.length ; i++) {
            for(int j = 0 ; j < mat[0].length ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        transpose(mat);
    }
}
