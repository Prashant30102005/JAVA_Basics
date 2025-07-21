package Variable_and_Datatypes;
import java.util.Scanner;
public class Int_Check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter an character: ");
        boolean a = s.hasNextInt();
        System.out.printf("%b It is an integer",a);
        s.close();
    }
}
