package ArrayProblem;
public class ArrayMin {
    static int min(int a[])
    {
        int r =a[0];
        for(int x:a)
        {
            if(r>a[x])
            {
                r=a[x];
            }
        }
        return r;
    }
    
}
