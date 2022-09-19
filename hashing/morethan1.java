package hashing;

// arr [] = 30 10 20 20 10 20 30 30  , k = 4
// 20 30


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class morethan1 {
    static void printNByK(int[] arr, int n, int k)
    {
        Arrays.sort(arr);  // O(NlogN) + O(N) = O(NlogN)
        int i = 1 , count = 1;
        while(i<n)
        {
            while(i<n && arr[i]==arr[i-1])  // Pichle element se match karega
            {
                count++;     // true then count
                i++;
            }
            if(count> n/k)
                System.out.println(arr[i-1] + " ");
            count = 1;
            i++;
        }
    }
    static void printNByKO(int arr[], int n, int k)  // O(N) T.c hashing based
    {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int x : arr)
        {
            m.put(x,m.getOrDefault(x,0)+1);  // getOrDefault use karte taaki value ko object aur default value store karne ke liye
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            if(e.getValue()>n/k)
                System.out.print(e.getKey()+ " ");
        }
    }
    // when k is small and n is very large O(nk) T.c
    public static void main (String[] args)
    {
        int arr[] = new int[]{10, 10, 20, 30, 20, 10,10};

        int n = arr.length;
        int k=2;
        printNByKO(arr, n, k);

    }

}
