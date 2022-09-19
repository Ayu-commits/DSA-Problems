package array;

class moveAllZeroes
{
    static void moveToEnd(int arr[], int n)   // naive approach T.C = O(N^2)
    {
        for(int i =0;i<n;i++)  // yeh check karega 0 waale element ko
        {
            if(arr[i]==0)
            {
                for(int j = i+1;j<n;j++)  // yeh non zero element
                {
                    if(arr[j]!=0)
                    {
                        int temp = arr[i]; // Jaise hee dikhe swap kr dena non zero element ko zero se
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

    }
    static void optimalMoveToEnd(int arr[],int n)
    {
        int count = 0;    // yeh track rakhega non zero elements ka
        for (int i = 0; i<n;i++)
        {
            if(arr[i]!=0)    // jb non zero elements mile to swap kr do
            {
                int temp = arr[count];  // isse yeh hoga ke count mai zero element pe aake
                arr[count] = arr[i];  // ruk jayega jisko baad mai non zero element se swap kr do
                arr[i] = temp;
                count++;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]= {8,12,0,0,15,10},n=6;
        System.out.println("Before operation");
        for (int i = 0 ;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        optimalMoveToEnd(arr,n);
        System.out.println("After operation");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
