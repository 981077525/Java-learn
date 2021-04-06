class 判断二叉树是否镜像对称 {

        public static boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (!isMirror(p.left, q.right)) {
            return false;
        }

        return isMirror(p.right, q.left);
    }


    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isMirror(root.left,root.right);
    }
}
