package hashing;

import java.util.HashSet;

// distinct common count element
public class Intersection {
    static int naive(int[] a , int[] b , int m , int n) //O(m*(m+n)
    {
        int res = 0;
        for(int i =0;i<m;i++)
        {
            boolean flag = false;
            for(int j =0;j<i-1;j++) // yeh check karega ke a[] mai element pehle se to nhi tha
            {
                if(a[j]==a[i])
                {
                    flag = true;
                    break;
                }
                if(flag == true) continue; // agr tha to skip maar do aage waale for loop pe nhi jayega
            }
            for(int j = 0; j<n;j++ )
            {
                if(a[i]==b[j])
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
    static int Optimal(int a[], int b[], int m , int n)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i =0;i<m;i++)
        {
            hs.add(a[i]);
        }
        int res = 0;
        for(int j =0;j<n;j++)
        {
            if(hs.contains(b[j]))
            {
                res++;
                hs.remove(b[j]);
            }
        }
        return res;

    }

    public static void main (String[] args) {
        int a[] = new int[]{15, 17, 27, 27, 28, 15};
        int b[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = a.length;
        int n = b.length;

        System.out.println(naive(a, b, m, n));
    }

}
