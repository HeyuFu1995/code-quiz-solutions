package tradition150;

public class BestTimeToBuyAndSellStock121 {

    private class TestCase {
        static int[] prices = {7,1,5,3,6,4};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time complexity: O(n)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(price - minPrice, maxProfit);
        }

        return maxProfit;

    }


}
