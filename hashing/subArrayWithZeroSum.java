package hashing;

import java.util.HashSet;

public class subArrayWithZeroSum {
    static boolean naive(int[] a , int n) // O(n^2) - T.c
    {
        for (int i = 0;i<n;i++) //i =0 j = 0 , curr_sum = 4,
            // j = 1 , curr_sum = 1, curr sum mai pichle wala add hota jaa rha
            //j = 2 , curr_sum = 3 , jaise ke hume subarray mtlb ek sath waalo ka chaiye tha na
            // j =3 , curr_sum = 4
        {
            int curr_sum = 0;
            for(int j = i;j<n;j++)
            {
                curr_sum += a[j];
                if(curr_sum == 0)
                    return true;
            }
        }
        return false;
    }
    // prefix_sum + hashing technique
    // a0,a1
    // check notepad
    static boolean optimal(int a[], int n)  // O(N)
    {
        HashSet<Integer>hs = new HashSet<>();
        int prefix_sum = 0;
        for(int i = 0 ; i<n;i++)
        {
            prefix_sum += a[i]; // har subarray element ka sum add kr do
            if(hs.contains(prefix_sum)) // phir check karna allready exist karta hai kya
                return true;
            if(prefix_sum == 0) // yeh isseliye ke hs mai to 0 hoga nhi jiske chalte ans galat milega
               return true;
            hs.add(prefix_sum);
        }
        return false;
    }
    public static void main (String[] args)
    {
        int arr[] = new int[]{-3,2,1,4};
        int n = arr.length;

        System.out.println(optimal(arr, n));

    }
}
