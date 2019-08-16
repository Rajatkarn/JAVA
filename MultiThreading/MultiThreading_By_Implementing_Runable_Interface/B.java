package MultiThreading_By_Implementing_Runable_Interface;
public class B implements Runnable{

    @Override
    public void run() {
       System.out.println("From Thread B:1");
       System.out.println("From Thread B:2");
       System.out.println("From Thread B:3");
       System.out.println("From Thread B:4");
       System.out.println("Exiting from B.");
    }
    
}
