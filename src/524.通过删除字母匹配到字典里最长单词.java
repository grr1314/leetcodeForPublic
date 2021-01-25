import java.util.List;

/*
 * @lc app=leetcode.cn id=524 lang=java
 *
 * [524] 通过删除字母匹配到字典里最长单词
 */

// @lc code=start
class Solution {
    public String findLongestWord(String s, List<String> d) {
        //思路一 遍历+双指针
        String result="";
        if(s==null||s.length()==0) return result;
        for(int index=0;index<d.size();index++){
            if(isIncludeString(s, d.get(index))){
                result=getBestResult(result,d.get(index));
            }
        }
        return result;
    }
    private String getBestResult(String s,String d){
        //比较长短
        if(d.length()>s.length()){
            return d;
        }else if(s.length()==d.length()){//比较字典序
            if(d.compareTo(s)<0){
                return d;
            }
        }
        return s;
    }
    private boolean isIncludeString(String target,String currentString){
        int startTarget=0;
        int startCurrent=0;
        while(startTarget!=target.length()&&startCurrent!=currentString.length()){
            if(target.charAt(startTarget)==currentString.charAt(startCurrent)){
                startTarget++;
                startCurrent++;
            }else{
                startTarget++;
            }
        }
        return startCurrent==currentString.length();
    }
}
// @lc code=end

