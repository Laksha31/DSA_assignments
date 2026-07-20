import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day_24_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int key = sc.nextInt();

        while (head != null && head.data == key) {
            head = head.next;
        }

        Node current = head;

        while (current != null && current.next != null) {

            if (current.next.data == key) {
                current.next = current.next.next;
                break;
            }

            current = current.next;
        }

        current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sc.close();
    }
}