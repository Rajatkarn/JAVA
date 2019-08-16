package DeadLock;
public class Deadlock {
    public static void main(String args[])
    {
        String resource1="Hello";
        String resource2="Rajat";
        new MyThread1(resource1,resource2).start();
        new MyThread2(resource1,resource2).start();
    }
    
}
