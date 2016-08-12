import java.util.ArrayList;
import java.util.List;

/**
 * Created by nlfox on 16-8-13.
 */
public class _94_Binary_Tree_Inorder_Traversal {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<Integer> res;

    public List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<Integer>();
        if (root != null) {
            in(root);
        } else {
            return res;
        }
        return res;
    }

    private void in(TreeNode node) {

        System.out.println(node.val);
        if (node.left != null) {
            in(node.left);
        }
        res.add(node.val);
        if (node.right != null) {
            in(node.right);
        }
    }
}
