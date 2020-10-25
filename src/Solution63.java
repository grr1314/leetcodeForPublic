import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 63 不同路径2
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * <p>
 * <p>
 * <p>
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * <p>
 * 说明：m 和 n 的值均不超过 100。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution63 {

//    public int uniquePaths(int m, int n) {
//        /**
//         *  方案1： 这是递归的方案虽说可以实现但是时间复杂度太高，leetcode过不去
//         */
////        if (m <= 0 || n <= 0) return 0;
////        if (n == 1 || m == 1) return 1;
////        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
//        /**
//         * 方案2： 一维数组的实现方案
//         */
//        int[] array = new int[n];
//        Arrays.fill(array, 1);//默认情况下数组的元素都是1
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                array[j] = array[j] + array[j - 1];
//            }
//        }
//        return array[n - 1];
//    }
//    //题解：其实这就是所谓的动态规划问题array[m,n]=array[m-1,n]+array[m,n-1]

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        /**
//         *  解题思路
//         *  1、正常的动态规划是f(m,n)=f(m-1,n)+f(m,n-1)但是(m-1,n)或者是(m,n-1)位置上有可能是障碍，
//         *  那么这种情况就是f(m,n)=f(m-1,n)或者f(m,n)=f(m,n-1)，再或者(m-1,n)和(m,n-1)两个位置
//         *  都是障碍，那么f(m,n)=0
//         *  2、利用输入的数组检查(m-1,n)和(m,n-1)两个位置是否是障碍，来计算(m,n)这个位置的值
//         */
        int n = obstacleGrid.length;//行
        int m = obstacleGrid[0].length;//列
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
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < obstacleGrid[i].length; j++) {
//                System.out.print(obstacleGrid[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("m:" + m);
//        System.out.println("n:" + n);
//        if (check(0, 0, obstacleGrid) || check(m - 1, n - 1, obstacleGrid)) return 0;
//        return uniquePaths(m - 1, n - 1, obstacleGrid);
//    }
//
//    private int uniquePaths(int m, int n, int[][] obstacleGrid) {
//        if (m <= 0 || n <= 0) {
//            //遍历整个数组
//            return checkAll(m, n, obstacleGrid) ? 0 : 1;
//        }
//        if (m == 1 || n == 1) {
//            return check(m, n, obstacleGrid) ? 0 : 1;
//        }
//        if (check(m - 1, n, obstacleGrid) && check(m, n - 1, obstacleGrid)) {
//            return 0;
//        } else {
//            if (check(m - 1, n, obstacleGrid)) {
//                return uniquePaths(m, n - 1, obstacleGrid);
//            } else if (check(m, n - 1, obstacleGrid)) {
//                return uniquePaths(m, n - 1, obstacleGrid);
//            }
//        }
//        return uniquePaths(m - 1, n, obstacleGrid) + uniquePaths(m, n - 1, obstacleGrid);
    }

    private boolean check(int m, int n, int[][] obstacleGrid) {
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        return obstacleGrid[n][m] == 1;
    }

    private boolean checkAll(int m, int n, int[][] o) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (o[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
