package Oops;
abstract class Pen{
    abstract void refil();
}
interface refil{
    abstract void changeNib();
}
public class FountainPen extends Pen implements refil {
    int refil = 5;
    int nib = 1;
    @Override
    void refil() {
        System.out.printf("pen refil is changing%n");
        this.refil = 5;
    }
    @Override
    public void changeNib() {
        System.out.printf("nib is changing%n");
        this.nib = 1;
    }    
    void write(){
        if (this.refil==0||this.nib==0) {
            System.out.println("pen is empty change nib");
        }
        else{
            System.out.printf("Writing ...%n");
            this.refil--;
            this.nib--;
        }
    }
    public static void main(String[] args) {
        FountainPen f = new FountainPen();
        f.write();
        f.write();
        f.changeNib();
        f.write();
        f.changeNib();
        f.write();
        f.changeNib();
        f.write();
        f.changeNib();
        f.write();
        f.changeNib();
        f.refil();
    }
}
