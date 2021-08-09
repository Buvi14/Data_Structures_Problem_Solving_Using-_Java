package Array;
import java.util.Arrays;

import Array.pair;
public class MinandMax {
    public static void main(String[] args) {
       pair p1 = getMinMax(new long[]{3, 2, 1, 56, 10000, 167}, 6);
       System.out.println(p1.first+" "+p1.second);
    }
    public static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        pair p = new pair(n, n);
        Arrays.sort(a);
        p.first=a[0];
        p.second = a[(int)n-1];
        return p;
    }
}
