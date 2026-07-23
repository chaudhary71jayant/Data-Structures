import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 2, 3 },
                { 11, 12, 13, 4 },
                { 10, 15, 14, 5 },
                { 9, 8, 7, 6 },
        };
        List<Integer> ans = spiral(matrix);

        System.out.println(ans);
    }

    static List<Integer> spiral(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length-1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
