import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int lastDistance = Integer.MAX_VALUE;
        if (nums.length == 3) {
            result = nums[0] + nums[1] + nums[2];
            return result;
        }
        // 方法一 参考15题的解法
        Arrays.sort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }
            int left = index + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[index] + nums[left] + nums[right];// 计算出来每三个数字的和
                if (sum == target)//如果遇到相等的情况直接返回
                    return sum;
                System.out.println(sum);
                int distance = Math.abs(sum - target);
                if (distance < lastDistance) {//遇到更小的距离，将result设置成更小距离的那个值
                    lastDistance = distance;
                    result = sum;
                }
                if (sum > target)
                    right--;
                else
                    left++;
            }
        }
        return result;
    }
}
// @lc code=end
