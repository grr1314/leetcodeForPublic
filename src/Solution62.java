import java.util.Arrays;

/**
 * 62 不同路径
 * <p>
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 问总共有多少条不同的路径？
 * <p>
 * 例如，上图是一个7 x 3 的网格。有多少可能的路径？
 * <p>
 * 说明：m 和 n 的值均不超过 100。
 * <p>
 * 示例 1:
 * <p>
 * 输入: m = 3, n = 2
 * 输出: 3
 * 解释:
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向右 -> 向下
 * 2. 向右 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向右
 * 示例 2:
 * <p>
 * 输入: m = 7, n = 3
 * 输出: 28
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        /**
         *  方案1： 这是递归的方案虽说可以实现但是时间复杂度太高，leetcode过不去
         */
//        if (m <= 0 || n <= 0) return 0;
//        if (n == 1 || m == 1) return 1;
//        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        /**
         * 方案2： 一维数组的实现方案
         */
        int[] array = new int[n];
        Arrays.fill(array, 1);//默认情况下数组的元素都是1
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                array[j] = array[j] + array[j - 1];
            }
        }
        return array[n - 1];
    }
    //题解：其实这就是所谓的动态规划问题array[m,n]=array[m-1,n]+array[m,n-1]
}
