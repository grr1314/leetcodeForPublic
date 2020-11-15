//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。 
//
// 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。 
//
// 注意：你不能在买入股票前卖出股票。 
//
// 
//
// 示例 1: 
//
// 输入: [7,1,5,3,6,4]
//输出: 5
//解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
// 
//
// 示例 2: 
//
// 输入: [7,6,4,3,1]
//输出: 0
//解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
// 
// Related Topics 数组 动态规划 
// 👍 1277 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//  7 1 5 3 6 4 买
//7 0 0 0 0 0 0
//1 0 0 0 0 0 0
//5 0 4 0 2 0 1
//3 0 2 0 0 0 0
//6 0 5 1 3 0 2
//4 0 3 0 1 0 0
//卖
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        //方法一 暴力解法
        //结果：
        //info
        //				解答成功:
        //				执行耗时:330 ms,击败了8.95% 的Java用户
        //				内存消耗:38.4 MB,击败了82.81% 的Java用户
//        for (int index = 0; index < prices.length; index++) {
//            for (int p = index; p < prices.length; p++) {
//                result=Math.max(prices[p]-prices[index],result);
//            }
//        }
//        return result;
        //方法二 动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
//        if (prices.length == 0) {
//            return 0;
//        }
//        int min = prices[0];
//        int max = 0;
//        for (int index = 1; index < prices.length; index++) {
//            max = Math.max(max, prices[index] - min);
//            min = Math.min(min, prices[index]);
//        }
//        return max;
        //方法三
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int index = 0; index < prices.length; index++) {
            if (prices[index] < min) {
                min = prices[index];
            } else if (prices[index] - min > max) {
                max = prices[index] - min;
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
