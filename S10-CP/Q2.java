import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();

        System.out.println(reverse);

        if (s.equals(reverse)) {
            System.out.println(s + " - palindrome");
        } else {
            System.out.println(s + " - not a palindrome");
        }
    }
}
