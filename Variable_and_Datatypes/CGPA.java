package Variable_and_Datatypes;
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the number of physics: ");
        double a = s.nextDouble();
        System.out.printf("Enter the number of maths: ");
        double b = s.nextDouble();
        System.out.printf("Enter the number of chemistry: ");
        double c = s.nextDouble();
        System.out.printf("The CGPA is %.1f",((a+b+c)/30));
        s.close();
    }
}
