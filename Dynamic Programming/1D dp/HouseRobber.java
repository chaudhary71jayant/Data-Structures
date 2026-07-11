//House robber 1
import java.util.Arrays;



public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = {1,2,3,1};
        System.out.println(maxProfit(houses));
    }

    static int maxProfit(int[] houses){
        int n = houses.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return check(houses,dp,n-1);
    }

    static int check(int[] houses,int[] dp,int i){
        if(i<0) return 0;
        if(i==0) return houses[0];
        if(i == 1) return Math.max(houses[0], houses[1]);

        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max(check(houses, dp, i-1), houses[i]+ check(houses, dp, i-2));
    }
}
