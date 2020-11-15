//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4566 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // abcbd
    // abcabcbb
    // dvdf
    // ppp
    public int lengthOfLongestSubstring(String s) {
        //方法一 双指针
        //思路：1 用一个HashMap key是char value是 index下标
        //     2 定义双指针 fast和slow
        //结果 info
        //				解答成功:
        //				执行耗时:9 ms,击败了47.13% 的Java用户
        //				内存消耗:38.9 MB,击败了68.40% 的Java用户
        if (s.length() <= 1) {
            return s.length();
        }
        HashMap<Character, Integer> hashSet = new HashMap<>();
        int maxLength = 0;
        int fast = 0;
        int slow = 0;
        while (fast < s.length()) {
            if (hashSet.containsKey(s.charAt(fast))) {
                slow = Math.max(slow, hashSet.get(s.charAt(fast)) + 1);
                hashSet.remove(s.charAt(fast));
            } else {
                hashSet.put(s.charAt(fast), fast);
                fast++;
            }
            maxLength = Math.max(maxLength, fast - slow);
        }
        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
