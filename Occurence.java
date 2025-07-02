import java.util.Scanner;
public class Occurence{
    public static int Occurence_num(int[] a,int num){
        int x = 0;
        for(int b:a){
            if(b==num){
                x++;
            }
        }
        return x;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] a = new int[n];
        int i =0;
        while(i<n){
            System.out.println("Enter value at index "+i);
            a[i]=s.nextInt();
            i++;
        }
        System.out.println("Enter the element to find the number of occurence");
        int num = s.nextInt();
        int occ = Occurence_num(a, num);
        System.out.println("The element "+num+" occur at "+occ+" times");
        s.close();
    }
}