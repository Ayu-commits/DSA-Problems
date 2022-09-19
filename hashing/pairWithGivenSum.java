package hashing;

import java.util.HashSet;

public class pairWithGivenSum {
    public static void main (String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(optimal(arr, len, x));

    }

    static boolean naive(int a[], int n , int x) //O(N^2) T.c
    {
        for(int i = 0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(a[i]+a[j]== x);
                {
                    return true;
                }
            }

        }
        return  false;
    }
    static boolean optimal(int a[] , int n , int x) // O(N)t.c ,(hash table generally take O(N) space complexity)
    {
        HashSet<Integer>hs = new HashSet<Integer>();
        for(int i = 0;i<n;i++)
        {
            if(hs.contains(x - a[i]))
            {
                return true;
            }
            hs.add(a[i]);

        }
        return false;

    }
}
