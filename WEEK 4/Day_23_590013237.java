import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day_23_590013237 {
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

        Node dummy = new Node(0);
        Node temp = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        if (head1 != null) {
            temp.next = head1;
        }

        if (head2 != null) {
            temp.next = head2;
        }

        temp = dummy.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}