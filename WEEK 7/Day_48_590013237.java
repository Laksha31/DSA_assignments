import java.util.*;

class Day_48_590013237 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }

        // If node has no children, it is a leaf
        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        if (N == 0 || arr[0] == -1) {
            System.out.println(0);
            return;
        }

        Node[] nodes = new Node[N];

        // Create nodes
        for (int i = 0; i < N; i++) {
            if (arr[i] != -1) {
                nodes[i] = new Node(arr[i]);
            }
        }

        // Connect nodes
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

        System.out.println(countLeaves(root));
    }
}