package MultiThreading_By_Inheriting_Thread_Class;
public class B extends Thread {
    public void run(){
        System.out.println("From Thread B:1");
        System.out.println("From Thread B:2");
        System.out.println("From Thread B:3");
        System.out.println("From Thread B:4");
        System.out.println("Exiting From Thread B.");
    }
}
