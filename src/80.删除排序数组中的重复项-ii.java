/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
class Solution {
    // [1,1,1,2,2,3]
    public int removeDuplicates(int[] nums) {
        // // 思路一 双指针？？？？
        // int start = 1;
        // int end = nums.length - 1;
        // int count = 1;
        // while (start <= end) {
        // if (nums[start] == nums[start - 1]) {
        // count++;
        // if (count > 2) {
        // int c = start;
        // while (c <= end) {
        // nums[c - 1] = nums[c];
        // c++;
        // }
        // end--;
        // count--;
        // start--;
        // }
        // } else {
        // count = 1;
        // }
        // start++;
        // }
        // return end + 1;

        // 思路二 基于思路一的修改
        int start = 0;
        int count = 1;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] == nums[start + 1]) {
                count++;
                if (count > 2) {
                    int c = start + 1;
                    while (c < end) {
                        nums[c] = nums[c + 1];
                        c++;
                    }
                    count--;
                    end--;
                    start--;
                }
            } else {
                count = 1;
            }
            start++;
        }
        return end + 1;
    }
}
// @lc code=end
