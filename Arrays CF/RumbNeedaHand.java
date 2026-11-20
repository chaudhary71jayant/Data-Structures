
import java.util.Scanner;

public class RumbNeedaHand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            if (isPossible(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean isPossible(int[] nums) {

        int n = nums.length;

        int left = -1;
        int right = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {

                if (left == -1) {
                    left = i;
                }

                right = i;
            }
        }

        if (left == -1) {
            return true;
        }

        int[] wrongPositions = new int[right - left + 1];
        int count = 0;

        for (int i = left; i <= right; i++) {
            if (nums[i] != i + 1) {
                wrongPositions[count++] = i;
            }
        }

        int l = 0;
        int r = count - 1;

        while (l < r) {

            int pos1 = wrongPositions[l];
            int pos2 = wrongPositions[r];

            int temp = nums[pos1];
            nums[pos1] = nums[pos2];
            nums[pos2] = temp;

            l++;
            r--;
        }

        for (int i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                return false;
            }
        }

        return true;
    }
}
