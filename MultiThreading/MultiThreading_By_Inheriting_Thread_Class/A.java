package MultiThreading_By_Inheriting_Thread_Class;
public class A extends Thread{
    public void run()
    {
        System.out.println("From Thread A:1");
        System.out.println("From Thread A:2");
        System.out.println("From Thread A:3");
        System.out.println("From Thread A:4");
        System.out.println("Exiting From Thread A.");
    }
}
