package array;

import static java.lang.Math.max;
import static java.lang.Math.min;

//arr[] = { 3 0 1 2 5}
//O/p : 6
// ek to 3 aur zero ke beech mai hoga save = 3,1 se 5 ke beech mai = 2 , 2 se 5 ke beech
// increasing ya decreasing order mai zero paani aayega
// sabse corner pe store karne need nhi hai kyuki left of left aur right of right dono hee side kuch nhi le sakte
public class TrappingRain {
    static int  getWater(int arr[], int n)   //O(N^2)
    {
        int res = 0;
        for(int i =1;i<n-1;i++) // i =0 lena nhi aur last wala bhi nhi lena
        {
            int lmax = arr[i];
            for(int j =0;j<i;j++)  // leftmaximum nikal rahe hai
                lmax = Math.max(arr[j],lmax);

            int rmax = arr[i];
            for(int j = i+1;j<n;j++)   // rightmaximum nikal rahe hai
                rmax = Math.max(rmax,arr[j]);

            res = res + (min(lmax,rmax)-arr[i]); //lmax = 3 , rmax= 5 ,min = 3, res[i]= 3 - arr[i];
        }
        return res;
    }

    static int OptimalGetwater(int arr[], int n) //  5 0 6 2 3
    {
        int res = 0;
        int lmax[]= new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for(int i = 1 ;i<n;i++)
        {
            lmax[i] = max(arr[i],lmax[i-1]);    //lmax= 5 5 6 6 6
        }
        rmax[n-1]=arr[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rmax[i]= max(arr[i],rmax[i+1]);
        }

        for(int i =1;i<n-1;i++)
        {
            res = res + (min(lmax[i],rmax[i]-arr[i]));     //6 6 6 3 3
        }
        return res;

    }

    public static void main(String args[])
    {
        int arr[] = {5, 0, 6, 2, 3}, n = 5;

        System.out.println( OptimalGetwater(arr, n));

    }
}

