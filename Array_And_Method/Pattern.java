package Array_And_Method;
import java.util.Scanner;
public class Pattern {
    void P1(int n){
        if(n<=0){
            System.out.println("not possible");
        }
        else{
            for(int i = 1 ;i<=n;i++){
                for(int j = 1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println( );
            }
        }
    }
    public static void main(String[] args){
        Pattern p = new Pattern();
        Scanner s = new Scanner(System.in);
        p.P1(s.nextInt());
        s.close();
    }
}
