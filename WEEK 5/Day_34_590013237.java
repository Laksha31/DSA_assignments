import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day_34_590013237 {

    static Node top = null;

    static void push(int value) {

        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
    }

    static int pop() {

        int value = top.data;
        top = top.next;
        return value;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String exp = sc.nextLine();

        String[] tokens = exp.split(" ");

        for (int i = 0; i < tokens.length; i++) {

            String s = tokens[i];

            if (s.equals("+")) {

                int b = pop();
                int a = pop();
                push(a + b);

            } else if (s.equals("-")) {

                int b = pop();
                int a = pop();
                push(a - b);

            } else if (s.equals("*")) {

                int b = pop();
                int a = pop();
                push(a * b);

            } else if (s.equals("/")) {

                int b = pop();
                int a = pop();
                push(a / b);

            } else {

                push(Integer.parseInt(s));
            }
        }

        System.out.println(pop());

        sc.close();
    }
}