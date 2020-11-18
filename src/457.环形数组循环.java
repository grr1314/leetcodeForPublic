/*
 * @lc app=leetcode.cn id=457 lang=java
 *
 * [457] 环形数组循环
 */

// @lc code=start
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        if (nums.length < 2)
            return false;
        int slow = 0;
        int fast = (nums[1] + 1) % nums.length;
        int length = 0;
        int lastWard=0;
        boolean isBegin = false;

        while (slow != fast || !isBegin) {
            length++;
            int currentWard=-1;
            if(fast>0){//正向走
                currentWard=0;
                fast = (nums[fast] + fast) % nums.length;
                slow = (slow+1) % nums.length;
                System.out.print(fast+"--"+slow);
            }else{//逆向走
                fast=fast+nums.length;
                fast = (nums[fast] + fast) % nums.length;
                slow=(slow-1)%nums.length;
                currentWard=1;
            }
            if(lastWard!=currentWard) return false;
            lastWard=currentWard;
            isBegin = true;
        }
        System.out.print(length);
        if (length <= 1)
            return false;
        return true;
    }
}
// @lc code=end
