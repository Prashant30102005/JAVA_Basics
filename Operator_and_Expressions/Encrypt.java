package Operator_and_Expressions;
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a character ");
        char a = (char)s.next().charAt(0);
        char b = (char)(a+8);
        System.out.printf("the encrypted char %c\n",b);
        char c = (char)(b-8);
        System.out.printf("the original char %c",c);
        s.close();
    }
}
