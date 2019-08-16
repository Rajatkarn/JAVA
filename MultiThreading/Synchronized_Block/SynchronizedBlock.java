package Synchronized_Block;
public class SynchronizedBlock {
    public static void main(String args[])
    {
        Math obj = new Math();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
        
    }
}
