import java.util.Scanner;
public class Rectangle_perimeter{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length");
        float length = s.nextFloat();
        System.out.println("enter breadth");
        float breadth = s.nextFloat();
        System.out.println("the perimeter of rectangle: "+(length+breadth));
        s.close();
    }
}