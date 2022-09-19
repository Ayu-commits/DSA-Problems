package array;
// 1 2 3 4 5
// 2 3 4 5 1
import java.lang.*;
class GFG
{
    static void lRotateOne(int arr[], int n)  // T.c = O(N) , S.c = O(1)
    {
        int temp = arr[0];    // sabse pehle waale ko yha store kr lo

        for(int i = 1; i < n; i++)
        {
            arr[i - 1] = arr[i];    // ek ek left side kr lo
        }

        arr[n - 1] = temp;   // aur phir last waale ko temp mai store kra do
    }

    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;

        System.out.println("Before Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        lRotateOne(arr, n);

        System.out.println("After Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}