package tradition150;

public class Candy135 {
    private class TestCase {
        static int[] ratings = {1,2,3,1};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {
        int num = 1;
        int size = ratings.length;
        int[] candies = new int[size];
        candies[0] = 1;
        for(int i = 1; i < size; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
            }
            num += candies[i];
        }

        for(int i = size - 2; i >= 0; i--) {
            int currentCandy = candies[i];
            if(ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            num += candies[i] - currentCandy;
        }
        return num;
    }
}
