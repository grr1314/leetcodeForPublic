/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0)
            return;
        int low = nums.length - 1;
        int high = nums.length - 2;
        while (high >= 0 && nums[high + 1] <= nums[high]) {
            high--;
        }
        if (high >= 0) {
            while (low >= 0 && nums[low] <= nums[high]) {
                low--;
            }
            // 如果存在高位<低位，替换
            swap(nums, high, low);
        }
        // 如果high=0 则表示类似[3,2,1]这种情况
        // 完整的倒序输出
        int start = high + 1;
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
// @lc code=end
