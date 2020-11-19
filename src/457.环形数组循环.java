import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=457 lang=java
 *
 * [457] 环形数组循环
 */

// @lc code=start
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        //自己思路 未能实现
        // if (nums.length < 2)
        //     return false;
        // int slow = 0;
        // int fast = (nums[1] + 1) % nums.length;
        // int lastFast = fast;
        // boolean isBegin = false;
        // HashSet<Integer> hashSet = new HashSet<>();
        // hashSet.add(fast);
        // while (slow != fast || !isBegin) {
        //     if (fast >= 0) {// 正向走
        //         fast = (nums[fast] + fast) % nums.length;
        //         slow = (slow + 1) % nums.length;
        //         System.out.println(fast + "--" + slow);
        //     } else {// 逆向走
        //         fast = fast + nums.length;
        //         fast = (nums[fast] + fast) % nums.length;
        //         slow = (slow - 1) % nums.length;
        //     }
        //     if (fast * lastFast < 0)
        //         return false;
        //     isBegin = true;
        //     hashSet.add(fast);
        //     lastFast = fast;
        // }
        // System.out.print(hashSet.size());
        // if (hashSet.size() <= 1)
        //     return false;
        // return true;
    }
}
// @lc code=end
