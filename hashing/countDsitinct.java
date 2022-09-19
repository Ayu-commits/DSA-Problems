package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class countDsitinct
{
    static int countDistinct(int arr[] , int n)
    {
        HashSet<Integer> s = new HashSet<>();
        for(int i =0;i<n;i++)
        {
            s.add(arr[i]);
        }
        return s.size();
    }
//    static int countDistinctimproved(int[] arr, int n)
//    {
//       // HashSet<Integer>s = new HashSet<>(Arrays.asList(arr));
//       // return s.size();
//    }
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;

        System.out.println(countDistinct(arr, n));
    }

}
