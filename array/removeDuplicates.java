package array;

public class removeDuplicates {
    public static int remDups(int arr[],int n){   //T.C=O(n), S.C = O(N)
        int temp[] = new int[n]; // creating new array with same size
        temp[0] = arr[0];  // pehle array element ko copy kr rha
        int res = 1;  // size of temp jisse baad mai return kr dege
        for(int i =1; i < n;i++)
        {
            if(temp[res-1]!=arr[i])// sorted hai to keval aage waale se compare karo
            {
               temp[res] = arr[i];
               res++;
            }
        }
        for(int i = 0;i<n;i++)
        {
            arr[i] = temp[i];
        }
        return res;

    }
    public static int OptimalremDups(int arr[],int n)  //T.C=O(N), SC= O(1)
    {
        int res = 1 ; // used for storing the size after sorting
        for(int i = 1;i<n;i++) // ek aage se chal rha hai loop
        {
            if(arr[res-i]!=arr[i])  // yha pr arr[0] agr not equal hota arr[1] ke to
            {
                    arr[res]=arr[i]; //
                    res++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]=  {10, 20, 20, 30, 30, 30}, n = 6;
        System.out.println("Before approach");
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n = OptimalremDups(arr,n);
        System.out.println("After traversal");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }



    }
}
