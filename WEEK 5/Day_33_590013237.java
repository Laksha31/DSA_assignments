import java.util.Scanner;
import java.util.Stack;

public class Day_33_590013237 {

    static int priority(char ch) {

        if (ch == '+' || ch == '-') {
            return 1;
        }

        if (ch == '*' || ch == '/') {
            return 2;
        }

        if (ch == '^') {
            return 3;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String exp = sc.next();

        Stack<Character> stack = new Stack<>();

        String postfix = "";

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {

                postfix = postfix + ch;

            } else {

                while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                    postfix = postfix + stack.pop();
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
        }

        System.out.println(postfix);

        sc.close();
    }
}