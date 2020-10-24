import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length < 2)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], index);
        }
        for (int p = 0; p < nums.length; p++) {
            System.out.println(p);
            result[0] = p;
            if (map.containsKey(target - nums[p])&&nums[p]!=target-nums[p]) {
                System.out.println("containsKey"+(target - nums[p]));
                result[1] = map.get(target - nums[p]);
                break;
            }
        }
        return result;
    }
}
// @lc code=end
