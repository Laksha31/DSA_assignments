import java.util.Scanner;

public class Day_35_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] queue = new int[n];

        int front = 0;
        int rear = -1;

        for (int i = 0; i < n; i++) {
            rear++;
            queue[rear] = sc.nextInt();
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        sc.close();
    }
}