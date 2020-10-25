package offer;

/**
 * 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */

public class t5 {
    public String replaceSpace(String s) {
//        return s.replace(" ", "%20");
//        StringBuilder sb = new StringBuilder();
//        for (int a = 0; a < s.length(); a++) {
//            if (s.charAt(a) == ' ') {
//                sb.append("%20");
//            } else {
//                sb.append(s.charAt(a));
//            }
//        }
//        return sb.toString();
        //使用数组
        int arrayLength = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                arrayLength += 3;
            } else {
                arrayLength++;
            }
        }
        char[] chars = new char[arrayLength];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            } else {
                chars[j++] = s.charAt(i);
            }
        }
        return String.valueOf(chars);
    }
}
