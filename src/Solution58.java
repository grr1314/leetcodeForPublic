/**
 * 58 最后一个单词的长度
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
//        int lastWordLength = 0;
//        if (s.isEmpty()) return 0;
//        String[] a = s.split(" ");
//        if (a.length > 0) return a[a.length - 1].length();
//        return lastWordLength;

        int lastWordLength = 0;
        int i = 0;
        if (s.isEmpty()) return 0;
        s = s.trim();
        while (i < s.length()) {
            lastWordLength++;
            if (s.charAt(i++) == ' ') {
                lastWordLength = 0;
            }
        }
        return lastWordLength;
    }
}
