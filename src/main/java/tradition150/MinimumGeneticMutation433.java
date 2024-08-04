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

        return dfs(startGene, startGene, endGene, bankSet);
    }

    private int dfs(String preGene, String currentGene, String endGene, Set<String> bankSet) {
        int result = Integer.MAX_VALUE;
        if(currentGene.equals(endGene)) {
            return 0;
        }
        for(String s: bankSet) {
            if(compareTwoStringsGetDifferentCharNumber(s, currentGene) == 1 && !s.equals(preGene)) {
                int subResult = dfs(currentGene ,s, endGene, bankSet);
                if(subResult != -1) {
                    result = Math.min(subResult + 1, result);
                }
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int compareTwoStringsGetDifferentCharNumber(String a, String b) {
        if(a.length() != b.length()) {
            return -1;
        }
        int num = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                num++;
            }
        }
        return num;
    }
}
