import java.util.*;

class Day_49_590013237 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Node root = null;

        // Create BST
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            root = insert(root, value);
        }

        // Value to insert
        int value = sc.nextInt();

        root = insert(root, value);

        // Print BST in sorted order
        inorder(root);
    }
}