package leetcode;

import java.util.Stack;

public class Traversal {

    // 使用非递归实现二叉树的前序遍历
    public static void preorder(TreeNode root){
        // 栈用来保存遍历之前的路
        Stack<TreeNode> stack = new Stack<>();
        // 开始从根处走
        // 若为空树，则为 null
        TreeNode cur = root;
        // 当 cur 不为空 或者栈不为空
        while(cur != null || !stack.isEmpty()) {
            // 将 cur 的 left 一直进行遍历，如果为空时，则不在继续遍历
            while (cur != null) {
                // 记录遍历的过程
                stack.push(cur);
                // 输出遍历的内容
                System.out.printf("%c ", cur.val);
                // 一直向左子树遍历
                cur = cur.left;
            }
            // 为空就去弹出栈顶元素，为上一次遍历的节点
            TreeNode pop = stack.pop();
            // 在开始从该节点的左子树进行遍历
            cur = pop.right;
        }
        System.out.println();
    }

    // 使用非递归实现二叉树的中序遍历
    // 中序遍历 ： 左根右  的顺序遍历
    public static void inorder(TreeNode root){

        // 栈用来保存遍历之前的路
        Stack<TreeNode> stack = new Stack<>();
        // 开始从根处走
        // 若为空树，则为 null
        TreeNode cur = root;
        // 当 cur 不为空 或者栈不为空
        while(cur != null || !stack.isEmpty()) {
            // 将 cur 的 left 一直进行遍历，如果为空时，则不在继续遍历
            while (cur != null) {
                // 记录遍历的过程
                stack.push(cur);
                // 一直向左子树遍历
                cur = cur.left;
            }

            // 为空就去弹出栈顶元素，为上一次遍历的节点
            TreeNode pop = stack.pop();
            // 输出遍历信息
            System.out.printf("%c ", pop.val);
            // 在开始从该节点的右子树进行遍历
            cur = pop.right;
        }
        System.out.println();
    }

    // 使用非递归实现二叉树的后序遍历
    // 后序遍历 ： 左右根 的顺序进行遍历
    public static void postorder(TreeNode root) {
        TreeNode cur;
        TreeNode last = null;   // 上一次后序遍历经过的结点
        Stack<TreeNode> stack = new Stack<>();

        int height = -1;

        cur = root;
        // stack.isEmpty()  开始 OR 结束
        // cur == null 完成过一次一路向左
        while (cur != null || !stack.isEmpty()) {
            // 有多少次一路朝左走

            while (cur != null) {
                // 一路朝左走，第一次经过
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode pop = stack.peek();
            height = Integer.max(height, stack.size());
            if (pop.right == null || pop.right == last) {
                // 看作第三次经过
                System.out.printf("%c ",pop.val);
                last = pop;
                stack.pop();
            } else {
                // 第二次经过
                cur = pop.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();

        preorder(root);
        inorder(root);
        postorder(root);
    }
}
