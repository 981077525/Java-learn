package Tree;

public class TreeOperatios {
    /*
     *   求树的高度
     * */
    public static int getHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return (Math.max(getHeight(root.right), getHeight(root.right)) + 1);
    }

    /*
     *   求树第k层的结点数
     * */
    public static int getKthLevel(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        if (k == 1) {
            return 1;
        }

        return (getKthLevel(root.right, k - 1) + getKthLevel(root.left, k - 1));
    }

    /*
     *   判断 e 是否在 二叉树root中
     * */
    public static boolean contains(TreeNode root, int e) {

        if (root == null) {
            return false;
        }
        // 如果根中就是该值，直接返回true
        if (root.val == e) {
            return true;
        }
        // 左子树中找不到再去右子树找
        if (contains(root.left, e)) {
            return true;
        } else {
            return contains(root.right, e);
        }
    }

    /*
     *   判断 e 是否在 二叉树root中,并返回具体位置
     * */
    public static TreeNode nodeOf(TreeNode root, int e) {

        if (root == null) {
            return null;
        }

        if(root.val == e){
            return root;
        }

        TreeNode targetLeftNode = nodeOf(root.left, e);
        // 左子树中找不到再去右子树找
        if (targetLeftNode.val == e) {
            return targetLeftNode;
        }
        TreeNode targetRightNode = nodeOf(root.right, e);
        if(targetRightNode.val == e){
            return targetRightNode;
        }
        return null;
    }

    /*
    *   判断节点node在不在root中,返回判断的布尔值
    * */
    public static boolean containsNode(TreeNode root,TreeNode node){

        if(root == null){
            return false;
        }

        if(node == null){
            return true;
        }

        return containsNode(root.left,node) | containsNode(root.right,node);
    }


    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();

        System.out.println(getHeight(root));

        System.out.println(getKthLevel(root, 0));
        System.out.println(getKthLevel(root, 1));
        System.out.println(getKthLevel(root, 2));
        System.out.println(getKthLevel(root, 3));
        System.out.println(getKthLevel(root, 4));
        System.out.println(getKthLevel(root, 5));
        System.out.println("====================");
        System.out.println(contains(root,'a'));
        System.out.println(contains(root,'b'));
        System.out.println(contains(root,'c'));
        System.out.println(contains(root,'d'));
        System.out.println(contains(root,'e'));
        System.out.println(contains(root,'f'));
        System.out.println(contains(root,'g'));
        System.out.println("====================");
        System.out.println(nodeOf(root,'d'));
        TreeNode a = new TreeNode('a');
        System.out.println(containsNode(root,a));
    }
}
