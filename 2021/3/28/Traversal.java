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
                System.out.printf("%c", cur.val);
                // 一直向左子树遍历
                cur = cur.left;
            }
            // 为空就去弹出栈顶元素，为上一次遍历的节点
            TreeNode pop = stack.pop();
            // 在开始从该节点的左子树进行遍历
            cur = pop.right;
        }
    }

    // 使用非递归实现二叉树的前序遍历
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
                // 输出遍历的内容
                // 一直向左子树遍历
                cur = cur.left;
            }
            // 为空就去弹出栈顶元素，为上一次遍历的节点
            TreeNode pop = stack.pop();

            System.out.printf("%c", cur.val);

            // 在开始从该节点的左子树进行遍历
            cur = pop.right;
        }
    }

    // 使用非递归实现二叉树的前序遍历
    public static void postorder(TreeNode root){
        // 栈用来保存遍历之前的路
        Stack<TreeNode> stack = new Stack<>();

        TreeNode last =null;

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
                // 一直向左子树遍历
                cur = cur.left;
            }
            // 为空就去弹出栈顶元素，为上一次遍历的节点
            TreeNode peek = stack.peek();
            if(peek.right == null || peek.right == last){
                last = peek;

                stack.pop();
            }else{
                // 在开始从该节点的左子树进行遍历
                cur = peek.right;
            }
        }
    }
}
