package array;



// every element is beginning element maxSum you can obtained by using this
public class MaxCircular {
    static int maxCircular(int arr[] , int n)
    {
        int res = arr[0];
        for(int i =0;i<n;i++)
        {
            int currmax = arr[i];
            int currsum = arr[i];
            for(int j = 1;j<n;j++)
            {
                int index = (i+j) % n;
                currsum += arr[index];
                currmax = Math.max(currmax,currsum);
            }
            res = Math.max(res, currmax);

        }
        return res;
    }
    public static void main(String[] args)
    {
        int arr[] = {5, -2, 3, 4}, n = 4;

        System.out.println(maxCircular(arr, n));

    }

}
