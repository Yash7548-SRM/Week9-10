import java.util.*;

class ArrayIndexDemo {
    static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length + 1]);
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        handle(arr);
    }
}