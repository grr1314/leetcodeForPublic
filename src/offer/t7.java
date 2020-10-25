package offer;

import java.util.Arrays;

public class t7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        int rootValue = preorder[0];//根结点，根据前序遍历规则得到
        TreeNode root = new TreeNode(rootValue);//创建树的根结点
        root.left = null;
        root.right = null;

        int p = 0;//记录根结点在中序遍历中的位置
        while (rootValue != inorder[p]) {
            p++;
        }
        int[] leftThreePre;
        int[] rightThreePre;
        int[] leftThreeIn;
        int[] rightThreeIn;
        if (p > 0) {
            leftThreePre = Arrays.copyOfRange(preorder, 1, p + 1);
            leftThreeIn = Arrays.copyOfRange(inorder, 0, p); //构建左子树
            root.left = buildTree(leftThreePre, leftThreeIn);
        }
        if (p < preorder.length) {
            rightThreePre = Arrays.copyOfRange(preorder, p + 1, preorder.length);
            rightThreeIn = Arrays.copyOfRange(inorder, p + 1, inorder.length);
            //构建右子树
            root.right = buildTree(rightThreePre, rightThreeIn);
        }
        return root;
    }

    class TreeNode {
        private int v;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int v) {
            this.v = v;
        }
    }
}
