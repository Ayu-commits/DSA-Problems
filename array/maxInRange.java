package array;
// when ranges are limited
// l - 1  2 3
// r - 3 5 7
// 1 se 3 ke range ke beech aur 2 se 5 phir 3 se 7 ke range ke beech
// jo number sabse jyada baar aaya hai wo result hai
public class maxInRange {
    static int Occ(int l[],int r[] , int n)
    {
        int[] arr = new int[1000];  // 0 0 0 0 00 00 00..... hashing nhi hai isseliye limit diya hai
        for(int i =0; i<n;i++)
        {
            arr[l[i]]++;     // 0 1  1 1 0 .....
            arr[r[i]+1]--;   // 0 1 1 1 -1 0 -1 0 -1....
        }
        int max = arr[0],res=0;
        for(int i =1;i<1000;i++)
        {
            arr[i] += arr[i-1];   // 0 1 2 3 2  2 1 1 0 yeh count tera uss index pe element ka
            if(max<arr[i])
            {
                max = arr[i];
                res = i;
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        int l[] = {1, 2, 3}, r[] = {3, 5, 7}, n = 3;

        System.out.println(Occ(l,r, n));

    }

}
