package Interrupting_a_Thread;
public class InterruptingThreadEx extends Thread {
    @Override
    public void run()
    {
        System.out.println("Hello");
        try{
            Thread.sleep(5000);
            System.out.println("Task");
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thread is Running");
    }
    
    public static void main(String args[]){
        InterruptingThreadEx t1 = new InterruptingThreadEx();
        t1.start();
        t1.interrupt();
    }
}
