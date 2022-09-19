
package array;
// array has point element before it same sum as after it
public class eqilibriumPoint {
    static boolean checkEq(int[] arr, int n)
    {
        for (int i =0;i<n;i++)
        {
            int lsum = 0 , rsum = 0;
            for(int j =0;j<i;j++)
                 lsum += arr[j];
            for(int j = i+1;j<n;j++)
            {
                rsum += arr[j];
            }
            if(lsum==rsum)
                return true;
        }
        return false;
    }
    // total sum nikal lo phir left right karo
    static boolean optimal(int[] arr, int n)
    {
        int sum = 0;
        for(int i =0;i<n;i++) // poora sum dedga array ka phir next loop
        {
            sum += arr[i];
        }
        int lsum =0;
        for(int j =0;j<n;j++) // yeh wala loop left waale sum ko equal kara rha yha se
        {
            if(lsum == sum - arr[j])  // yha se sum mai total tha minus kiya to right sum aajayega
                return true;
            lsum += arr[j];
            sum -= arr[j];
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {3, 4, 8, -9, 20, 6};
        int n = 6;

        System.out.println(optimal(arr, n));
    }

}
// done on 18/09/22