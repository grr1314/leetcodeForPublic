import java.util.*;

/**
 * 这个项目用于联系LeetCode上的算法题，在正式的练习之前必须要将LeetCode题号和题干标清楚
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 2, 2, 3};
        // Solution58 solution58 = new Solution58();
        // int length = solution58.lengthOfLastWord("Hello World");
        // System.out.print(length);
        // int n=3;
        // Solution59 solution59=new Solution59();
        // int[][] a=solution59.generateMatrix(n);
        // for (int i=0;i<n;i++)
        // {
        // for (int j=0;j<n;j++)
        // {
        // System.out.print(a[i][j]);
        // }
        // System.out.println();
        // }
        // int n=4;
        // int k=9;
        // Solution60 solution60=new Solution60();
        // String s=solution60.getPermutation(n,k);
        // System.out.print(s);

//        Solution62 solution62=new Solution62();
//        int s=solution62.uniquePaths(51,9);
//        System.out.print(s);
//        int[][] a = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
//        int[][] a = {{0, 0, 0}, {0, 1, 0}};
//        int[][] a = {{0}};
//        int[][] a = {{1}};
        //   int[][] a = {{0,1,0},{0,1,0}};
//        int[][] a = {{1,0},{0,0}};
//        int[][] a = {{0,1},{0,0},{0,0}};
//        Solution63 solution63 = new Solution63();
//        int s = solution63.uniquePathsWithObstacles(a);
//        System.out.print(s);
        Main main = new Main();
        main.putEnds();
        //test
        List<String> paragraphs = new ArrayList<>();
        HashMap<String, String> raw = new HashMap<>();
        paragraphs.add("第一段第一句话。第一段第二句话。");
        paragraphs.add("第二段第一句话。“第二段第二句话！”");
        raw.put("第一段第一句话。", "ABC.");
        raw.put("第二段第一句话。", "CCC.");
        raw.put("第一段第二句话。", "123.");
        raw.put("“第二段第二句话！”", "EEE.");
        List<String> re = main.trans(paragraphs, raw);
        for (String v: re){
            System.out.println(v);
        }
//        System.out.print(main.removeDuplicates(a));

    }

    private HashSet<String> end = new HashSet();

    public void putEnds() {
        end.add("?");
        end.add("!");
        end.add("！”");
        end.add("? ”");
        end.add("。");
    }


    /**
     * 处理对应结果
     *
     * @param paragraphs
     * @param rawTrans
     * @return
     */
    private List<String> trans(List<String> paragraphs, Map<String, String> rawTrans) {

        List<String> result;
        //如果两个参数都是null
        if (paragraphs == null || paragraphs.isEmpty()) {
            return null;
        }
        if (rawTrans == null || rawTrans.isEmpty()) {
            return null;
        }
        result = new ArrayList<>();
        List<String> key = new ArrayList<>();
        for (String value : paragraphs) {
            if (value != null && !value.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                int start = 0;
                for (int i = 0; i < value.length(); i++) {
                    if ((value.charAt(i) == '。') || (value.charAt(i) == '?') || (value.charAt(i) == '!')) {
                        stringBuilder.append(value.charAt(i));
                        key.add(stringBuilder.toString());
                        stringBuilder.delete(start, i);
                        start = i + 1;
                    } else {
                        stringBuilder.append(value.charAt(i));
                    }
                }
            }
        }
        for (String k : key) {
            if (rawTrans.containsKey(k)) {
                result.add(rawTrans.get(k));
            }
        }
        return result;
    }

    public int removeDuplicates(int[] nums) {
        int currentValue = nums[0];
        int count = 1;
        int length = 1;
        for (int index = 1; index < nums.length; index++) {
            if (currentValue == nums[index]) {
                count++;
                if (count > 2) {
                    int c = index;
                    while (c < nums.length) {
                        nums[c - 1] = nums[c];
                        c++;
                    }
                    count--;
                    length--;
                    index--;
                } else {
                    length++;
                }
            } else {
                length++;
                currentValue = nums[index];
                count = 1;
            }
        }
        return length;
    }
}
