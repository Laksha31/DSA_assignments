import java.util.*;

class Day_44_590013237 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Inorder: Left -> Root -> Right
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder: Root -> Left -> Right
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left -> Right -> Root
    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Create tree using level order
        if (N == 0 || arr[0] == -1) {
            return;
        }

        Node[] nodes = new Node[N];

        for (int i = 0; i < N; i++) {
            if (arr[i] != -1) {
                nodes[i] = new Node(arr[i]);
            }
        }

        // Connect left and right children
        for (int i = 0; i < N; i++) {
            if (nodes[i] != null) {

                int left = 2 * i + 1;
                int right = 2 * i + 2;

                if (left < N) {
                    nodes[i].left = nodes[left];
                }

                if (right < N) {
                    nodes[i].right = nodes[right];
                }
            }
        }

        Node root = nodes[0];

        // Print traversals
        inorder(root);
        System.out.println();

        preorder(root);
        System.out.println();

        postorder(root);
        System.out.println();
    }
}