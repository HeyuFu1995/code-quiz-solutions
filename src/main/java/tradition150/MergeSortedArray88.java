package tradition150;

import java.util.Arrays;

public class MergeSortedArray88 {

    private class TestCase {
        static int[] nums1 = {1,2,3,0,0,0};
        static int m = 3;
        static int[] nums2 = {2, 5, 6};
        static int n = 3;
    }

    public static void solution() {

    }

    /**
     * Solution One
     * Time Complexity: O((m + n)log(m + n))
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Merge two Arrays
        for(int pointer = m; pointer < m + n; pointer++) {
            nums1[pointer] = nums2[pointer - m];
        }
        //Sort Array
        Arrays.sort(nums1);
    }

    /**
     * Solution 2
     * Time Complexity: O(m + n)
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        //Two pointer
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int insertPosition = m + n - 1;

        //Use two pointer iterated nums1 and nums2, from large to small
        //High position are empty will not influence origin value
        while(pointer1 >= 0 || pointer2 >= 0) {
            if(pointer1 < 0) {
                nums1[insertPosition--]  = nums2[pointer2--];
            }
            else if(pointer2 < 0) {
                nums1[insertPosition--] = nums1[pointer1--];
            }
            //which one is larger then put it at back
            else if(nums1[pointer1] <= nums2[pointer2]) {
                nums1[insertPosition--] = nums2[pointer2--];
            }
            else {
                nums1[insertPosition--] = nums1[pointer1--];
            }
        }
    }

}
