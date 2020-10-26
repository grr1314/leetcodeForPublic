//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表 
// 👍 414 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
//        //方法一 使用Hash表
//        ListNode result = head;
//        ListNode lastNode = null;
//        HashSet<Integer> hashSet = new HashSet();
//        while (head != null) {
//            if (hashSet.contains(head.val)) {
//                //表示已经存在需要执行删除操作
//                ListNode temp = head.next;
//                head.next = null;
//                head = temp;
//                lastNode.next = head;
//            } else {
//                hashSet.add(head.val);
//                lastNode = head;
//                head = head.next;
//            }
//        }
//        return result;
        //方法二 一层循环搞定
        //注意：[1,1,2,3,3,1,1,2,3] 的预期结果是[1,2,3,1,2,3]不是[1,2,3]，所以题目要求是不能连续出现
        //相等的节点，而不是要求不能出现相等的节点。基于这个题意不理解所以写出来方法一，面试时候如出现这题
        //一定要问清楚！！！
        ListNode result=head;
        ListNode lastNode=null;
        while (head!=null){
            if (lastNode!=null&&lastNode.val==head.val){
                ListNode temp=head.next;
                head.next=null;
                head=temp;
                lastNode.next=head;
            }else{
                lastNode=head;
                head=head.next;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
