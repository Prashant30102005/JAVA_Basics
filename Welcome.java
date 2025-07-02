import java.util.Scanner;
public class Welcome{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        String name =s.nextLine();
        System.out.println("welcome "+name);
        s.close();
    }
}