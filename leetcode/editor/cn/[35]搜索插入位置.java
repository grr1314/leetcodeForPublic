//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找 
// 👍 723 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        //方法一：效果还不错
        //运行结果：
        //				执行耗时:0 ms,击败了100.00% 的Java用户
        //				内存消耗:38.6 MB,击败了43.37% 的Java用户
//        int result = 0;
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] == target) return index;
//            else {
//                if (nums[0] > target) return 0;
//                else if (nums[nums.length - 1] < target) return nums.length;
//                else {
//                    if (nums[index] <= target && nums[index + 1] > target) {
//                        result = index + 1;
//                        break;
//                    }
//                }
//            }
//        }
//        return result;
        //方法二：
        int position = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target)
                return index;
            if (nums[index] < target)
                position++;
            else
                break;
        }
        return position;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
