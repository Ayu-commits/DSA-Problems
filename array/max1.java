package array;

public class max1 {
        static int maxCons(int arr[],int n )  //O(n^2)
        {
            int res = 0;
            for(int i =0;i<n;i++)
            {
                int curr =0;
                for(int j =i;j<n;j++)
                {
                    if(arr[j]==1)
                        curr++;
                    else break;

                }
                res = Math.max(curr,res);
            }
            return res;

        }
        static int opt(int arr[], int n)  //O(n)
        {
            int res =0,curr=0;
            for(int i =0;i<n;i++)
            {
                if(arr[i]==0)
                    curr=0;
                else {
                    curr++;
                    res = Math.max(res,curr);
                }

            }
            return res;
        }


    public static void main(String args[])
    {
        int arr[] = {0, 1, 1, 1, 0, 1, 1}, n = 7;

        System.out.println( opt(arr, n));

    }
}
