
package Inter_Thread_Communication;
public class MyThread1 extends Thread{
    Shared s;
    MyThread1(Shared t)
    {
        s=t;
    }
    public void run()
    {
        System.out.println(s.withdraw());
    }
}
