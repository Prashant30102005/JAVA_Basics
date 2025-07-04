class library{
    String author;
    String title;
    boolean IsBorrowed;
    static int Total_books = 0;
    {
        Total_books++;
    }
    static void Total_books(){
        System.out.println(Total_books);
    }
    public library(String author,String title){
        this.author=author;
        this.title=title;
    }
    public library(String author){
        String title="unknown";
        this(author ,title);
    }
    public void borrow(){
        if(IsBorrowed){
            System.out.println("book is not their");
        }
        else{
            IsBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }
    public void unborrow(){
        if(IsBorrowed){
            IsBorrowed = false;
            System.out.println("book is taken");
        }
        else{
            System.out.println("Book is their");
        }
    }    
}
public class Lib{
    public static void main(String[] args) {
        library physics = new library( "HC VERMA", "PHYSICS");
        library maths = new library( "RS chouhan", "MATHS");
        physics.Total_books();
        physics.borrow();
        physics.borrow();
        maths.borrow();
        maths.borrow();     
        physics.unborrow();
        physics.unborrow();
        maths.unborrow();
        maths.unborrow();         
    }
}