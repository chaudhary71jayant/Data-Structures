//Number of unique paths when there is an obstacle in between
public class Question4 {
    public static void main(String[] args) {
        int[][] grid = {
            {0,0,0},
            {0,1,0},
            {0,0,0},
        };

        int r = grid.length;
        int c = grid[0].length;

        
        System.out.println(paths(grid, r-1, c-1));
    }

    static int paths(int[][] grid,int r,int c){
        if(grid[r][c] == 1) return 0;
        if(r==0 && c == 0) return 1;

       
        int right=0,down=0;
        if( r > 0) right = paths(grid, r-1, c);
        if( c > 0) down = paths(grid, r, c-1);

        return right+down;
    }
}
