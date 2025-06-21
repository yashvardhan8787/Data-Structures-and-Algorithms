package trees;

import java.util.List;
import java.util.Stack;

class node {
    int data;
    node left;
    node right;

    public node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class IterativePreOrderTraversal {
    public List<Integer> preOrderTraversal(node root) {
        List<Integer> preOrderList = new java.util.ArrayList<>();
        if (root == null) {
            return preOrderList;
        }

        Stack<node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            preOrderList.add(root.data);
            // Push right child first so that left child is processed first
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return preOrderList;
    }

    public static void main(String[] args) {
        IterativePreOrderTraversal tree = new IterativePreOrderTraversal();
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);

        List<Integer> preOrderList = tree.preOrderTraversal(root);
        System.out.println("Pre-order Traversal: " + preOrderList);  // Output: [1, 2, 4, 5, 3]
    }
}
