package tradition150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumGeneticMutation433 {

    private class TestCase {
        static String startGene = "AACCGGTT";
        static String endGene = "AAACGGTA";

        static String[] bank = {"AACCGATT","AACCGATA","AAACGATA","AAACGGTA"};
    }

    public static void solution() {
    }

    /**
     * Solution
     * @param startGene
     * @param endGene
     * @param bank
     * @return
     */
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>() {
            {
                addAll(Arrays.asList(bank));
            }
        };

        return backtrack(startGene, endGene, bankSet);
    }

    private int backtrack(String currentGene, String endGene, Set<String> bankSet) {
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < currentGene.length(); i++) {
            if(currentGene.charAt(i) != endGene.charAt(i)) {
                String tempGene = currentGene;
                StringBuilder builder = new StringBuilder(currentGene);
                builder.setCharAt(i, endGene.charAt(i));
                if(bankSet.contains(builder.toString())) {
                    if (endGene.contentEquals(builder)) {
                        return 1;
                    }
                    int subResult = backtrack(builder.toString(), endGene, bankSet);
                    if(subResult != -1) {
                        result = Math.min(result, subResult + 1);
                    }
                }
                currentGene = tempGene;
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
