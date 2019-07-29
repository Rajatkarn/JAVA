package ArrayProblem;
public class ArrayMax {
    static int max(int a[])
    {
        int r=0;
        for(int x:a)
        {
            if(r<a[x])
            {
                r=a[x];
            }
  
        }
        return r;
    }
    
}
