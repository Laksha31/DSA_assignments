import java.util.Scanner;

public class Day_36_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] queue = new int[n];

        int front = 0;
        int rear = -1;

        for (int i = 0; i < n; i++) {
            rear = (rear + 1) % n;
            queue[rear] = sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            front = (front + 1) % n;
        }

        int count = 0;
        int index = front;

        while (count < n) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % n;
            count++;
        }

        sc.close();
    }
}