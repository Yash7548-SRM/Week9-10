import java.util.*;

class IllegalArgumentDemo {
    static void handle(String s) {
        try {
            s.substring(5, 2);
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