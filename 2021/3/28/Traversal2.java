import java.util.Stack;

public class Traversal {
    public static void preorder(TreeNode root) {
        TreeNode cur;
        Stack<TreeNode> stack = new Stack<>();

        cur = root;
        // stack.isEmpty()  开始 OR 结束
        // cur == null 完成过一次一路向左
        while (cur != null || !stack.isEmpty()) {
            // 有多少次一路朝左走

            while (cur != null) {
                // 一路朝左走
                stack.push(cur);
                System.out.println((char)cur.val);
                cur = cur.left;
            }

            TreeNode pop = stack.pop();
            cur = pop.right;
        }
    }
    public static void inorder(TreeNode root) {
        TreeNode cur;
        Stack<TreeNode> stack = new Stack<>();

        cur = root;
        // stack.isEmpty()  开始 OR 结束
        // cur == null 完成过一次一路向左
        while (cur != null || !stack.isEmpty()) {
            // 有多少次一路朝左走

            while (cur != null) {
                // 一路朝左走
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode pop = stack.pop();
            System.out.println((char)pop.val);
            cur = pop.right;
        }
    }


    public static void postorder(TreeNode root) {
        TreeNode cur;
        TreeNode last = null;   // 上一次后序遍历经过的结点
        Stack<TreeNode> stack = new Stack<>();

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
            if (pop.right == null || pop.right == last) {
                // 看作第三次经过
                System.out.println((char)pop.val);
                last = pop;
                stack.pop();
            } else {
                // 第二次经过
                cur = pop.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root;
        root = BuildTree.buildTree2();
        postorder(root);
    }
}
