import java.util.ArrayList;
import java.util.List;

/**
 * Created by nlfox on 16-8-13.
 */

public class _144_Binary_Tree_Preorder_Traversal {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<Integer> res;

    public List<Integer> preorderTraversal(TreeNode root) {
        res = new ArrayList<Integer>();
        if (root != null) {
            pre(root);
        } else {
            return res;
        }
        return res;
    }

    private void pre(TreeNode node) {
        res.add(node.val);
        System.out.println(node.val);
        if (node.left != null) {
            pre(node.left);
        }
        if (node.right != null) {
            pre(node.right);
        }
    }
}
