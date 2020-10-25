package offer;

public class t28 {
    /**
     * 1 如果根节点的左右子节点，有一个是null一个不是那么这个树必然不是对称树
     * 2 如果根节点的左右子节点都是null，那么这个树必然是对称的
     * 3 如果节点左右子节点都不是null，那么判断左右子节点的值是否相等，如果不相等则必然不是对称的
     * 4 如果相等则
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);

    }
    private boolean isSymmetric(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2 == null) return true;
        if (treeNode1 == null || treeNode2 == null) return false;
        if (treeNode1.val != treeNode2.val) return false;

        return isSymmetric(treeNode1.left, treeNode2.right) && isSymmetric(treeNode1.right, treeNode2.left);
    }
}
