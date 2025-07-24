package Array_And_Method;

public class Matrix_Multiplication {
    public int[][] multi(int[][] a,int[][] b){
        int[][] c = new int[a.length][b[0].length];
        for(int i =0;i<a.length;i++){
            for(int j =0;j<b[0].length;j++){
                for(int k =0;k<a[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }   
        }
        return c;
    }
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
