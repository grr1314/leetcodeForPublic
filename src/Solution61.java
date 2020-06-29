/**
 * 61 旋转链表
 * <p>
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        int length = 1;
        ListNode p = head;
        if (k <= 0) return head;
        if (head == null) return head;
        while (p.next != null) {
            length++;
            p = p.next;
        }
        p.next = head;
        int mLen = k % length;//需要挪动的次数
        ListNode n1 = head;
        for (int i = 0; i < length - mLen - 1; i++) {
            n1 = n1.next;
        }
        ListNode n2 = n1.next;
        n1.next = null;
        return n2;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}