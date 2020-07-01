import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoJava {
    public static void main(final String[] args) {
        // System.out.println("Hello World");
        Solution66 s66 = new Solution66();
        Solution67 s67 = new Solution67();
        // int[] digits = { 2, 1, 9 };
        // int[] digits = { 9, 9 };
        // for (int i : s66.plusOne(digits)) {
        // System.out.print(i + "");
        // }
        System.out.print(s67.addBinary("1", "111"));
    }
}

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3] 输出: [1,2,4] 解释: 输入数组表示数字 123。 示例 2:
 * 
 * 输入: [4,3,2,1] 输出: [4,3,2,2] 解释: 输入数组表示数字 4321。
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int index = digits.length - 1; index >= 0; index--) {
            digits[index]++;
            digits[index] = digits[index] % 10;
            if (digits[index] != 0)
                return digits;// 如果不是等于零表示没有进位，反之则表示有进位继续循环
        }
        // 如果都是9的情况下
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

/**
 * 6
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1" 输出: "100" 示例 2:
 * 
 * 输入: a = "1010", b = "1011" 输出: "10101"
 * 
 * 
 * 提示：
 * 
 * 每个字符串仅由字符 '0' 或 '1' 组成。 1 <= a.length, b.length <= 10^4 字符串如果不是 "0" ，就都不含前导零。
 */

class Solution67 {
    public String addBinary(String a, String b) {
        // 想办法补齐长度，通过填充0的方式，得到两个等长的数组
        int maxLength = Math.max(a.length(), b.length());
        int[] aArray = new int[maxLength];
        int[] bArray = new int[maxLength];
        if (a.length() >= b.length()) {
            int p = 0;
            for (int j = 0; j < (maxLength - b.length()); j++) {
                bArray[j] = 0;
                p++;
            }
            for (int i = 0; i < b.length(); i++) {
                char c1 = b.charAt(i);
                bArray[p] =  Integer.parseInt(String.valueOf(c1));
                p++;
            }
            for (int k = 0; k < maxLength; k++) {
                char c = a.charAt(k);
                aArray[k] = Integer.parseInt(String.valueOf(c));
            }

        } else {
            int p = 0;
            for (int j = 0; j < (maxLength - a.length()); j++) {
                aArray[j] = 0;
                p++;
            }
            for (int i = 0; i < a.length(); i++) {
                char c1 = a.charAt(i);
                aArray[p] = Integer.parseInt(String.valueOf(c1));
                p++;
            }
            for (int n = 0; n < maxLength; n++) {
                char c = b.charAt(n);
                bArray[n] = Integer.parseInt(String.valueOf(c));
            }
        }
        // if (a.length() < maxLength) {
        // // 确定要补几个0
        // int position = 0;
        // for (int i = 0; i < (maxLength - a.length()); i++) {
        // aArray[i] = 0;
        // position++;
        // }
        // for (int j = 0; j < a.length(); j++) {
        // aArray[position] = Integer.parseInt(String.valueOf(a.charAt(j)));
        // position++;
        // }

        // } else {
        // for (int j = 0; j < a.length(); j++) {
        // aArray[j] = Integer.parseInt(String.valueOf(a.charAt(j)));
        // }
        // }
        // if (b.length() < maxLength) {
        // // 确定要补几个0
        // int position = 0;
        // for (int i = 0; i < (maxLength - b.length()); i++) {
        // bArray[i] = 0;
        // position++;
        // }
        // for (int j = 0; j < b.length(); j++) {
        // bArray[position] = Integer.parseInt(String.valueOf(b.charAt(j)));
        // position++;
        // }
        // } else {
        // for (int j = 0; j < b.length(); j++) {
        // bArray[j] = Integer.parseInt(String.valueOf(b.charAt(j)));
        // }
        // }
        System.out.println("a长度" + aArray.length);
        System.out.println("b长度" + bArray.length);
        for (int i : bArray) {
            System.out.print(i + "");
        }
        for (int i : aArray) {
            System.out.print(i + "");
        }

        System.out.println("");

        int[] result = new int[maxLength];
        int n = 0;
        for (int start = maxLength - 1; start >= 0; start--) {
            result[start] = aArray[start] + bArray[start] + n;
            n = (result[start] >= 2) ? 1 : 0;
            result[start] = result[start] % 2;
        }
        String resultString = "";
        if (n > 0) {
            resultString = "1";
            for (int i : result) {
                resultString = resultString + i;
            }
        } else {
            for (int i : result) {
                resultString = resultString + i;
            }

        }
        return resultString;
    }
}