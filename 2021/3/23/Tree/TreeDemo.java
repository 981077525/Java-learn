package Tree;

import sun.reflect.generics.tree.Tree;

public class TreeDemo {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);

        TreeNode a = new TreeNode('a');
        TreeNode b = new TreeNode('b');
        TreeNode c = new TreeNode('c');
        TreeNode d = new TreeNode('d');
        TreeNode e = new TreeNode('e');
        TreeNode f = new TreeNode('f');


        root.left = a;
        a.left = b; a.right = c;

        b.left = d;

        c.left = e; c.right = f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println(root);

    }
}
