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
        // 方法二 官方解法
        // 结果：
        // 161/161 cases passed (1 ms)
        // Your runtime beats 96.52 % of java submissions
        // Your memory usage beats 65.25 % of java submissions (40.5 MB)
        // 感受：完全没搞明白题的意图
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
