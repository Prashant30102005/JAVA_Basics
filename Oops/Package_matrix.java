package Oops;
import Array_And_Method.*;
public class Package_matrix {
    public static void main(String[] args) {
        Matrix_Multiplication m = new Matrix_Multiplication();
        int[][] a = {{1,2,3}};
        int[][] b = {{1},{2},{3}};
        int[][] c = m.multi(a,b);
        for(int j =0;j<c.length;j++){
                for(int k =0;k<c[0].length;k++){
                    System.out.printf("%d",c[j][k]);
                }
                System.out.println( );
            }
    }
}
