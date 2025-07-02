import java.util.Scanner;
public class LCM{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        int i = 1;
        int x = 0;
        do{
            if(b*a*i==0){
                x=a*i;
            }
            else{
                x=0;
            }
            i++;
        }
        while(b*(a*i)!=0);
        
        System.out.println("The LCM of two number is "+x);
        s.close();
    }
}
