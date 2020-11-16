import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 思路一 利用Hash表
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for (int target : nums1) {
            hashSet.add(target);
        }
        for (int index : nums2) {
            if (hashSet.contains(index)) {// 有交集
                resultSet.add(index);
            }
        }
        int index = 0;
        int[] result = new int[resultSet.size()];
        for (int a : resultSet) {
            result[index] = a;
            index++;
        }
        return result;

        // // 思路二
        // // 结果:60/60 cases passed (3 ms)
        // // Your runtime beats 87.51 % of java submissions
        // // Your memory usage beats 50.49 % of java submissions (38.7 MB)

        // if (nums1.length == 0 || nums2.length == 0)
        // return new int[0];
        // int[] result = new int[nums1.length];
        // int position = 0;
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // for (int index = 0; index < nums1.length; index++) {
        // if (include(nums2, nums1[index])) {
        // if (position == 0 || nums1[index] != result[position - 1]) {
        // result[position] = nums1[index];
        // position++;
        // }
        // }
        // }
        // int[] resultArray = new int[result.length];
        // for (int i = 0; i < result.length; i++) {
        // resultArray[i] = result[i];
        // }
        // return Arrays.copyOfRange(result, 0, position);

        // //思路三 官方解法
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int length1 = nums1.length, length2 = nums2.length;
        // int[] intersection = new int[length1 + length2];
        // int index = 0, index1 = 0, index2 = 0;
        // while (index1 < length1 && index2 < length2) {
        // int num1 = nums1[index1], num2 = nums2[index2];
        // if (num1 == num2) {
        // // 保证加入元素的唯一性
        // if (index == 0 || num1 != intersection[index - 1]) {
        // intersection[index++] = num1;
        // }
        // index1++;
        // index2++;
        // } else if (num1 < num2) {
        // index1++;
        // } else {
        // index2++;
        // }
        // }
        // return Arrays.copyOfRange(intersection, 0, index);
    }

    private boolean include(int[] nums2, int currentValue) {
        if (currentValue < nums2[0]) {
            return false;
        } else if (currentValue > nums2[nums2.length - 1]) {
            return false;
        } else {
            for (int p = 0; p < nums2.length; p++) {
                if (nums2[p] == currentValue) {
                    return true;
                }
            }

        }
        return false;
    }
}
// @lc code=end
