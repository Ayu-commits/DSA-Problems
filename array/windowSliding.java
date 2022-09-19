package array;


import java.lang.*;

import static java.lang.Math.max;

class windowSliding
{

    static int maxSum(int arr[], int n, int k)//o(n-k)ok
    {
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i + k - 1 < n; i++)
        {
            int sum = 0;

            for(int j = 0; j < k; j++)
            {
                sum += arr[i + j];
            }

            max_sum = max(max_sum, sum);
        }

        return max_sum;

    }
    // window sliding ek subtract karo leftmost elemet ko aur ek add karo right most elemet ko
    static int optimal(int [] arr, int n,int k)
    {
        int curr = 0;


        for(int i =0;i<k;i++)
        {
            curr += arr[i] +arr[i+1];
        }
        int res = curr;
        for(int i =k;i<n;i++)
        {
            curr += arr[k] - arr[k-n];
            res = max(curr,res);
        }
        return res;

    }


    public static void main(String args[])
    {
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

        System.out.println(maxSum(arr, n, k));

    }

}