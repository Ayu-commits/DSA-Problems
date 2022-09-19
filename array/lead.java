package array;
import java.io.*;

public class lead {
    static void leaders (int arr[],int n) //O(N^2) T.c
    {

        for (int i = 0; i < n; i++)
        {
            boolean flag = false;
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
            {
                System.out.println(arr[i]+" ");

            }

        }

    }
    static void OptiLead(int arr[], int n)  // yeh right se leader print karega
    {
        int curr_lead = arr[n-1];  // last element to leader hota hee
        System.out.print(curr_lead+" ");
        for(int i =0;i<n-2;i++)   // second last element se compare karna shuru
        {
            if(curr_lead<arr[i])        // agr uske left side waala right side se bda hai iska mtlb
            {
                curr_lead = arr[i];
                System.out.print(curr_lead+" ");

            }
        }

    }
    public static void main(String args[])
    {
        int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;
        OptiLead(arr,n);
    }
}
