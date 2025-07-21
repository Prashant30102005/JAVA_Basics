package String;
import java.util.Scanner;
public class Lower_Case {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a string");
        String s = scan.nextLine();
        String a = s.toLowerCase();
        System.out.println("the lower case of that string \""+a+"\"");
        scan.close();
    }
}
