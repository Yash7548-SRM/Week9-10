import java.util.*;

class StringIndexDemo {
    static void handle(String s) {
        try {
            s.charAt(s.length() + 1);
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        handle(s);
    }
}