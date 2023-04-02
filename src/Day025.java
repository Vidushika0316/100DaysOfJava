public class Day025 {
    public int thirdMax(int[] nums) {

        Integer max = null, max2nd = null, max3rd = null;

        for (Integer n : nums) {
            if (n.equals(max) || n.equals(max2nd) || n.equals(max3rd)) {
                continue;
            }

            if (max == null || n > max) {
                max3rd = max2nd;
                max2nd = max;
                max = n;
            } else if (max2nd == null || n > max2nd) {
                max3rd = max2nd;
                max2nd = n;
            } else if (max3rd == null || n > max3rd) {
                max3rd = n;
            }
        }

        return (max3rd == null) ? max : max3rd;


    }
}

//Third Maximum Number

//    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
//
//
//
//        Example 1:
//
//        Input: nums = [3,2,1]
//        Output: 1
//        Explanation:
//        The first distinct maximum is 3.
//        The second distinct maximum is 2.
//        The third distinct maximum is 1.
//        Example 2:
//
//        Input: nums = [1,2]
//        Output: 2
//        Explanation:
//        The first distinct maximum is 2.
//        The second distinct maximum is 1.
//        The third distinct maximum does not exist, so the maximum (2) is returned instead.
//        Example 3:
//
//        Input: nums = [2,2,3,1]
//        Output: 1
//        Explanation:
//        The first distinct maximum is 3.
//        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//        The third distinct maximum is 1.
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1
