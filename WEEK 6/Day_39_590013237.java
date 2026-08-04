import java.util.Scanner;

public class Day_39_590013237 {

    static int[] heap = new int[100];
    static int size = 0;

    static void insert(int value) {

        heap[size] = value;
        int current = size;
        size++;

        while (current > 0) {

            int parent = (current - 1) / 2;

            if (heap[parent] > heap[current]) {

                int temp = heap[parent];
                heap[parent] = heap[current];
                heap[current] = temp;

                current = parent;

            } else {
                break;
            }
        }
    }

    static int extractMin() {

        if (size == 0) {
            return -1;
        }

        int min = heap[0];

        heap[0] = heap[size - 1];
        size--;

        int current = 0;

        while (true) {

            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int smallest = current;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != current) {

                int temp = heap[current];
                heap[current] = heap[smallest];
                heap[smallest] = temp;

                current = smallest;

            } else {
                break;
            }
        }

        return min;
    }

    static int peek() {

        if (size == 0) {
            return -1;
        }

        return heap[0];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("insert")) {

                int value = sc.nextInt();
                insert(value);

            } else if (operation.equals("extractMin")) {

                System.out.println(extractMin());

            } else if (operation.equals("peek")) {

                System.out.println(peek());
            }
        }

        sc.close();
    }
}