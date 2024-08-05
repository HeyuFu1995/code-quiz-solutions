package tradition150;

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
}
