package ArrayProblem;
public class ArrayMain {
    public static void main(String args[])
    {
        int ar[] = new int[]{4,6,8,3,8,4,6,3,8,3,8};
        ArrayPrint.print(ar);
        System.out.println("Addition : "+ ArrayAddition.add(ar));
        System.out.println("Maximum : "+ ArrayMax.max(ar));
        System.out.println("Minimum : "+ ArrayMin.min(ar));
        ArrayFreq.Freq(ar);
    }
    
}
