package Operator_and_Expressions;
import java.util.Scanner;
public class Exp2 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.printf("Enter a number v ");
        float v = scan.nextInt();
        System.out.printf("Enter a number u ");
        float u = scan.nextInt();
        System.out.printf("Enter a number a ");
        float a = scan.nextInt();
        System.out.printf("Enter a number s ");
        float s = scan.nextInt();
        float result = (((v*v)-(u*u))/(2*a*s));
        System.out.printf("The result is %.2f",result);
        scan.close();        
    }
}
