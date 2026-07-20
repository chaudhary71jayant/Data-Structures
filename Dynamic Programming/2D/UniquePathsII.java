import java.util.Arrays;



public class UniquePathsII {
    public static void main(String[] args) {
        int[][] grid = {
            {0,0,0},
            {0,1,0},
            {0,0,0},
        };

        int r = grid.length;
        int c = grid[0].length;

        int[][] dp = new int[r][c];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        System.out.println(paths(grid, r-1, c-1,dp));
    }

    static int paths(int[][] grid,int r,int c,int[][] dp){
        if(grid[r][c] == 1) return 0;
        if(r==0 && c == 0) return 1;

        if(dp[r][c] != -1) return dp[r][c];

        int right=0,down=0;
        if( r > 0) right = paths(grid, r-1, c,dp);
        if( c > 0) down = paths(grid, r, c-1,dp);

        return dp[r][c] = right+down;
    }
}
