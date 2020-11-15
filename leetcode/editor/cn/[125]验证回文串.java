//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 293 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (!include(s.charAt(start))) {
                start++;
            } else if (!include(s.charAt(end))) {
                end--;
            }else{
                char cStart=toLowerCase(s.charAt(start));
                char cEnd=toLowerCase(s.charAt(end));
                if (cStart!=cEnd){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    private char toLowerCase(char c){
        if ((c >= 'a' && c <= 'z')|| (c >= '0' && c <= '9')) return c;
        return (char)(c+32);
    }

    private boolean include(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        } return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
