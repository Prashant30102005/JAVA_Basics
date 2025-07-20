package Variable_and_Datatypes;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the first number :");
        double a = s.nextDouble();
        System.out.printf("Enter the Second number :");
        double b = s.nextDouble();
        System.out.printf("The sum is %f",(a+b));
        s.close();
    }
}
