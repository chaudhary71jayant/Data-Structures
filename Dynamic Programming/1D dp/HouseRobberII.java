import java.util.*;

public class HouseRobberII {

    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = robLinear(nums, 0, n-2, dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = robLinear(nums, 1, n-1, dp2);

        return Math.max(case1, case2);
    }

    int robLinear(int[] nums, int start, int end, int[] dp) {
        if(start == end) return nums[start];
        if(start == end-1) return Math.max(nums[start], nums[end]);

        if(dp[end] != -1) return dp[end];

        int skip = robLinear(nums, start, end-1, dp);
        int take = nums[end] + robLinear(nums, start, end-2, dp);

        return dp[end] = Math.max(skip, take);
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};

        HouseRobberII solver = new HouseRobberII();
        int result = solver.rob(nums);

        System.out.println("Maximum money that can be robbed: " + result);

        
    }
}
