package array;

public class ReverseArray {
    public static void reverse(int arr[],int n){          //T.C = 0(N) , Aux Space = O(1)
        int low = 0, high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String arg[])
    {
        int arr[]= {8,12,15,10},n=4;
        System.out.println("Before Reverse");
        for (int i = 0 ;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        reverse(arr,n);
        System.out.println("After reverse");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
