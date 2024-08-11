package tradition150;

public class BestTimeToBuyAndSellStockII122 {
    private class TestCase {
        static int[] prices = {7,1,5,3,6,4};


    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int sum = 0;
        for(int i = 1; i < length; i++) {
            if(prices[i] > prices[i - 1]) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}
