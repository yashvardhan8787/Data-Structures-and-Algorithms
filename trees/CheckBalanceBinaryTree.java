package trees;

public class CheckBalanceBinaryTree {

    public static int height(TreeNode node) {
        if (node == null) {
            return 0; // Base case: height of an empty tree is 0
        }

        // Recursively find the height of left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // The height of the current node is the maximum of the heights of its subtrees plus one
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
       if(root == null) {
            return true; // An empty tree is balanced
        }

        // Check the height of left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Check if the current node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false; // Current node is not balanced
        }

        // Recursively check the left and right subtrees
        return isBalanced(root.left) && isBalanced(root.right);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        boolean isBalanced = isBalanced(root);
        System.out.println("Is the binary tree balanced? " + isBalanced);  // Output: true
    }
}
