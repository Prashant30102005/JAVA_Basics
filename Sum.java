import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        System.out.println("Their sum is "+(a+b));
        s.close();
    }
}