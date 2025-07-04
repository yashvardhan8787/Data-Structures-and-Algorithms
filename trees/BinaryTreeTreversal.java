package trees;

//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data, Node left, Node right) {
//        this.data = data;
//        this.left = left;
//        this.right = right;
//    }
//}

class BinaryTreeTreversal {
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
        return current;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }


    public static void main(String[] args) {
        BinaryTreeTreversal tree = new BinaryTreeTreversal();
//          tree.addElement(new Node(5, null, null));
//          tree.addElement(new Node(3, null, null));
//          tree.addElement(new Node(7, null, null));
//          System.out.println("In-order Traversal:");
//          tree.inOrder(tree.root); // Output: 3 5 7
//          System.out.println("\nPre-order Traversal:");
//          tree.preOrder(tree.root); // Output: 5 3 7
//          System.out.println("\nPost-order Traversal:");
//          tree.postOrder(tree.root); // Output: 3 7 5
//     }

    }
}
