package Conditions_and_Loops;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.println( );
        }
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.printf("* ");
            }
            System.out.println( );
        }
    }
}
