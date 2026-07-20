
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode1260 {
    public static void main(String[] args) {
        int[][] grid = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int k=1;

        List<List<Integer>> list = shiftGrid(grid,k);

        System.out.print(list);

    }

    public static List<List<Integer>> shiftGrid(int[][] grid,int k){
        int m= grid.length;
        int n = grid[0].length;
        int total = m*n;

        k = k%total;

        List<Integer> flatList = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flatList.add(grid[i][j]);
            }
        }
        reverse(flatList, 0, total-1);
        reverse(flatList, 0, k-1);
        reverse(flatList, k, total-1);

        List<List<Integer>> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(flatList.get(index++));
            }
            list.add(row);
            
        }
        return list;
    }

    private static void reverse(List<Integer> list,int start,int end){
        while(start<end){
            Collections.swap(list, start, end);

            start++;
            end--;
        }
    }
}
