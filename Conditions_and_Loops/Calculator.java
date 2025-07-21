package Conditions_and_Loops;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char x;
        do{
            char c=s.next().charAt(0);
            int a = s.nextInt();
            int b = s.nextInt();
            switch(c){
                case '+':System.out.printf("the sum is %d\n",(a+b));
                break;
                case '-':System.out.printf("the sub is %d\n",(a-b));
                break;
                case '*':System.out.printf("the mutiplication is %\n",(a*b));
                break;
                case '/':System.out.printf("the division is %d\n",(a/b));
                break;
                default:System.out.printf("Invalid input\n");
            }
            System.out.printf("do you want to continue then type y\n");
            x=s.next().charAt(0);
        }while (x =='y');          
        s.close();
    }
}