package Synchronized_Block;
public class MyThread1 extends Thread {
    Math m;
    MyThread1(Math t){
        m=t;
    }
    @Override
    public void run(){
        m.add(5,7);
    }
}
