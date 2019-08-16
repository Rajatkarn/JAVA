
package MultiThreading_By_Implementing_Runable_Interface;
public class A implements Runnable {

    @Override
    public void run() {
        System.out.println("From Thread A:1");
        System.out.println("From Thread A:2");
        System.out.println("From Thread A:3");
        System.out.println("From Thread A:4");
        System.out.println("Exiting From A.");
    }
     
}
