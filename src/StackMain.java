import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
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
 * 225. 用队列实现栈 使用队列实现栈的下列操作：
 * 
 * push(x) -- 元素 x 入栈 pop() -- 移除栈顶元素 top() -- 获取栈顶元素 empty() -- 返回栈是否为空 注意:
 * 
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty
 * 这些操作是合法的。 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 * 
 * 用到的现有的数据结构 LinkedList 方法： linkedList.add(e) 在末尾添加元素 linkedList.removeLast()
 * 移除末尾元素 linkedList.getLast() 获取末尾元素 linkedList.size() 获取元素个数
 */
class MyStack {
    LinkedList<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.removeLast();
    }

    /** Get the top element. */
    public int top() {
        return queue.getLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }
}

/**
 * 232. 用栈实现队列 使用栈实现队列的下列操作：
 * 
 * push(x) -- 将一个元素放入队列的尾部。 pop() -- 从队列首部移除元素。 peek() -- 返回队列首部的元素。 empty() --
 * 返回队列是否为空。
 * 
 * 
 * 示例:
 * 
 * MyQueue queue = new MyQueue();
 * 
 * queue.push(1); queue.push(2); queue.peek(); // 返回 1 queue.pop(); // 返回 1
 * queue.empty(); // 返回 false
 * 
 * 
 * 说明:
 * 
 * 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。 假设所有操作都是有效的
 * （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 * 
 * 题解： 队列是先进先出的
 * 
 */
class MyQueue {
    Stack<Integer> queueStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        queueStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        queueStack.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (queueStack.size() > 0)
            return queueStack.remove(0);
        else {
            throw new RuntimeException("queueStack size is 0");
        }
    }

    /** Get the front element. */
    public int peek() {
        queueStack.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queueStack.empty();
    }
}

/**
 * 496. 下一个更大元素 I 给定两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1
 * 中每个元素在 nums2 中的下一个比其大的值。
 * 
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: nums1 = [4,1,2], nums2 = [1,3,4,2]. 输出: [-1,3,-1] 解释:
 * 对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。 对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
 * 对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。 示例 2:
 * 
 * 输入: nums1 = [2,4], nums2 = [1,2,3,4]. 输出: [3,-1] 解释: 对于 num1 中的数字 2
 * ，第二个数组中的下一个较大数字是 3 。 对于 num1 中的数字 4 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
 * 
 * 
 * 提示：
 * 
 * nums1和nums2中所有元素是唯一的。 nums1和nums2 的数组大小都不超过1000。
 * 
 * 单调栈
 * 答案来自：https://leetcode-cn.com/problems/next-greater-element-i/solution/xia-yi-ge-geng-da-yuan-su-i-by-leetcode/
 * 关于map的使用真的是让我膜拜
 * 
 * 个人理解： 1 最后
 */
class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 1 最后返回的数组和nums1的长度一样，这点很好理解因为result中放的元素是nums2中相同元素的右侧第一个比他大的
        // 同时如果不存在的话就放-1
        int[] result = new int[nums1.length];
        // 2 定义栈
        Stack<Integer> stack = new Stack<>();
        // 3 定义一个map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            // 4 for循环nums2中的元素，然后和栈顶数据比较。如果栈是空的则通过5入栈，
            // 如果nums[2]<栈顶元素的话也是通过5入栈。当栈不为空切nums[2]>栈顶元素则把栈顶元素拿出来作为map的
            // key然后把nums[i]作为value
            while (!stack.empty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            // 5 入栈操作
            stack.push(nums2[i]);
        }
        // 补-1
        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }
        for (int j = 0; j < nums1.length; j++) {
            result[j] = map.get(nums1[j]);
        }
        return result;
    }
}

/**
 * 682. 棒球比赛 你现在是棒球比赛记录员。 给定一个字符串列表，每个字符串可以是以下四种类型之一：
 * 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。 3.
 * "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效
 * 回合的分数是无效的，应该被移除。
 * 
 * 每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。 你需要返回你在所有回合中得分的总和。
 * 
 * 示例 1:
 * 
 * 输入: ["5","2","C","D","+"] 输出: 30 解释: 第1轮：你可以得到5分。总和是：5。 第2轮：你可以得到2分。总和是：7。
 * 操作1：第2轮的数据无效。总和是：5。 第3轮：你可以得到10分（第2轮的数据已被删除）。总数是：15。 第4轮：你可以得到5 + 10 =
 * 15分。总数是：30。 示例 2:
 * 
 * 输入: ["5","-2","4","C","D","9","+","+"] 输出: 27 解释: 第1轮：你可以得到5分。总和是：5。
 * 第2轮：你可以得到-2分。总数是：3。 第3轮：你可以得到4分。总和是：7。 操作1：第3轮的数据无效。总数是：3。
 * 第4轮：你可以得到-4分（第三轮的数据已被删除）。总和是：-1。 第5轮：你可以得到9分。总数是：8。 第6轮：你可以得到-4 + 9 =
 * 5分。总数是13。 第7轮：你可以得到9 + 5 = 14分。总数是27。 注意：
 * 
 * 输入列表的大小将介于1和1000之间。 列表中的每个整数都将介于-30000和30000之间。
 */

class Solution682 {
    public int calPoints(String[] ops) {

    }
}
