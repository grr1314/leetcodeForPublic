import java.util.ArrayList;
import java.util.HashMap;

/**
 * 09 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution09 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x==10) return false;
//        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        //通过一个while循环计算数字的长度
        //1000030001
        int p=0;
        int n = x, last;
        while (n >=10) {
            last = n % 10;//取出最低位的数字
//            arrayList.add(last);
            map.put(p,last);
            p++;
            n = n / 10;
        }
        map.put(p,n);
//        arrayList.add(n);
        //判断list的长度
        for (int i = 0; i < map.size()/ 2; i++) {
            if (map.get(i) != map.get(p-i))
            {
                return false;
            }
        }
        return true;
    }
}
