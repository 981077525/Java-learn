package Tree;

public class TreeTraversal {
    // 左序遍历
    public static void preorder(TreeNode root){
        if(root == null){
            return;
        }

        System.out.printf("%c ",root.val);

        preorder(root.left);
        preorder(root.right);
    }

    // 中序遍历
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.printf("%c ",root.val);
        inorder(root.right);
    }

    // 右序遍历
    public static void postorder(TreeNode root){
        if(root == null){
            return ;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.printf("%c ",root.val);
    }
    // 使用汇集的思想据计算树的节点数
    /*
    *   思路：
    *       一个树的总结点数 = 根结点数  +  左子树结点数  + 右子树结点数
    * */
    public static int countTreeNode(TreeNode root){
        if(root == null){
            return 0;
        }

        return (1 + countTreeNode(root.left) + countTreeNode(root.right));

    }

    // 使用遍历的思想计算一个树的结点树

    // 每次使用之前请将count初始化为 0
    public static int count;
    public static int countTreeNode2(TreeNode root){
        if(root == null){
            return 0;
        }
        count++;
        countTreeNode2(root.right);
        countTreeNode2(root.left);
        return count;
    }

    // 求叶子树节点的个数
    // 1.遍历
    public static int countLeaf = 0;
    public static int countLeafNodeSize(TreeNode root){
        if(root == null){
            return 0;
        }

        if(root.left == null &&  root.right == null){
            countLeaf++;
        }
        countLeafNodeSize(root.left);
        countLeafNodeSize(root.right);
        return countLeaf;
    }
    // 使用汇集的思想计算叶子节点的个数
    public static int countLeafNodeSize2(TreeNode root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        return  countLeafNodeSize2(root.left) + countLeafNodeSize2(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
//        preorder(root);
//        inorder(root);
        postorder(root);
        System.out.println("\n" + countTreeNode(root));
        System.out.println(countLeafNodeSize(root));
        System.out.println(countLeafNodeSize2(root));

    }
}
