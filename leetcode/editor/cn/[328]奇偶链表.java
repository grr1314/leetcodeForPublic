//给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。 
//
// 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。 
//
// 示例 1: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 1->3->5->2->4->NULL
// 
//
// 示例 2: 
//
// 输入: 2->1->3->5->6->4->7->NULL 
//输出: 2->3->6->7->1->5->4->NULL 
//
// 说明: 
//
// 
// 应当保持奇数节点和偶数节点的相对顺序。 
// 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。 
// 
// Related Topics 链表 
// 👍 262 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        //方法一 自己想出来的
//        boolean isEven = false;//用于表示当前节点是否为偶节点
//        ListNode evenHead = new ListNode();
//        ListNode evenNode = evenHead;
//        ListNode oddHead = head;
//        ListNode oddNode = null;
//        if (head == null) return null;
//        while (head != null) {
//            if (isEven) {//表示当前节点是偶节点，需要取出来然后将前后两个奇节点连起来
//                ListNode temp = head.next;
//                head.next = null;
//                evenNode.next = head;
//                evenNode = evenNode.next;
//                head = temp;
//                //将两个奇节点连起来
//                if (head != null) {
//                    oddNode.next = head;
//                    oddNode = oddNode.next;
//                }
//            } else {
//                oddNode = head;
//                head = head.next;
//            }
//            isEven = !isEven;
//        }
//        oddNode.next = evenHead.next;
//        head = oddHead;
//        return head;
        //方法二 官方解法 很显然官方解法代码简洁一些
        if(head==null) return head;
        ListNode odd=head;
        ListNode even=odd.next;
        ListNode evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
