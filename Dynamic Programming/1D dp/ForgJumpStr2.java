// Frog jump GFG variation if the steps are allowed k instead of 2

import java.util.*;

public class ForgJumpStr2 {
    public static void main(String[] args) {
        int[] heights = {30, 10, 60, 10, 60, 50};
        int k = 2;

        System.out.print("The minimum cost to reach the top is : " + frogJump(heights,k));
    }

    static int frogJump(int[] heights,int k){
        int n=heights.length;
        int[] dp = new int[n];

        Arrays.fill(dp, -1);
        return count(dp, heights, n-1,k);
    }

    static int count(int[] dp,int[] heights,int i,int k){
        if(i == 0) return 0;

        if(dp[i] != -1) return dp[i];

        int mSteps = Integer.MAX_VALUE;

        for(int j=1;j<=k;j++){
            if(i-j >=0){
                int steps = count(dp, heights, i-j, k) + Math.abs(heights[i]-heights[i-j]);
                mSteps = Math.min(steps, mSteps);
            }
        }

        return dp[i] = mSteps;
    }

}
