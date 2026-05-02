import java.util.*;

class NumberFormatDemo {
    static void handle(String s) {
        try {
            Integer.parseInt(s);
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