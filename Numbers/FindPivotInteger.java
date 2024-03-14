package Numbers;

public class FindPivotInteger {

    public static int findPivot(int n)
    {
        if(n==1)
          return 1;
        
        for(int i=1;i<=n;i++)
        {
            int leftSum = (i*(i+1))/2;
            int rightSum = (n*(n+1))/2 - (i*(i-1))/2;

            if(leftSum == rightSum)
              return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 8;
        int result = findPivot(n);
        System.out.println(result);
    }
    
}
