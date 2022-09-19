package array;
// arr[j] - arr[i] (j>i) find maximum differnce
public class MaximumDiffernce {
    static int maxDiff(int arr[],int n)  // O(N^2)
    {
        int res = arr[1] - arr[0]; // pehle ek differnce
        for (int i = 0; i < n-1; i++)  // phir pehla elment select
        {
            for(int j =i+1;j<n;j++)    // ab saree right sdie ko lega
            {
                int diff = arr[j] - arr[i];  // difference nikal lo haar element
                if (diff > res)
                    res = diff;
            }
        }
        return res;
    }
    static int Optimal(int arr[], int n )
    {
        int res = arr[1]- arr[0];
        int minVal = arr[0];
        for(int j = 1; j<n; j++)
        {
            res =  Math.max(res,arr[j]-minVal);
            minVal=Math.min(minVal,arr[j]);

        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;

        System.out.println(Optimal(arr,n));
    }
}
