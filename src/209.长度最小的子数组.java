import org.omg.CORBA.MARSHAL;

/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        // //思路一 O(n)时间复杂度解法
        // //结果15/15 cases passed (3 ms)
// Your runtime beats 29.72 % of java submissions
// Your memory usage beats 87.58 % of java submissions (38.4 MB)
        // if (nums.length == 0)
        //     return 0;
        // int start = 0;
        // int end = start + 1;
        // int minLength = Integer.MAX_VALUE;
        // int result = 0;
        // int sum = nums[start] + nums[end];
        // while (start < end && end < nums.length) {
        //     if (nums[start] >= s || nums[end] >= s) {
        //         minLength = 1;
        //         return minLength;
        //     }
        //     if (sum >= s) {
        //         minLength = Math.min(minLength, end - start + 1);
        //         result = minLength;
        //         sum = sum - nums[start];
        //         start++;
        //     } else {
        //         if (end == nums.length - 1) {
        //             end++;// 跳出循环
        //         } else {
        //             end++;
        //             sum = sum + nums[end];
        //         }
        //     }
        // }
        // return result;

    }
}
// @lc code=end
