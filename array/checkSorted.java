package array;// a[]={8,12,15}
// o/p:Yes

public class checkSorted{
    public static boolean isSorted(int arr[],int n)
    // t.c = O(N^2) Naive approach
//    {
//        for(int i =0; i<n;i++)
//        {
//            for(int j =i+1;j<n;j++)
//            {
//                if (arr[j] < arr[i])
//                    return false;
//            }
//
//        }
//        return true;
//    }
    {
        for(int i = 1;i<n;i++)              // optimal approach  //O(N)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }

         public static void main(String arg[])
         {
             int arr[]= {8,12,15,10},n=4;
             System.out.println(isSorted(arr,n));
         }
}
// an empty array is considered as sorted array
// done with revesion on 10/09/2022
// done on 18/09/22