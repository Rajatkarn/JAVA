package Inter_Thread_Communication;
public class MyThread2 extends Thread{
    Shared s;
    MyThread2(Shared t)
    {
        s=t;
    }
    public void run()
    {
        s.submit();
    }
}
