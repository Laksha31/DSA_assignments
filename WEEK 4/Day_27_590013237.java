import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day_27_590013237 {

    static int length(Node head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head1 = null;
        Node tail1 = null;

        for (int i = 0; i < n; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        int m = sc.nextInt();

        Node head2 = null;
        Node tail2 = null;

        for (int i = 0; i < m; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        int len1 = length(head1);
        int len2 = length(head2);

        while (len1 > len2) {
            head1 = head1.next;
            len1--;
        }

        while (len2 > len1) {
            head2 = head2.next;
            len2--;
        }

        while (head1 != null && head2 != null) {

            if (head1.data == head2.data) {
                System.out.println(head1.data);
                sc.close();
                return;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        System.out.println("No Intersection");

        sc.close();
    }
}