package Synchronized_Block;
public class Math {
    int x,y;
    void add(int a, int b)
    {
        System.out.println("Hello");
        System.out.println("Hii");
        synchronized(this)
        {
        x=a;
        y=b;
        try{
            Thread.sleep(400);
        }catch(Exception e){
            System.out.println(e);
        }
        int r=x+y;
        System.out.println("Addition of "+x+" and "+y+" is "+r);
        }
    }
}