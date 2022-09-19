package array;
// 1 4 20  3 10 5 , sum  = 33
// Yes
// only for non negative number
public class subArraySum {
    static boolean naive(int [] arr, int n , int givenSum)
    {
        for( int i =0;i<n;i++)
        {
            int sum = 0;
            for(int j =i;j<n;j++)
            {
                sum += arr[j];
                if(sum == givenSum )
                    return true;
            }
        }
        return false;
    }
    static boolean subArraySumOp(int [] arr, int n , int sum)
    {
        int curr = arr[0], start = 0,end;
        // start point le rha
        for(end = 1; end<n;end++)
        {
            // jb curr_sum jyada ho jaaye given sum se
            while(curr >sum && start < end-1)
            {
                curr = curr - arr[start];
                start++;
            }

            // jb sum mil jaaye given sum ke equal
            if(curr == sum)
            {
                int p = end -1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return true;
            }
            if(end<n)
            {
                curr = curr + arr[end];
            }

        }
        System.out.println("No subarray found");
        return false;
    }
    public static void main(String[] args)
    {
        subArraySum s = new subArraySum();
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        subArraySum.subArraySumOp(arr, n, sum);
    }
}
