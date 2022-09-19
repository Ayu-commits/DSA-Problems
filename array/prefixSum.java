package array;

public class prefixSum {
    static int []prefix(int []arr, int n)
    {
        int []prefixSum = new int[n];   // 2 10 13 22 28 33 37
        prefixSum[0] = arr[0];
        for(int i = 1; i<n ;i++)
        {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
    static int getSum(int prefixSum[] , int l, int r)
    {
        if(l!= 0)
            return prefixSum[r]-prefixSum[l-1]; // getSum(1,3) (r = 3 , 22) -> l=( 0 ,2) -----22-2 = 20 ans
        else
            return prefixSum[r];
    }
    public static void main(String args[])
    {
        int arr[] = {2, 8, 3, 9, 6, 5, 4}, n = 7;

        int prefixSum[] = prefix(arr, n);

        System.out.println(getSum(prefixSum, 1, 3));

        System.out.println(getSum(prefixSum, 0, 2));

    }
}
