//用一个 非空 单链表来表示一个非负整数，然后将这个整数加一。 
//
// 你可以假设这个整数除了 0 本身，没有任何前导的 0。 
//
// 这个整数的各个数位按照 高位在链表头部、低位在链表尾部 的顺序排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
// 
// Related Topics 链表 
// 👍 48 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode result=new ListNode();
    ListNode current=result;
    public ListNode plusOne(ListNode head) {
        //方法一 递归
        if (currentValue(head)>0){
            current.next=new ListNode(1);
            current=current.next;
        }
        ListNode newHead=result.next;
        ListNode pre=null;
        while(newHead!=null){
            ListNode temp=newHead.next;
            newHead.next=pre;
            pre=newHead;
            newHead=temp;
        }
        return pre;
    }
    private int currentValue(ListNode head){
        if(head==null) return 0;
        if (head.next==null){//已经是最后一个节点了
            int sum=head.val+1;
            if(sum>=10){
                sum=sum-10;
                current.next=new ListNode(sum);
                current=current.next;
                return 1;
            }
            current.next=new ListNode(sum);
            current=current.next;
            return 0;
        }else{
            int sum=head.val+currentValue(head.next);
            if(sum>=10){
                sum=sum-10;
                current.next=new ListNode(sum);
                current=current.next;
                return 1;
            }
            current.next=new ListNode(sum);
            current=current.next;
            return 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
