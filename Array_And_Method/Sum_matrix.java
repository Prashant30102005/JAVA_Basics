package Array_And_Method;
import java.util.Scanner;
public class Sum_matrix{
    int[][] sum(int[][] a,int[][] b){
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = s.nextInt();
        int[][] a = new int[n][v];
        int[][] b = new int[n][v];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                a[i][j] = s.nextInt();
            }
        }
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                b[i][j] = s.nextInt();
            }
        }
        Sum_matrix e = new Sum_matrix();
        int[][] c = new int[3][3];
        c = e.sum(a,b);
        for(int[] q:c){
            for(int w:q){
                System.out.printf("%d ",w);
            }
            System.out.println( );
        }
        s.close();
    }
}