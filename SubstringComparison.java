import java.util.*;

class SubstringComparison {
    static String sub(String s, int start, int end) {
        String r = "";
        for (int i = start; i < end; i++) {
            r += s.charAt(i);
        }
        return r;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String r1 = sub(s, start, end);
        String r2 = s.substring(start, end);
        System.out.println(compare(r1, r2));
    }
}