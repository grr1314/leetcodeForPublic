/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // // 思路一 参考80题的思路
        // // 21/21 cases passed (6 ms)
        // // Your runtime beats 9.99 % of java submissions
        // // Your memory usage beats 78.8 % of java submissions (38.8 MB)
        // int start = 0;
        // int end = nums.length - 1;
        // while (start < end) {
        // if (nums[start] == 0) {
        // int c = start;
        // while (c < end) {
        // nums[c] = nums[c + 1];
        // c++;
        // }
        // nums[end] = 0;
        // end--;
        // } else
        // start++;
        // }
        // 思路二 学习leetcode某大神解法
        // 结果：21/21 cases passed (0 ms)
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 63.4 % of java submissions (39 MB)
        int newIndex = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                nums[newIndex++] = nums[index];
            }
        }
        while (newIndex < nums.length) {
            nums[newIndex++] = 0;
        }
    }
}
// @lc code=end
