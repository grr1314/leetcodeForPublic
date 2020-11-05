/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target)
                return index;
            if (nums[index] < target)
                position++;
            else
                break;
        }
        return position;
    }
}
// @lc code=end
