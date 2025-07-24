package Multithreading_and_ExceptionHandling;
class Type1 extends Thread{
    public Type1(String string) {
        super(string);
    }

    @Override
    public void run(){
        System.out.println("Type 1");
    }
}
class Type2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Type 2");
    }

    
}
public class Implement {
    public static void main(String[] args) {
        try {
            while (true) {
                Type1 t1 = new Type1("Type 1");
                Type2 t = new Type2();
                Thread t2 = new Thread(t,"type 2");
                t1.start();
                Thread.sleep(1000);
                t1.join();
                t2.start();
                t2.join();
                Thread.sleep(1000);

            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
