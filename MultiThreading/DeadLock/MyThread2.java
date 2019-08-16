package DeadLock;
public class MyThread2 extends Thread {
    String r1,r2;
    MyThread2(String s1,String s2){
        r1=s1;
        r2=s2;
    }
    public void run()    
    {
        synchronized(r2){
            System.out.println("Thread 2:Locked Resource 2");
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
            synchronized(r1){
            System.out.println("Thread 2 : locked Resource 1");
            }
        }
    }
}

