//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的数字可以无限制重复被选取。 
//
// 说明： 
//
// 
// 所有数字（包括 target）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1： 
//
// 输入：candidates = [2,3,6,7], target = 7,
//所求解集为：
//[
//  [7],
//  [2,2,3]
//]
// 
//
// 示例 2： 
//
// 输入：candidates = [2,3,5], target = 8,
//所求解集为：
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//] 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// candidate 中的每个元素都是独一无二的。 
// 1 <= target <= 500 
// 
// Related Topics 数组 回溯算法 
// 👍 1039 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combin = new ArrayList<Integer>();
        Arrays.sort(candidates);
//        dfs(candidates, target, result, combin, 0);
        dfs(candidates, combin, result, target, 0, 0);
        return result;
    }

    //方法一 官方解法
    // 输入：candidates = [2,3,5,10], target = 8
//    private void dfs(int[] candidates, int target, List<List<Integer>> result, List<Integer> combin, int index) {
//        if (index == candidates.length) {
//            return;
//        }
//        if (target == 0) {
//            result.add(new ArrayList<Integer>(combin));
//            return;
//        }
//        if (candidates[index] > target) return;
//        dfs(candidates, target, result, combin, index + 1);
//        if (target >= candidates[index]) {
//            combin.add(candidates[index]);
//            dfs(candidates, target - candidates[index], result, combin, index);
//            combin.remove(combin.size() - 1);
//        }// 输入：candidates = [2,3,5,10], target = 8,
//    }
    //方法二

    private void dfs(int[] candidates, List<Integer> combin, List<List<Integer>> result, int target, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList<Integer>(combin));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            int r = sum + candidates[i];
            if (r <= target) {
                combin.add(candidates[i]);
                dfs(candidates, combin, result, target, r, i);
                combin.remove(combin.size() - 1);
            } else {
                break;//因为之前有排序所以直接break掉
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
