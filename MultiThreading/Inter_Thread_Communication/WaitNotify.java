package Inter_Thread_Communication;
public class WaitNotify {
    public static void main(String args[])
    {
        Shared s = new Shared();
        new MyThread1(s).start();
        new MyThread2(s).start();
    }
}
