package array;

public class freqArray {
    public static void printFreq(int arr[], int n)
    {
        int freq = 1, i =1;
        while(i<n)              //T.C = O(N)
        {
            while (i<n && arr[i]==arr[i-1])  // check kr piche wala element equal hai ke nhi
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq); // loop break ho rha hai yha
            i++;
            freq = 1;
        }
        if(n == 1||arr[n-1]!=arr[n-2])   // jb ek element ho ya phir ,
            // last element 2 nd last element ke equal na ho
        {
            System.out.println(arr[n-1]+" " + 1);
        }

    }
    public static void main(String args[])
    {
        int arr[] = {10, 10, 20, 30, 30, 40}, n = 6;

        printFreq(arr, n);

    }

}
