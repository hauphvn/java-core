package algorithsm;


public class trees {

//    class Node {
//        int key;
//        Node left, right;
//
//        public Node(int key) {
//            this.key = key;
//            left = right = null;
//        }
//    }

    Node root;

    public trees(int key) {
        root = new Node(key);
    }

    public trees() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    void inorder() {
        inorderRec(root);
    }

    void postorder() {
        postorderRec(root);
    }

    void preorder() {
        preorderRec(root);
    }

    Node search( int data) {
//        Node current = root;
//        if (current == null || root.getKey() == data) {
//            return current;
//        }
//        while(current.getKey())
        return null;
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.getKey() + " ");
            preorderRec(root.getLeft());
            preorderRec(root.getRight());
        }
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.getLeft());
            postorderRec(root.getRight());
            System.out.print(root.getKey() + " ");
        }
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getKey() + " ");
            inorderRec(root.getRight());
        }
    }

    private Node insertRec(Node root, int key) {
        if (root != null) {
            if (key < root.getKey()) {
                root.setLeft(insertRec(root.getLeft(), key));
            } else if (key > root.getKey()) {
                root.setRight(insertRec(root.getRight(), key));
            }
            return root;
        } else {
            root = new Node(key);
            return root;
        }
    }
}
