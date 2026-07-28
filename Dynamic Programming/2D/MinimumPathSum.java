
import java.util.*;
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {
            {1,3,1},
            {1,5,1},
            {4,2,1},
        };

        System.out.println("Min Path sum is : " + minPathSum(grid));
    }

    static int minPathSum(int[][] grid){
        int row=grid.length-1,col=grid[0].length-1;
        int[][] dp = new int[row+1][col+1];

        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }

        return sum(grid, row, col,dp);
    }

    static int sum(int[][] grid,int row,int col,int[][] dp){
        if (row < 0 || col < 0) return Integer.MAX_VALUE;
        if(row == 0 && col == 0) return grid[0][0];

        if(dp[row][col] != -1) return dp[row][col];
        
        int down = sum(grid, row-1, col,dp);
        int right = sum(grid, row, col-1,dp);

        return dp[row][col] = grid[row][col] + Math.min(down,right);
    }
}
