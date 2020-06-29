/**
 * 60. 第k个排列
 * <p>
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * <p>
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 * <p>
 * 说明：
 * <p>
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 * 示例 1:
 * <p>
 * 输入: n = 3, k = 3
 * 输出: "213"
 * 示例 2:
 * <p>
 * 输入: n = 4, k = 9
 * 输出: "2314"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution60 {
    public String getPermutation(int n, int k) {
        boolean[] visited = new boolean[n];
        int b = getCombinationCount(n - 1);
        return getResult(n, b, k, visited);
    }

    /**
     * @param n
     * @param groupCount
     * @param k
     * @param visited
     * @return
     */
    public String getResult(int n, int groupCount, int k, boolean[] visited) {
        int offset = k % groupCount;
        int groupId = k / groupCount + (offset > 0 ? 1 : 0);
        int i;
        for (i = 0; i < visited.length && groupId > 0; i++) {
            if (!visited[i]) {
                groupId--;
            }
        }
        visited[i - 1] = true;
        if (n - 1 > 0) {
            return String.valueOf(i) + getResult(n - 1, groupCount / (n - 1), offset == 0 ? groupCount : offset, visited);
        } else {
            return String.valueOf(i);
        }
    }

    /**
     * 计算排列组合的个数n！，其实就是n*(n-1)*(n-2)....*2*1,例如担当n=3时就是3*2*1=6
     *
     * @param n
     * @return
     */
    public int getCombinationCount(int n) {
        int numberCount = 1;
        while (n > 1) {
            numberCount *= n;
            n--;
        }
        return numberCount;
    }
}

/**
 * 解题思路:
 * 看到了leetcode上的一个不错的思路
 * https://leetcode-cn.com/problems/permutation-sequence/solution/zhi-xing-yong-shi-1-ms-zai-suo-you-java-ti-jiao-54/
 */
