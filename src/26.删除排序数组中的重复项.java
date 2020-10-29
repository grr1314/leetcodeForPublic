import java.util.ArrayList;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // 方法一 ArrayList
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // for (int a : nums) {
        // if (!arrayList.contains(a))
        // arrayList.add(a);
        // }
        // int p=0;
        // for(int a: arrayList){
        // System.out.println(a);
        // nums[p]=a;
        // p++;
        // }
        // return p;
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[i]) {
                i++;
                nums[i] = nums[index];
            }
        }
        return i + 1;
    }
}
// @lc code=end
