/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        // int startHay = 0;
        // int startNeed = 0;
        // int last=0;
        // int c = 0;
        // int result = -1;
        // if (needle == null || needle.length() == 0)
        //     return 0;
        // while (startHay < haystack.length()) {
        //     boolean inwhile = false;
        //     if(haystack.charAt(startHay) == needle.charAt(startNeed)){
        //         last=startHay;
        //     }
        //     while (startHay < haystack.length() && startNeed < needle.length()
        //             && haystack.charAt(startHay) == needle.charAt(startNeed)) {
        //         startHay++;
        //         startNeed++;
        //         inwhile = true;
        //         c++;
        //         if (c == needle.length()) {
        //             // 结果出现了
        //             result = startHay - needle.length();
        //             return result;
        //         }
        //     }
        //     startNeed = 0;
        //     c = 0;
        //     if (!inwhile)
        //         startHay++;
        //     else {
        //         startHay =last+1;
        //     }
        // }
        // return -1;
        haystack.indexOf(needle);
    }
}
// @lc code=end
