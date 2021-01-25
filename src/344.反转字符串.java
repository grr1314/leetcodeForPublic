/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int start =0;
        int end =s.length-1;
        while(start<=end){
            swap(start,end,s);
            start++;
            end--;
        }
    }
    private void swap(int start, int end,char[] s) {
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
    }
}
// @lc code=end

