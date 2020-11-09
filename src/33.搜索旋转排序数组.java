import jdk.nashorn.internal.objects.NativeNumber;

/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        // 方法一 暴力解法
        // 问题：O(n) 不符合要求，要求是O(lgn)虽然题目没说。。。。
        // for(int index=0 ;index<nums.length;index++){
        // if(target==nums[index]) return index;
        // }
        // return -1;
        // 方法二 二分法
        if (nums.length == 0)
            return -1;
        if (nums.length == 1)
            return target == nums[0] ? 0 : -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int m = (start + end) / 2;
            if (nums[m] == target)
                return m;
            if (nums[0] <= nums[m]) {// 有序的一侧
                if (nums[0] <= target && target < nums[m]) {
                    end = m - 1;
                } else {
                    start = m + 1;
                }
            } else {// 无序的一侧
                if (nums[m] < target && target <= nums[nums.length - 1]) {
                    start = m + 1;
                } else {
                    end = m - 1;
                }
            }

        }
        return -1;
    }
}
// @lc code=end
