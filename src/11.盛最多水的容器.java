/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // 思路一 暴力解法
        // 结果
        // Your runtime beats 5.36 % of java submissions
        // Your memory usage beats 15.21 % of java submissions (39.9 MB)
        // int result = 0;
        // for (int index = 0; index < height.length - 1; index++) {
        // for (int p = index + 1; p < height.length; p++) {
        // result = Math.max(result, (p - index) * Math.min(height[index], height[p]));
        // }
        // }
        // return result;
        // 思路二 双指针法
        // 假设水的数量是 area，那么area=minHeight*(right-left),
        // minHeight=Math.min(height[left],height[right])，固定
        // 长边不动只改变短bian。得出如下代码
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right])* (right - left);
            result = Math.max(result, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
// @lc code=end
