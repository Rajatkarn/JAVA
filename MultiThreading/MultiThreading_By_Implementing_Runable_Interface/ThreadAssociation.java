package MultiThreading_By_Implementing_Runable_Interface;
public class ThreadAssociation {
    public static void main(String args[])
    {
        System.out.println("Hello Main");
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
        System.out.println("Bye Main");
    }
}
