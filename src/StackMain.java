import java.util.ArrayList;

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

class MinStack {
    /** initialize your data structure here. */
    ArrayList<Integer> array;

    public MinStack() {
        array = new ArrayList<Integer>();
    }

    public void push(int x) {
        array.add(x);
    }

    public void pop() {
        nullStackCheck();
        // System.out.println(array.size()+"");
        array.remove(array.size() - 1);
        // System.out.println(array.size()+"");
    }

    public int top() {
        nullStackCheck();
        return array.get(array.size() - 1);
    }

    public int getMin() {
        // 找最小的元素
        nullStackCheck();
        int result = 0;
        if(array.size()==1) return array.get(0);
        for (int e : array) {
            result = Math.min(e, result);
        }
        return result;
    }

    private void nullStackCheck() {
        if (array == null || array.size() == 0) {
            throw new NullPointerException("MinStack can not be null");
        }
    }
}
