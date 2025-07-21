package Conditions_and_Loops;
import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.printf("Enter your salary: ");
        float a = s.nextInt();
        float tax;
        if(a<=250000){
            System.out.printf("your tax will be 0");
        }
        else if(a>250000 && a<=500000){
            tax = 0.0f*a;
            System.out.printf("your tax will be 5%% that is %.2f",tax);
        }
        else if(a>500000 && a<=1000000){
            tax =0.05f*a;
            System.out.printf("your tax will be 20%% that is %.2f",tax);
        }
        else{
            tax = 0.3f*a;
            System.out.printf("your tax will be 30%% that is %.2f",tax);
        }
        s.close();
    }
}
