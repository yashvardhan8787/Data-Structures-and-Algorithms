package trees;
class Node{
    public Node(int Data , Node left , Node right){
         this. data=Data;
         this.left= left;
         this.right=right;
    }
    int data;
    Node left;
    Node right;
}
class BinaryTree {
    Node root;

    public void addElement(Node element) {
        root = addRecursive(root, element);
    }

    private Node addRecursive(Node current, Node element) {
        if (current == null) {
            return element;
        }
        if (element.data < current.data) {
            current.left = addRecursive(current.left, element);
        } else if (element.data > current.data) {
            current.right = addRecursive(current.right, element);
        }
        // if equal, do not insert duplicates
        return current;
    }

    // Optional: In-order traversal for testing
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addElement(new Node(5, null, null));
        tree.addElement(new Node(3, null, null));
        tree.addElement(new Node(7, null, null));
        tree.inOrder(tree.root); // Output: 3 5 7
    }
}
