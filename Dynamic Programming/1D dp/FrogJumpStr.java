//GFG Frog jump
import java.util.*;
public class FrogJumpStr {
    public static void main(String[] args) {
        int[] heights = {2, 1, 3, 5, 4};

        System.out.print("The minimum cost to reach the top is : " + frogJump(heights));
    }

    static int frogJump(int[] heights){
        int n=heights.length;
        int[] dp = new int[n];

        Arrays.fill(dp, -1);
        return count(dp, heights, n-1);
    }

    static int count(int[] dp,int[] heights,int i){
        if(i == 0) return 0;

        if(dp[i] != -1) return dp[i];

        int two = Integer.MAX_VALUE;

        int one = count(dp, heights, i-1) + Math.abs(heights[i]-heights[i-1]);

        if(i > 1){
            two = count(dp, heights, i-2) + Math.abs(heights[i] - heights[i-2]);
        }

        dp[i] = Math.min(one, two);
        return dp[i];
    }
}
