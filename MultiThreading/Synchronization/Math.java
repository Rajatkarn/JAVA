
package Synchronization;
public class Math {
    int x,y;
    synchronized void add(int a, int b)
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
