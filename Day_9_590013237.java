import java.util.Scanner;

public class Day_9_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        System.out.println(ch);

        sc.close();
    }
}