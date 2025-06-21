package trees;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversal {

    //explain the below code.
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // Poll the front node from the queue
            TreeNode current = queue.poll();
            // Process the current node (in this case, print its data)
            System.out.print(current.data + " ");

            // Add the left and right children of the current node to the queue
            if (current.left != null) {
                // Add the left child of the current node to the queue
                queue.add(current.left);
            }

            // Add the right child of the current node to the queue
            if (current.right != null) {
                // Add the right child of the current node to the queue
                queue.add(current.right);
            }
        }
    }


    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Level Order Traversal of the binary tree:");
        levelOrderTraversal(root);  // Output: 1 2 3 4 5
    }
}
