package pac.geometry;
import pac.geometry.*;
public class calculate extends Rectangle {
    @Override
    public void dim(int length,int breadth){
        super.length=length;
        super.breadth=breadth;
    }
    public void area(){
        System.out.printf("the area of rectangle is %d\n",(length*breadth));
    }

}
