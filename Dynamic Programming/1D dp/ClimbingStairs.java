//climbing stairs leetcode 70
import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.print("The number of ways are : " + climbStairs(3));
    }

    static int climbStairs(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return count(n,dp);
    }

    static int count(int n, int[] dp){
        if(n <= 1) return 1;

        if(dp[n] != -1) return dp[n];

        return dp[n] = count(n-1,dp) + count(n-2, dp);
    }
}
