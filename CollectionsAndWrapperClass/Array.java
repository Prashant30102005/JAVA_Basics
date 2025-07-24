package CollectionsAndWrapperClass;
import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(0,3);
        A.add(5);
        A.add(5);
        A.add(2,5);
        A.add(1,3);
        System.out.println(A);
    }

}
