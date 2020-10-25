package offer;

import java.util.HashMap;
import java.util.Map;

public class t10_1 {
    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        //暴力递归，找死的话面试就这么写
        // if(n<2) return n;
        // else return fib(n-1)+fib(n-2);

        if (n < 2) return n;
        else {
            if (map.containsKey(n)) {
                return map.get(n);
            } else {
                int result = fib(n - 1) + fib(n - 2);
                map.put(n, result);
                return result;
            }
        }
    }
}
