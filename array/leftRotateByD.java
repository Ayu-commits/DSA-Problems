package array;
// arr[] = 1 2 3 4 5
// d = 2
// arr[] = 3 4 5 1 2

// method 1 (Naive): T.c = O(nd) S.c = O(1)
public class leftRotateByD {
    public static void leftRotateOne(int arr[], int n)
    {
       int temp = arr[0];
       for(int i =1;i<n;i++)
       {
           arr[i-1] = arr[i];
       }
       arr[n-1] = temp;
    }
    public static void leftRotate(int arr[],int d ,int n)
    {
        for(int i = 0;i<d;i++)
        {
            leftRotateOne(arr, n);
        }

    }
    public static void betterleft(int arr[],int d, int n) //t.c = O(n+d) = O(n)
    {
        // S.c= O(d)
        int temp[]= new int[d];
        for (int i =0;i<d;i++)     // isme temp ko move kra rhae temp[] = 1 2 O(d)
        {
            temp[i] = arr[i];
        }
        for(int i = d;i<n;i++)   //O(n-d)  uske baad shift kr do baaki elements ko arr[] = 3 4 5 4 5 yeh last ka 4 5
            // pehle se tha
        {
            arr[i-d] = arr[i];
        }
        for (int i = 0;i<d;i++) // O(d) phir last ke do waale position pe temp array daal do arr[]= 3 4 5 1 2
        {
            arr[n-d+1]= temp[i];
        }

    }
    public static void reversal(int arr[], int d , int n)
    {
        // 1 2  3 4 5
        reverse(arr,0,d-1); // 2 1 3 4 5   O(d)
        reverse(arr,d,n-1);  // 2 1 5 4 3       O(n-d)
        reverse(arr,0,n-1); //  3 4 5 1 2   O(n)    = O(2n) = O(n) = T.c , s.c = O(1)

    }
    public static void reverse(int arr[], int low , int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

        System.out.println("Before Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        reversal(arr, d, n);

        System.out.println("After Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
