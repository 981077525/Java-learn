package Tree;

public class TreeNode {
    public int  val;

    public TreeNode left;
    public TreeNode right;

    public TreeNode(int  val){
        this.val = val;
    }

    @Override
    public String toString() {
        // 将输入的整型，格式化打印为字符
        return String.format("TreeNode{%c}",val);
    }
}
