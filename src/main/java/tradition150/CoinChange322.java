package tradition150;

import java.util.Arrays;

public class CoinChange322 {

    private class TestCase {
        static int[] coins = {1,2,5};

        static int amount = 11;
    }

    public static void solution() {
    }

    /**
     * Solution 1
     * Time Complexity: O(amount * coins.length)
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if(amount < 1) {
            return 0;
        }
        return coinChange(coins, amount, new int[amount]);
    }

    private int coinChange(int[] coins, int rem, int[] count) {
        if(rem < 0) {
            return -1;
        }
        if(rem == 0) {
            return 0;
        }
        if(count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for(int coin: coins) {
            int res = coinChange(coins, rem -coin, count);
            if(res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = min == Integer.MAX_VALUE ? -1 : min;
        return count[rem - 1];
    }

    /**
     * Solution2: DP
     * Time Complexity: O(amount * coins.length)
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange2(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int coin: coins) {
            if(coin <= amount) {
                dp[coin] = 1;
            }
        }

        for(int i = 0; i <= amount; i++) {
            for(int coin: coins) {
                if(i - coin > 0) {
                    if(dp[i -coin] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                    }
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
