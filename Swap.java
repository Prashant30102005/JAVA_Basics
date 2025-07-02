import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("first number "+a);
        System.out.println("second number "+b);             
        s.close();
    }
}