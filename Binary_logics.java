import java.util.Scanner;
public class Binary_logics{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("AND logic on both number "+(a&b));
        System.out.println("OR logic on both number "+(a|b));
        System.out.println("XOR logic on both number "+(a^b));
        System.out.println("complement logic on first number "+(~a));
        System.out.println("complement logic on second number "+(~b));
        s.close();
    }
}