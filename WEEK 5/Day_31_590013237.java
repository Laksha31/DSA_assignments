import java.util.Scanner;

public class Day_31_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] stack = new int[100];
        int top = -1;

        for (int i = 0; i < n; i++) {

            int choice = sc.nextInt();

            if (choice == 1) {

                int value = sc.nextInt();
                top++;
                stack[top] = value;

            } else if (choice == 2) {

                if (top == -1) {
                    System.out.println("Stack Underflow");
                } else {
                    System.out.println(stack[top]);
                    top--;
                }

            } else if (choice == 3) {

                if (top == -1) {
                    System.out.println("Stack Underflow");
                } else {

                    for (int j = top; j >= 0; j--) {
                        System.out.print(stack[j] + " ");
                    }

                    System.out.println();
                }
            }
        }

        sc.close();
    }
}