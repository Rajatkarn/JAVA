package Inter_Thread_Communication;
public class Shared {
    int flag =0 , data = 0;
    synchronized void submit()
    {
        flag=1;
        try{
            Thread.sleep(200);
        }catch(Exception e){
        System.out.println(e);
    }
        data =10000;
        System.out.println("Value Submitted");
        notify();
    }
    synchronized int withdraw()
    {
        if(flag==0)
        {
            try{
                System.out.println("Wait Block");
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return data;
    }
}
