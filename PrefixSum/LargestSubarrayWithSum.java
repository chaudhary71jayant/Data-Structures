import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithSum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.print(maxLength(arr));
    }
    public static int maxLength(int[] arr) {
        // Your code goes here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int prefixSum = 0,maxLen=0;
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];

            if(map.containsKey(prefixSum)){
                int start = map.get(prefixSum);
                maxLen = Math.max(maxLen,i-start);
            }
            else map.put(prefixSum,i);
        }
        return maxLen;
    }
}
