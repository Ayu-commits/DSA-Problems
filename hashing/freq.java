package hashing;
// order fix nhi hai output ka , java mai linked hashmap use hota
import java.util.HashMap;
import java.util.Map;

public class freq {
    static void countFreq( int[] arr ) // auxSpace = O(n) , T.C = O(n)
    {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i : arr)
        {
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hs.entrySet())
            System.out.println(e.getKey()+ " " +e.getValue());
    }

    public static void main (String[] args)
    {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;

        countFreq(arr);
    }
}
