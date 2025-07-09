package pac.geometry;
abstract class Rectangle{
    public int length;
    public int breadth;
    abstract void dim(int length,int breadth);
}
abstract class Circle{
    public int radius;
    abstract void dim(int radius); 
}
