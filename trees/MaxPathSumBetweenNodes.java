package trees;

public class MaxPathSumBetweenNodes {

    // Helper to find LCA
    public TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null) return null;
        if (root == a || root == b) return root;

        TreeNode left = findLCA(root.left, a, b);
        TreeNode right = findLCA(root.right, a, b);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }

    // Helper to find max path sum from root to target node
    public boolean findPathSum(TreeNode root, TreeNode target, int[] sum) {
        if (root == null) return false;

        if (root == target) {
            sum[0] += root.data;
            return true;
        }

        sum[0] += root.data;

        if (findPathSum(root.left, target, sum) || findPathSum(root.right, target, sum)) {
            return true;
        }

        sum[0] -= root.data; // Backtrack
        return false;
    }

    public int maxPathSum(TreeNode root, TreeNode firstNode, TreeNode secondNode) {
        TreeNode lca = findLCA(root, firstNode, secondNode);

        int[] sum1 = new int[1];
        int[] sum2 = new int[1];

        findPathSum(lca, firstNode, sum1);
        findPathSum(lca, secondNode, sum2);

        // Subtract LCA value once (as it is included in both paths)
        return sum1[0] + sum2[0] - lca.data;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        MaxPathSumBetweenNodes solution = new MaxPathSumBetweenNodes();
        TreeNode firstNode = root.left.left; // Node 4
        TreeNode secondNode = root.right.right; // Node 7
        int maxSum = solution.maxPathSum(root, firstNode, secondNode);
        System.out.println("Maximum Path Sum Between Nodes: " + maxSum);
    }
}
