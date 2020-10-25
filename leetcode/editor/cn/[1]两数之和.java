//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9428 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //方法一 暴力法
        /**
         * info
         * 				解答成功:
         * 				执行耗时:63 ms,击败了40.33% 的Java用户
         * 				内存消耗:38.3 MB,击败了96.97% 的Java用户
         *
         */

//        int n = nums.length;
//        for (int i = 0; i < n; ++i) {
//            for (int j = i + 1; j < n; ++j) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];

        //方法二 使用ArrayList
        //[2,5,5,11]
        //10
//        int[] result = new int[2];
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int index = 0; index < nums.length; index++) {
//            arrayList.add(nums[index]);
//        }
//        for (int p = 0; p < nums.length; p++) {
//            System.out.println("~");
//            if (arrayList.contains(target - nums[p])&&p != arrayList.lastIndexOf(target - nums[p])) {
//                result[0] = p;
//                result[1] = arrayList.lastIndexOf(target - nums[p]);
//                break;
//            }
//        }
//        return result;
        //方法三 使用Hash表
        //解答成功:
        //				执行耗时:2 ms,击败了99.53% 的Java用户
        //				内存消耗:38.3 MB,击败了97.30% 的Java用户
        int[] result=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap();
        for(int index=0;index<nums.length;index++){
            if(hashMap.containsKey(target-nums[index])){
                result[0]=hashMap.get(target-nums[index]);
                result[1]=index;
                break;
            }
            hashMap.put(nums[index],index);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
