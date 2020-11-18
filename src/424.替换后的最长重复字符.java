/*
 * @lc app=leetcode.cn id=424 lang=java
 *
 * [424] 替换后的最长重复字符
 */

// @lc code=start
class Solution {
    private int[] map=new int[26];
    public int characterReplacement(String s, int k) {
        //思路一 
        if(s==null) return 0;
        char[] chars = s.toCharArray();
        int start=0;
        int end=0;
        int maxLength=0;
        for(end=0;end<chars.length;end++){
            int index=chars[end]-'A';
            map[index]++;
            maxLength=Math.max(map[index], maxLength);
            if(end-start+1>maxLength+k){
                map[chars[start]-'A']--;
                start++;
            }
        }
        return chars.length-start;
    }
}
// @lc code=end

