import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        // 思路一 排序+遍历
        // 结果：
        // 53/53 cases passed (5 ms)
        // Your runtime beats 11.83 % of java submissions
        // Your memory usage beats 86.77 % of java submissions (38.4 MB)
        Arrays.sort(nums);
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] == nums[index - 1]) {
                return nums[index];
            }
        }
        return 0;
    }
}
// @lc code=end
