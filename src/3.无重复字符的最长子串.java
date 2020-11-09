import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    // bvbf 3
    // ppp 1
    public int lengthOfLongestSubstring(String s) {
        // // 思路一 Hash表+双指针
        // int maxLength = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        // int fast = 0;
        // int slow = 0;
        // while (fast < s.length()) {
        // if (map.containsKey(s.charAt(fast))) {
        // slow=Math.max(slow, map.get(s.charAt(fast))+1);
        // map.remove(s.charAt(fast));
        // } else {
        // map.put(s.charAt(fast), fast);
        // fast++;
        // }
        // maxLength=Math.max(maxLength, fast-slow);
        // }
        // return maxLength;
        // // 思路二 是一的修改版
        // // 结果：987/987 cases passed (7 ms)
        // // Your runtime beats 82.76 % of java submissions
        // // Your memory usage beats 85.94 % of java submissions (38.7 MB)
        // // "abcabcbb" 3
        // // bvbf 3
        // int maxLength = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        // int fast = 0;
        // int slow = 0;
        // if (s == null || s.length() == 0)
        // return 0;
        // while (fast < s.length()) {
        // if (map.containsKey(s.charAt(fast))) {
        // slow = Math.max(slow, map.get(s.charAt(fast)) + 1);
        // }
        // maxLength = Math.max(maxLength, fast - slow + 1);
        // map.put(s.charAt(fast), fast);
        // fast++;
        // }
        // return maxLength;
        // 思路三 利用ascii码的思路，使用数组来代替map
        int[] last = new int[128];
        int maxLength = 0;
        int slow = 0;
        int fast = 0;
        while (fast < s.length()) {
            int code = s.charAt(fast);// 关键点
            slow = Math.max(slow, last[code]);
            maxLength = Math.max(maxLength, fast - slow + 1);
            last[code] = fast+1;
            fast++;
        }
        return maxLength;
    }
}
// @lc code=end
