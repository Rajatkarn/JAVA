package Synchronized_Block;
public class MyThread2 extends Thread {
   Math m;
    MyThread2(Math t){
        m=t;
    }
    @Override
    public void run(){
        m.add(6,4);
    }
}