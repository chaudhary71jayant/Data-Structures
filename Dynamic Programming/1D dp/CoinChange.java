// Coin change Problem leetcode
import java.util.Arrays;


public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.print("The min coins required are : "+ coinChange(coins, amount));
    }

    static int coinChange(int[] coins,int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);

        int ans = count(dp, coins, amount);

        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }

    static int count(int[] dp,int[] coins,int amount){
        if(amount == 0) return 0;
        if(amount < 0 ) return Integer.MAX_VALUE;

        if(dp[amount] != -1) return dp[amount];

        int ans = Integer.MAX_VALUE;

        for(int coin : coins){
            int res = count(dp, coins,  amount-coin);

            if(res != Integer.MAX_VALUE){
                ans = Math.min(ans, 1+res);
            }
        }
        return dp[amount] = ans;
    }
}
