import java.util.Scanner;
import java.util.ArrayDeque;

public class Day_38_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("push_front")) {

                int value = sc.nextInt();
                deque.addFirst(value);

            } else if (operation.equals("push_back")) {

                int value = sc.nextInt();
                deque.addLast(value);

            } else if (operation.equals("pop_front")) {

                if (!deque.isEmpty()) {
                    deque.removeFirst();
                }

            } else if (operation.equals("pop_back")) {

                if (!deque.isEmpty()) {
                    deque.removeLast();
                }

            } else if (operation.equals("front")) {

                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }

            } else if (operation.equals("back")) {

                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }

            } else if (operation.equals("size")) {

                System.out.println(deque.size());

            } else if (operation.equals("empty")) {

                System.out.println(deque.isEmpty());

            } else if (operation.equals("clear")) {

                deque.clear();
            }
        }

        while (!deque.isEmpty()) {
            System.out.print(deque.removeFirst() + " ");
        }

        sc.close();
    }
}