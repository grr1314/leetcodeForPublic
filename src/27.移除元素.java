import java.io.FileFilter;

/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return nums.length;
        int newIndex = 0;//表示新数组的下标
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[newIndex]=nums[index];
                newIndex++;
            }
        }
        return newIndex;
    }
}
// @lc code=end
