package String;
import java.util.Scanner;
public class Underscore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a string \n");
        String a = s.nextLine();
        String b = a.replace(" ","_");
        System.out.println("the replaced string is \""+b+"\"");
        s.close();
    }
}
