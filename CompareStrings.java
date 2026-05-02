import java.util.*;

class CompareStrings {
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean r1 = compare(a, b);
        boolean r2 = a.equals(b);
        System.out.println(r1 == r2);
    }
}