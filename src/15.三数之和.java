import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {\
    public List<List<Integer>> threeSum(int[] nums) {
        //leetcode上某位同学的思路
        //https://leetcode-cn.com/problems/3sum/solution/pai-xu-shuang-zhi-zhen-zhu-xing-jie-shi-python3-by/
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3)
            return result;
        Arrays.sort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                return result;
            }
            if (index > 0 && nums[index] == nums[index-1]) {
                continue;
            }
            int left = index + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[index] + nums[left] + nums[right] == 0) {
                    List<Integer> current = new ArrayList<>();
                    current.add(nums[index]);
                    current.add(nums[left]);
                    current.add(nums[right]);
                    result.add(current);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }else if(nums[index]+nums[left]+nums[right]>0){
                    //说明right太大了
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
// @lc code=end
