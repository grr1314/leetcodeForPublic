import java.sql.Array;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=532 lang=java
 *
 * [532] 数组中的 k-diff 数对
 */

// @lc code=start
class Solution {
    public int findPairs(int[] nums, int k) {
        // 思路一 排序+双指针
        Arrays.sort(nums);
        int start = 0;
        int end = 1;
        int last = Integer.MIN_VALUE;
        int result = 0;
        while (start < nums.length) {
            if (end >= nums.length) {
                end = nums.length - 1;
            }
            if (nums[end] - nums[start] < k) {
                if (end == nums.length - 1) {
                    return result;
                }
                end++;
            } else if (nums[end] - nums[start] == k) {
                if (end == start) {
                    if (end == nums.length - 1) {
                        return result;
                    }
                    end++;
                } else {
                    // 表示遇到了相同的，这时候两个指针都要挪动
                    if (last != nums[start]) {
                        result++;
                    }
                    last = nums[start];
                    start++;
                    end++;
                }
            } else {
                start++;
            }
        }
        return result;
        // if(nums.length < 2) return 0;
        // Arrays.sort(nums);
        // int count = 0;
        // for(int i = 0;i < nums.length - 1;i++){
        //     if(i >= 1 && nums[i] == nums[i -1]) continue;//这条判断语句很重要，小编也是改了好几遍才解决了这个判断条件
        //     for(int j = i + 1;j < nums.length;j++){
        //         if(nums[j] - k > nums[i]){
        //             break;
        //         }
        //         if(nums[j] - k == nums[i]){
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return count;

    }
}
// @lc code=end
