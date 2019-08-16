package MultiThreading_By_Inheriting_Thread_Class;
public class ThreadEx {
    public static void main(String args[])
    {
        System.out.println("Hello Main");
        A a = new A();
        B b = new B();
        a.start();
        b.start();
        System.out.println("Bye Main");
    }
}
