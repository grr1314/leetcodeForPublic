import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * debug stack
 */
public class StackMain {
    public static void main(String[] args) {
        // MinStack minStack=new MinStack();
        // minStack.push(1);
        // minStack.pop();
    }
}

/**
 * 155. 最小栈 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * 
 * push(x) —— 将元素 x 推入栈中。 pop() —— 删除栈顶的元素。 top() —— 获取栈顶元素。 getMin() ——
 * 检索栈中的最小元素。
 * 
 * 
 * 示例:
 * 
 * 输入： ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 
 * 输出： [null,null,null,null,-3,null,0,-2]
 * 
 * 解释： MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
 * minStack.push(-3); minStack.getMin(); --> 返回 -3. minStack.pop();
 * minStack.top(); --> 返回 0. minStack.getMin(); --> 返回 -2.
 * 
 * 
 * 提示：
 */

// 方法1
/*
 * class MinStack { ArrayList<Integer> array;
 * 
 * public MinStack() { array = new ArrayList<Integer>(); }
 * 
 * public void push(int x) { array.add(x); }
 * 
 * public void pop() { nullStackCheck(); array.remove(array.size() - 1); }
 * 
 * public int top() { nullStackCheck(); return array.get(array.size() - 1); }
 * 
 * public int getMin() { nullStackCheck(); int result = 0; boolean isFrist =
 * false; if (array.size() == 1) return array.get(0); for (int e : array) { if
 * (!isFrist) { result = e; isFrist = true; } result = Math.min(e, result); }
 * return result; }
 * 
 * private void nullStackCheck() { if (array == null || array.size() == 0) {
 * throw new NullPointerException("MinStack can not be null"); } } }
 */
/**
 * 方法2使用两个Java已有的数据结构
 * 
 * 使用的数据结构以及方法 Stack Java中关于栈的实现 stack.push(e) 入栈 stack.isEmpty() 判断栈是否为空
 * stack.pop() 出栈 stack.peek() 获取栈顶的元素
 * 
 * 
 * 感谢https://leetcode-cn.com/problems/min-stack/solution/shi-yong-fu-zhu-zhan-tong-bu-he-bu-tong-bu-python-/
 * 提供的思路
 * 
 * 思路分析： 1 提供两个Java的Stack，l1（主栈）、helper（辅助栈） 2
 * 主栈正常的入栈和出栈，辅助栈入栈的条件是空或者栈顶小于要入栈的元素即hepler.peek()>=x 3
 * 由于2的判断条件，l1和helper这两个栈的栈顶元素相等时必然是同一次入栈操作时进去的元素，所以当两个栈的栈顶相等时helper也 要跟着出栈 4
 * helper的栈顶永远是helper栈中的最小元素，同样也是因为 helper.peek() >= x这个判断条件
 * 
 */
class MinStack {
    Stack<Integer> l1;
    Stack<Integer> helper;// 辅助的栈

    public MinStack() {
        l1 = new Stack<Integer>();
        helper = new Stack<Integer>();
    }

    public void push(int x) {
        l1.push(x);
        if (helper.isEmpty() || helper.peek() >= x) {// 若辅助栈是空的或者辅助栈顶的元素是大于等于入栈的元素
            helper.add(x);
        }
    }

    public void pop() {
        int top = l1.pop();
        if (top == helper.peek()) {
            helper.pop();
        }
    }

    public int top() {
        return l1.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}

/**
 * 225. 用队列实现栈 
 * 使用队列实现栈的下列操作：
 * 
 * push(x) -- 元素 x 入栈 pop() -- 移除栈顶元素 top() -- 获取栈顶元素 empty() -- 返回栈是否为空 注意:
 * 
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty
 * 这些操作是合法的。 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 */
class MyStack {

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

    }

    /** Get the top element. */
    public int top() {

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

    }
}
