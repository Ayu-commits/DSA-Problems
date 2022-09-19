package array;

// arr[]= {1 5 3 8 12 }
// 1 ko khareda 5 ko sell-> 4 profit , 3 ko khareda 12 ko sell->9 profit
// O/P: 13
// sorted in decreasing never make profit
public class stockBuySell {
    public static int maxProfit(int price[], int start , int end)
    {
        if(end<=start)
            return 0;
        int profit = 0;
        for(int i = start;i<end;i++)
        {
            for(int j = i+1;j<=end;j++)
            {
                if(price[j]>price[i])
                {
                    int curr_profit = price[j]-price[i]
                            +maxProfit(price, start, i-1)// max profit left side of i
                            +maxProfit(price, j+1, end); // max profit right side of j
                    profit= Math.max(profit,curr_profit); // phir yha j ko badha ke ke dekhega
                }
            }
        }
        return profit;
    }
    public static int OptiMax(int price[], int n) //O(n)
    {
        int profit = 0;
        for(int i =1;i<n;i++)  // jb km ho value left side waale ko tb hee substract karna
            // hoga righ side waale se
        {
            if(price[i]>price[i-1])
                profit +=(price[i]-price[i-1]);
        }
        return profit;
    }
    public static void main(String args[])
    {
        int arr[] = {1, 5, 3, 8, 12}, n = 5;

        System.out.println(OptiMax(arr,n));

    }

}
