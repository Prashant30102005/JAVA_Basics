import java.util.Scanner;
public class Arithemetic{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = s.nextDouble();
        System.out.println("Enter second number");
        double b = s.nextDouble();
        System.out.println("the sum is "+(a+b));
        System.out.println("the sub is "+(a-b));
        System.out.println("the multiple is "+(a*b));
        System.out.println("the divide is "+(a/b));
        System.out.println("the modulus is "+(a%b));
        s.close();      
    }
}