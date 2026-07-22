public class UniquePathsIII {
    public static void main(String[] args) {
        int[][] grid = {
            {1,0,0,0},
            {0,0,0,0},
            {0,0,2,-1}
        };

        System.out.print("The number of unique paths are : "+ uniquepathsIII(grid));
    }

    static int uniquepathsIII(int[][] grid){
        int count=0,startR=0,startC=0;

        for(int i = 0; i < grid.length; i++) {
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0) count++;
                if(grid[i][j] == 1){
                    startR = i;
                    startC = j;
                }
            }
        }
        return paths(grid, startR, startC, count);
    }

    static int paths(int[][] grid,int r,int c,int count){
        if(r<0 || c<0 || r>= grid.length || c>= grid[0].length || grid[r][c] == -1) return 0;

        if(grid[r][c] == 2){
            if(count == 0) return 1;
            else return 0;
        }

        int temp = grid[r][c];
        grid[r][c] = -1;
        
        if(temp == 0) count--;

        int path = paths(grid, r+1, c, count)+paths(grid, r, c+1, count)+paths(grid, r-1, c, count)+paths(grid, r, c-1, count);

        grid[r][c] = 0;

        return path;
    }
}
