package trees;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

// Class representing a node in the binary tree
class BtNode {
    int data;
    BtNode left;
    BtNode right;

    public BtNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class IterativeInorderTraversal {

    // Method to perform iterative in-order traversal
    public List<Integer> inOrderTraversal(BtNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        Stack<BtNode> stack = new Stack<>();
        BtNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // Current must be null at this point, so we pop from the stack
            current = stack.pop();
            inOrderList.add(current.data);  // Add the node's data to the list
            // Now, we need to visit the right subtree
            current = current.right;
        }
        return inOrderList;
    }

    public static void main(String[] args) {
        IterativeInorderTraversal tree = new IterativeInorderTraversal();
        BtNode root = new BtNode(1);
        root.left = new BtNode(2);
        root.right = new BtNode(3);
        root.left.left = new BtNode(4);
        root.left.right = new BtNode(5);

        List<Integer> inOrderList = tree.inOrderTraversal(root);
        System.out.println("In-order Traversal: " + inOrderList);  // Output: [4, 2, 5, 1, 3]
    }
}
