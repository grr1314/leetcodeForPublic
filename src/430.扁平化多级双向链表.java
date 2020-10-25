/*
 * @lc app=leetcode.cn id=430 lang=java
 *
 * [430] 扁平化多级双向链表
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    Node result=new Node(0,null,null,null);
    Node current=result;
    public Node flatten(Node head) {
        //方法一 
        //将链表看作是一个二叉树，其中child看作是左子树，next看作是右子树
        if(head==null){
            return null;
        }
        Node root=head;
        Node left=root.child;
        Node right=root.next;
        current.next=root;
        root.prev=current;
        current=current.next;
        System.out.print()
        flatten(left);
        flatten(right);
        result.next.prev=null;
        return result.next;
        
    }
}
// @lc code=end

