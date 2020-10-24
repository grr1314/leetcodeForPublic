/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //方法一 一层循环遍历
        // 结果
        //65/65 cases passed (1 ms)
        // Your runtime beats 99.58 % of java submissions
        // Your memory usage beats 94.93 % of java submissions (39.2 MB)
        ListNode pNode = head;
        ListNode lastNode = head;
        while (pNode != null) {
            if (pNode.val == val) {
                if (pNode.val == head.val) {
                    head = head.next;
                    pNode=head;
                    lastNode=head;
                } else {            // 删除操作
                    ListNode tempNode = pNode.next;
                    pNode.next = null;
                    lastNode.next = tempNode;
                    pNode = tempNode;
                }
            } else {
                lastNode = pNode;
                pNode = pNode.next;
            }
        }
        return head;
    }
}
// @lc code=end
