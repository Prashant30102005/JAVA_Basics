package pac.geometry;
import pac.geometry.*;
public class calci extends Circle{
    public void dim(int radius){
        super.radius=radius;
    }
    public void area(){
        System.out.printf("the area of circle is %f\n",(Math.PI*Math.pow(radius,2)));
    }
}

