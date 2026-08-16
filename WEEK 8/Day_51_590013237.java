import java.util.*;

class Day_51_590013237 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    static int findLCA(Node root, int p, int q) {
        while (root != null) {
            if (p < root.data && q < root.data) {
                root = root.left;
            } else if (p > root.data && q > root.data) {
                root = root.right;
            } else {
                return root.data;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println(findLCA(root, p, q));
    }
}