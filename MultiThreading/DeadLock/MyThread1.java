package DeadLock;
public class MyThread1 extends Thread{
    String r1,r2;
    MyThread1(String s1,String s2){
        r1=s1;
        r2=s2;
    }
    public void run()    
    {
        synchronized(r1){
            System.out.println("Thread 1:Locked Resource 1");
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
            synchronized(r2){
            System.out.println("Thread 1 : locked Resource 2");
            }
        }
    }
}
