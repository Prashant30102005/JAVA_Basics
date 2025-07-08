import java.util.Scanner;
public class String_Concat{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the size of sentence ");
        int n = scan.nextInt();
        String[] a = new String[n];
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<n;i++){
            System.out.printf("Enter %d word ",(i+1));
            a[i]=scan.next();
        }
        for(String b :a){
            s.append(b);
            s.append(" ");
        }
        System.out.printf("The complete sentence is:\n%s",s);
        scan.close();
    }
}