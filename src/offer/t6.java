package offer;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * <p>
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class t6 {
    public int[] reversePrint(ListNode head) {
        int arrayLength = 0;
        ListNode p;
        p = head;
        while (p != null) {
            arrayLength++;
            p = p.next;
        }
        int[] array = new int[arrayLength];
        int position = 1;
        while (head != null) {
            array[arrayLength - position] = head.val;
            position++;
            head = head.next;
        }
        return array;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
