package Variable_and_Datatypes;
import java.util.Scanner; 
public class Greet {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the name ");
        String name = s.nextLine();
        System.out.printf("hello %s ",name);
        s.close();
    }    
}
