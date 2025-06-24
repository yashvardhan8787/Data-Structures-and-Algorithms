package trees;

public class MaxDistanceBetweenTwoNodes {
    // Maximum difference between two given nodes in binary tree .

    public static int getHeight(TreeNode node) {
        if (node == null) {
            return 0; // Base case: if the node is null, height is 0
        }
        // Recursively find the height of left and right subtrees
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
    public static int maxDistance(TreeNode root) {
        if (root == null) {
            return 0; // Base case: if the node is null, distance is 0
        }

        // Get the maximum distance in the left and right subtrees
        int leftDistance = maxDistance(root.left);
        int rightDistance = maxDistance(root.right);

        // Calculate the distance between the current node and its leftmost and rightmost nodes
        int currentDistance = getHeight(root.left) + getHeight(root.right) + 1;

        // Return the maximum of the three distances
        return Math.max(currentDistance, Math.max(leftDistance, rightDistance));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int maxDist = maxDistance(root);
        System.out.println("Maximum Distance Between Two Nodes: " + maxDist); // Output: 4
    }
}
