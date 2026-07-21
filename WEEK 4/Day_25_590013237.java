import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day_25_590013237 {
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

        int count = 0;

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                count++;
            }

            temp = temp.next;
        }

        System.out.println(count);

        sc.close();
    }
}