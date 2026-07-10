//Leetcode 62
import java.util.Arrays;


public class UniquePaths {
    public static void main(String[] args) {
        System.out.print("The number of unique paths are : " + uniquePaths(3, 7));
    }

    static int uniquePaths(int m,int n){
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return count(m,n,dp);
    }

    static int count(int m,int n,int[][] dp){
        if(m==1 || n==1) return 1;

        if(dp[m][n] != -1) return dp[m][n];

        return dp[m][n] = count(m-1, n, dp) + count(m, n-1, dp);
    }
}
