/**
 * 59. 螺旋矩阵 II
 * <p>
 * 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 * [
 * [1,2,3,4],
 * [12,13,14,5],
 * [11,16,15,6],
 * [10,9,8,7]
 * ]
 * <p>
 * [1,2]
 * [4,3]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/spiral-matrix-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int number = n * n;
        int state = 0;
        int flag = n;
        int turnCount = 0;
        int index = 1;//默认等于1，当发生转向的时候变成1
        int x = 0;//横坐标
        int y = 0;//纵坐标
        for (int i = 0; i < number; i++) {
            a[y][x] = i + 1;
            //处理是否要转向
            if (index == flag) {
                index = 1;
                //记录转向次数，到了2次后的第三次的时候flag要-1
                if (turnCount != 0 && turnCount % 2 == 0) {
                    turnCount = 0;
                    flag--;
                }
                turnCount++;
                //修改state
                state = (state + 1) % 4;
            }
            index++;

            //如果是toRight的话x++，down的话x不变y++，toLeft是y不变x--，toUp是x不变y--
            if (state == 0) {
                x++;
            } else if (state == 1) {
                y++;
            } else if (state == 2) {
                x--;
            } else {
                y--;
            }

        }

        return a;
    }
}
