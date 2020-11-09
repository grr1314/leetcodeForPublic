import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
  
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // 回溯法
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // Arrays.sort(candidates);
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target,result, combine, 0);
        return result;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> result,List<Integer> combine ,int ids) {
        if (ids == candidates.length) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<Integer>(combine));
            return;
        }
        dfs(candidates,target,result,combine,ids+1);
        if(target-candidates[ids]>=0){
            combine.add(candidates[ids]);
            dfs(candidates, target-candidates[ids], result,combine, ids);
            combine.remove(combine.size()-1);
        }
    }
}
// @lc code=end
