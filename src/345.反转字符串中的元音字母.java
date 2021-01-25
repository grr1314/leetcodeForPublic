import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        // 思路一 根据344思路来的，元音字母有a e i o u
        // 结果：481/481 cases passed (4 ms)
        // Your runtime beats 67.57 % of java submissions
        // Your memory usage beats 86.45 % of java submissions (38.5 MB)
        int start = 0;
        int end = s.length() - 1;
        char[] c = new char[s.length()];
        for (int index = 0; index < s.length(); index++) {
            c[index] = s.charAt(index);
        }
        while (start <= end) {
            if (include(c[start]) && include(c[end])) {
                swap(start, end, c);
                start++;
                end--;
            } else if (!include(c[start])) {
                start++;
            } else {
                end--;
            }
        }
        // StringBuilder sBuilder = new StringBuilder();
        // for (char ch : c) {
        // sBuilder.append(ch);
        // }
        // return sBuilder.toString();
        // 思路二 在思路一的基础上利用ArrayList记录元音字母
        // 结果 ：481/481 cases passed (5 ms)
        // Your runtime beats 48.81 % of java submissions
        // Your memory usage beats 14.31 % of java submissions (39.6 MB)
        // ArrayList<Integer> targetList = new ArrayList<>();
        // char[] c = new char[s.length()];
        // for (int index = 0; index < s.length(); index++) {
        // if (include(s.charAt(index)))
        // targetList.add(index);
        // c[index] = s.charAt(index);
        // }
        // int start = 0;
        // int end = targetList.size() - 1;
        // while (start <= end) {
        // swap(targetList.get(start), targetList.get(end), c);
        // start++;
        // end--;
        // }
        // // StringBuilder stringBuilder = new StringBuilder();
        // // for (char ch : c) {
        // // stringBuilder.append(ch);
        // // }
        // // return stringBuilder.toString();
        return String.valueOf(c);
    }

    private void swap(int start, int end, char[] cs) {
        char temp = cs[start];
        cs[start] = cs[end];
        cs[end] = temp;
    }

    private boolean include(char target) {
        if (target == 'a' || target == 'e' || target == 'i' || target == 'o' || target == 'u') {
            return true;
        }
        if (target == 'A' || target == 'E' || target == 'I' || target == 'O' || target == 'U') {
            return true;
        }
        return false;
    }
}
// @lc code=end
