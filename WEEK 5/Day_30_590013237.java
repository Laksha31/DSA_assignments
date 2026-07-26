import java.util.Scanner;

class Node {
    int coeff;
    int exp;
    Node next;

    Node(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
        this.next = null;
    }
}

public class Day_30_590013237 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create Linked List
        for (int i = 0; i < n; i++) {

            int coeff = sc.nextInt();
            int exp = sc.nextInt();

            Node newNode = new Node(coeff, exp);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Print Polynomial
        Node temp = head;

        while (temp != null) {

            if (temp.exp > 1) {
                System.out.print(temp.coeff + "x^" + temp.exp);
            }
            else if (temp.exp == 1) {
                System.out.print(temp.coeff + "x");
            }
            else {
                System.out.print(temp.coeff);
            }

            if (temp.next != null) {
                System.out.print(" + ");
            }

            temp = temp.next;
        }

        sc.close();
    }
}