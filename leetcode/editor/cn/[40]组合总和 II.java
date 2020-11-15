//给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的每个数字在每个组合中只能使用一次。 
//
// 说明： 
//
// 
// 所有数字（包括目标数）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1: 
//
// 输入: candidates = [10,1,2,7,6,1,5], target = 8,
//所求解集为:
//[
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//]
// 
//
// 示例 2: 
//
// 输入: candidates = [2,5,2,1,2], target = 5,
//所求解集为:
//[
//  [1,2,2],
//  [5]
//] 
// Related Topics 数组 回溯算法 
// 👍 435 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //回溯法
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, combin, result, target, 0, 0);
        return result;
    }

    // 输入：candidates = [2,3,5,10], target = 8
    private void dfs(int[] candidates, List<Integer> combin, List<List<Integer>> result, int target, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList<Integer>(combin));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            int r = sum + candidates[i];
            if (r <= target) {
                combin.add(candidates[i]);
                dfs(candidates, combin, result, target, r, i + 1);
                combin.remove(combin.size() - 1);
            } else {
                break;//因为之前有排序所以直接break掉
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
