import java.util.HashMap;
import java.util.HashSet;

/**
 * 1 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
//        int numberA, numberB;
//        //最先想到两层循环
//        for (int index = 0; index < nums.length - 1; index++) {
//            numberA = nums[index];
//            for (int j = index + 1; j < nums.length; j++) {
//                numberB = nums[j];
//                if (numberA + numberB == target) {
//                    result[0] = index;
//                    result[1] = j;
//        break;
//                }
//            }
//        }
        //试试是否可以使用一层循环解决问题
        HashMap<Integer, Integer> integers = new HashMap<>();
        int numberC;
        int p = 0;
        for (int number : nums
        ) {
            integers.put(number, p);
            p++;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            numberC = target - nums[i];
            if (integers.containsKey(numberC)&&integers.get(numberC)!=i) {
                result[0] = i;
                result[1] = integers.get(numberC);
                break;
            }
        }
        return result;
    }
}
