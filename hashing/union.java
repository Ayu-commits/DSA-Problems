package hashing;

import java.util.HashSet;

// a[] = 15, 20 , 5 , 15
// b[] = 15, 15, 15, 20 , 10
// distinct elements ko count kar lo
// 15 , 20 , 5, 10 to answer hua 4
public class union {
    static int naive(int[] a , int[]b , int m ,int n)// O((m+n)*(m+n)) T.C O aux space(M+N)
    {
        int c[] = new int[m+n];
        for(int i =0; i<m;i++)
        {
            c[i] = a[i];
        }
        for(int i =0; i<n;i++)
        {
            c[m+i] = b[i];
        }
        int res = 0;
        for(int i =0;i<m+n;i++) // check kr pichla element match ho rha piche waale element se ya nhi
        {
            boolean flag = false;
            for(int j =0; j<i;j++)
            {
                if(c[i]==c[j])
                {
                    flag = true;
                     break;
                }

                if(flag == false)
                    res++;

            }

        }
        return res;

    }
    static int Optimal(int a[],int b[], int m , int n ) //O(m+n) T.c and S.C
    {
        HashSet<Integer>s = new HashSet<Integer>();
        for(int i =0;i<m ; i++)
        {
            s.add(a[i]);
        }
        for(int j = 0 ; j<n;j++)
        {
            s.add(b[j]);
        }
        return s.size();
    }
    public static void main (String[] args) {
        int arr1[] = new int[]{2, 8, 3};
        int arr2[] = new int[]{8,3};
        int m = arr1.length;
        int n = arr2.length;

        System.out.println(naive(arr1, arr2,m, n));
    }
}
