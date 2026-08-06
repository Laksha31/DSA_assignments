import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day_41_590013237 {

    static Node front = null;
    static Node rear = null;

    static void enqueue(int value) {

        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    static void dequeue() {

        if (front == null) {
            System.out.println(-1);
            return;
        }

        System.out.println(front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("enqueue")) {

                int value = sc.nextInt();
                enqueue(value);

            } else if (operation.equals("dequeue")) {

                dequeue();
            }
        }

        sc.close();
    }
}