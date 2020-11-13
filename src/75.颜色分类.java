import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        // // 思路一 利用ArrayList，甚至没有用到排序算法
        // // 结果：
        // // 87/87 cases passed (1 ms)
        // // Your runtime beats 10.3 % of java submissions
        // // Your memory usage beats 87.86 % of java submissions (37.1 MB)
        // ArrayList<Integer> a0 = new ArrayList<>();
        // ArrayList<Integer> a1 = new ArrayList<>();
        // ArrayList<Integer> a2 = new ArrayList<>();
        // for (int index : nums) {
        // switch (index) {
        // case 0: {
        // a0.add(index);
        // }
        // break;
        // case 1: {
        // a1.add(index);
        // }
        // break;
        // case 2: {
        // a2.add(index);
        // }
        // break;
        // }
        // }
        // a1.addAll(a2);
        // a0.addAll(a1);
        // for (int p = 0; p < nums.length; p++) {
        // nums[p] = a0.get(p);
        // }
        // // 思路二 尝试使用计数排序
        // // 结果：
        // // 87/87 cases passed (0 ms)
        // // Your runtime beats 100 % of java submissions
        // // Your memory usage beats 89.57 % of java submissions (37 MB)
        // // 问题计数排序需要用O(K)的辅助空间貌似不符合本题进阶要求
        // int max = Integer.MIN_VALUE;
        // for (int value : nums) {
        // max = Math.max(max, value);
        // }
        // // 创建计数数组
        // int[] count = new int[max + 1];
        // for (int value : nums) {
        // count[value]++;
        // }
        // int index = 0;
        // for (int p = 0; p < count.length; p++) {
        // while (count[p] > 0) {
        // nums[index++] = p;
        // count[p]--;
        // }
        // }
        // 思路三 leetcode官方答案
        int n = nums.length;
        int p0 = 0, p2 = n - 1;
        for (int i = 0; i <= p2; ++i) {
            while (i <= p2 && nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                --p2;
            }
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                ++p0;
            }
        }

// 作者：LeetCode-Solution
// 链接：https://leetcode-cn.com/problems/sort-colors/solution/yan-se-fen-lei-by-leetcode-solution/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    }
}
// @lc code=end
