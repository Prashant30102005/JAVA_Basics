import java.util.Scanner;
public class Age{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter your age");
        int age = s.nextInt();
        if(age<13){
            System.out.println(name+" is a child");
        }
        else if(age<20){
            System.out.println(name+" is a teenager");
        }
        else if(age<60){
            System.out.println(name+" is an adult");
        }
        else {
            System.out.println(name+" is an elder");
        }
        s.close();
    }
}