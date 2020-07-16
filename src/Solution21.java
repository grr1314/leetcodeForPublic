import java.util.concurrent.LinkedBlockingDeque;

/**
 * 21. 合并两个有序链表
 * 
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 
 * 
 * 
 * 示例：
 * 
 * 输入：1->2->4, 1->3->4 输出：1->1->2->3->4->4
 */
public class Solution21 {
    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }

            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }

            // 作者：guanpengchn
            // 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/hua-jie-suan-fa-21-he-bing-liang-ge-you-xu-lian-bi/
            // 来源：力扣（LeetCode）
            // 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * 13. 罗马数字转整数
 * 
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 
 * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12
 * 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * 
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5
 * 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * 
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。 X 可以放在 L (50) 和 C (100) 的左边，来表示 40
 * 和 90。  C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。 给定一个罗马数字，将其转换成整数。输入确保在
 * 1 到 3999 的范围内。
 * 
 * 示例 1:
 * 
 * 输入: "III" 输出: 3
 * 
 * 示例 2:
 * 
 * 输入: "IV" 输出: 4
 * 
 * 示例 3:
 * 
 * 输入: "IX" 输出: 9
 * 
 * 示例 4:
 * 
 * 输入: "LVIII" 输出: 58 解释: L = 50, V= 5, III = 3. 示例 5:
 * 
 * 输入: "MCMXCIV" 输出: 1994 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution13 {
    public int romanToInt(String s) {
        int result = 0;
        

        return result;

    }
}